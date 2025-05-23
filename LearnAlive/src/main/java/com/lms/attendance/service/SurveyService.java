package com.lms.attendance.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lms.attendance.model.Survey;
import com.lms.attendance.model.SurveyBoard;
import com.lms.attendance.model.SurveyQuestion;
import com.lms.attendance.model.SurveyResponse;
import com.lms.attendance.repository.SurveyMapper;

@Service
public class SurveyService {
    private final SurveyMapper surveyMapper;
    private final ObjectMapper objectMapper = new ObjectMapper(); // ✅ JSON 변환용 객체

    public SurveyService(SurveyMapper surveyMapper) {
        this.surveyMapper = surveyMapper;
    }

    /** ✅ 특정 강의실의 설문조사 게시판 목록 조회 */
    public List<SurveyBoard> getSurveyBoardsByClassId(int classId) {
        return surveyMapper.findSurveyBoardsByClassId(classId);
    }

    
    /** ✅ 설문조사 게시판 생성 */
    public SurveyBoard createSurveyBoard(int classId) {
        surveyMapper.createSurveyBoard(classId);
        return surveyMapper.getSurveyBoardByClassId(classId);
    }

    /** ✅ 특정 강의실의 단일 설문조사 게시판 조회 */
    public SurveyBoard getSurveyBoardByClassId(int classId) {
        return surveyMapper.getSurveyBoardByClassId(classId);
    }

    /** ✅ 특정 게시판의 설문조사 목록 조회 */
    public List<Survey> getSurveysByBoard(int boardId) {
        return surveyMapper.getSurveysByBoard(boardId);
    }

    /** ✅ 설문조사 + 질문을 한 번에 저장 (트랜잭션 적용) */

    @Transactional
    public Survey createSurveyWithQuestions(Survey survey) {
        surveyMapper.insertSurvey(survey);
        ObjectMapper objectMapper = new ObjectMapper(); // ✅ Jackson 사용

        for (SurveyQuestion question : survey.getQuestions()) {
            question.setSurveyId(survey.getSurveyId());

            Boolean isRequired = question.getIsRequired(); // ✅ 필수 여부 추가

            if ("radio".equals(question.getQuestionType()) || "checkbox".equals(question.getQuestionType())) {
                try {
                    // ✅ 객관식 문제의 경우 options을 JSON 배열 형태로 변환
                    String jsonOptions = objectMapper.writeValueAsString(question.getOptions());

                    surveyMapper.insertSurveyQuestion(
                        question.getSurveyId(),
                        question.getQuestionText(),
                        question.getQuestionType(),
                        jsonOptions,  // JSON 배열로 변환된 선택지 값
                        "checkbox".equals(question.getQuestionType()) ? question.getMinSelect() : null,
                        "checkbox".equals(question.getQuestionType()) ? question.getMaxSelect() : null,
                        null,  // ✅ 객관식에는 minValue 사용 안 함
                        null,  // ✅ 객관식에는 maxValue 사용 안 함
                        null,  // ✅ 객관식에는 minLabel 사용 안 함
                        null,  // ✅ 객관식에는 maxLabel 사용 안 함
                        isRequired // ✅ 필수 여부 반영
                    );
                } catch (Exception e) {
                    throw new RuntimeException("객관식 질문 옵션을 JSON으로 변환하는 중 오류 발생", e);
                }
            } 
            else if ("linear_scale".equals(question.getQuestionType())) {
                // ✅ 선형 배율일 경우 min/max 값과 라벨을 저장
                surveyMapper.insertSurveyQuestion(
                    question.getSurveyId(),
                    question.getQuestionText(),
                    question.getQuestionType(),
                    null,  // ✅ 선형 배율은 options 없음
                    null,  // ✅ 선형 배율은 minSelect 없음
                    null,  // ✅ 선형 배율은 maxSelect 없음
                    question.getMinValue(),  // ✅ 최소값 저장
                    question.getMaxValue(),  // ✅ 최대값 저장
                    question.getMinLabel(),  // ✅ 최소 라벨 저장
                    question.getMaxLabel(),  // ✅ 최대 라벨 저장
                    isRequired // ✅ 필수 여부 반영
                );
            } 
            else {
                // ✅ 서술형 문제의 경우 options/min/max 없이 저장
                surveyMapper.insertSurveyQuestion(
                    question.getSurveyId(),
                    question.getQuestionText(),
                    question.getQuestionType(),
                    null,  // ✅ 서술형 문제이므로 options 없음
                    null,  // ✅ 서술형 문제이므로 minSelect 없음
                    null,  // ✅ 서술형 문제이므로 maxSelect 없음
                    null,  // ✅ 서술형 문제이므로 minValue 없음
                    null,  // ✅ 서술형 문제이므로 maxValue 없음
                    null,  // ✅ 서술형 문제이므로 minLabel 없음
                    null,  // ✅ 서술형 문제이므로 maxLabel 없음
                    isRequired // ✅ 필수 여부 반영
                );
            }
        }
        return survey;
    }


    /** ✅ 설문 상세 조회 (질문 포함) */
    public Survey getSurveyDetail(int surveyId) {
        Survey survey = surveyMapper.getSurveyById(surveyId);
        if (survey != null) {
            List<SurveyQuestion> questions = surveyMapper.getQuestionsBySurveyId(surveyId);
            survey.setQuestions(questions);
        }
        return survey;
    }
    
    //설문 시간 업데이트
    public boolean updateSurveyTimes(Long surveyId, String newStartTime, String newEndTime) {
        int updatedRows = surveyMapper.updateSurveyTimes(surveyId, newStartTime, newEndTime);
        return updatedRows > 0;
    }
    
    //설문 조사 삭제 (survey_post)
    public boolean deleteSurvey(Integer surveyId) {
        int deletedRows = surveyMapper.deleteSurvey(surveyId);
        return deletedRows > 0;
    }
    
    @Transactional
    public boolean updateSurveyWithQuestions(Survey updatedSurvey) {
        int surveyId = updatedSurvey.getSurveyId();
        // 1. survey_post 테이블 업데이트
        int updatedCount = surveyMapper.updateSurvey(surveyId,
                updatedSurvey.getTitle(),
                updatedSurvey.getStartTime(),
                updatedSurvey.getEndTime());
        if (updatedCount < 1) return false;
        
     // 1-1. 기존 응답 삭제 (설문이 수정된 경우 기존 응답 보존 필요 없음)
        surveyMapper.deleteSurveyResponses(surveyId);
        
        // 2. 기존 질문 삭제
        surveyMapper.deleteSurveyQuestions(surveyId);
        
        // 3. 새로운 질문 삽입
        if (updatedSurvey.getQuestions() != null) {
            for (SurveyQuestion question : updatedSurvey.getQuestions()) {
                question.setSurveyId(surveyId);  // 설문 ID 설정
                surveyMapper.insertSurveyQuestion(
                    question.getSurveyId(),
                    question.getQuestionText(),
                    question.getQuestionType(),
                    question.getOptions(),
                    question.getMinSelect(),
                    question.getMaxSelect(),
                    question.getMinValue(),
                    question.getMaxValue(),
                    question.getMinLabel(),
                    question.getMaxLabel(),
                    question.getIsRequired()
                );
            }
        }
        return true;
    }
}
