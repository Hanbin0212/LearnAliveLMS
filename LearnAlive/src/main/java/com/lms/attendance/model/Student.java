package com.lms.attendance.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private String studentId;  // 학생 ID (Primary Key)
    private String university; // 대학
    private String department; // 학과
    private String name;       // 이름
    private String phone;
    private String email;      // 이메일
    private String password;   // 비밀번호 추가
    private String remarks; //  추가된 비고(remarks) 컬럼
    private Integer classId;
    private String contact;
}
