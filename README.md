# 모두를 위한 학사 관리 시스템 "LearnAliveLMS"

## 📌 프로젝트 소개
LearnAliveLMS는 기존에 한국에서 사용하는 학사시스템의 단점들을 보완한 학사시스템 입니다.</br>
[관리자,교수자,학습자]의 역할별 권한에 따른 기능들을 효과적으로 관리하고 사용할 수 있게 설계되었습니다.

<img width="700" alt="스크린샷 2025-03-29 오후 11 49 03" src="https://github.com/user-attachments/assets/905bba32-d5f1-4220-8893-6f53f9d37526" />
</br></br>

---

## **🔑 담당 주요 기능**
### ✅ 로그인 세션 관리
- **관리자, 교수자, 학습자 역할별 로그인 및 세션 관리**
- **BCrypt를 이용한 ID/PW 찾기 기능**
- **회원정보 찾기 및 재설정 기능**

### **🛠 관리자 기능**
- **교수자 관리** : 교수자 추가, 수정, 삭제 기능 구현
- **공지사항 관리** : 공지사항 생성, 수정, 삭제 기능 구현
- **대학/학과 관리** : 단과대학/학과 생성, 수정, 삭제 기능 구현 

### ✅ 교수자 권한
- **팀활동 현황** : 각 조별과제 과정 현황을 나타낼 수 있는 '마일스톤' 관리기능
- **팀 동료평가** : 조별과제 진행 중 동료평가 기능 구현 (구현중)

</br></br>

---

</br></br>


## **💻 프로젝트 주요 화면**

### 📌 첫 화면 (Admin,Professor,Student) 계정으로 로그인
- **Header**: **[로그인 전]** -> `로그인` `회원정보찾기` `회원가입`   </br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;**[로그인 후]** -> `교수자 관리` `대학/학과 관리`
- **Body**: `공지사항 관리` `내 강의실`
</br>


<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/91baacf6-9e4d-4446-ad89-1a162766c5a4" width="700"></td>
    <td><img src="https://github.com/user-attachments/assets/85197850-f5e7-4fc7-9e17-29e552690d19" width="700"></td>
    <td><img src="https://github.com/user-attachments/assets/c2926ed2-d3b0-4c02-af03-e3944c94e077" width="700"></td>
  </tr>
</table>

</br>

---

</br>

## 교수자 생성/수정/삭제


<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/95a08c16-79c1-449f-96be-a5f196549ed0" width="600" alt="교수자 관리 생성"></td>
    <td><img src="https://github.com/user-attachments/assets/9b7ae159-8f52-4afe-ac6d-32267df47537" width="600" alt="교수자 관리 수정/삭제"></td>
  </tr>
</table>








## 📢 공지사항 관리

### 📝 공지사항 생성
공지사항 관리 페이지에서 새로운 공지사항을 생성할 수 있습니다. 생성된 공지사항은 메인 화면에 즉시 반영됩니다.

![공지사항 생성](https://github.com/user-attachments/assets/c6c85066-13ce-4641-9432-b7829a2a6cea)


### 🛠 공지사항 수정
공지사항을 수정하고 `수정` 버튼 클릭 시 변경 사항이 반영됩니다.

![공지사항 수정](https://github.com/user-attachments/assets/efa4d3bd-9630-45de-a8aa-6e46cbc79cfc)

### 🗑 공지사항 삭제
공지사항을 선택 후 `삭제` 버튼 클릭 시 해당 공지사항이 삭제됩니다.
![공지사항 삭제](https://github.com/user-attachments/assets/7b879266-ac91-4b4e-ad63-1523d3ce5bc3)


## 👨‍🏫 교수자 관리

### 교수자 추가
- 교수자 정보를 입력 후 `생성` 버튼을 클릭하면 교수자가 추가됩니다.
![교수자 생성](https://github.com/user-attachments/assets/4024452a-38cc-4c63-ba45-f5252efc2d10)


### 교수자 정보 수정
- 선택한 교수자의 정보를 수정하고 `수정` 버튼을 클릭하면 정보가 업데이트됩니다.

![교수자 수정](https://github.com/user-attachments/assets/51298bbe-f377-4321-ac6c-1abeb6376f98)

### 교수자 삭제
- 특정 교수자를 선택한 후 `삭제` 버튼을 클릭하면 교수자 정보가 삭제됩니다.

![교수자 삭제](https://github.com/user-attachments/assets/dbfec7ad-aff6-47a3-a325-ca8ab66b50bd)

---

## 메인 기술 스택
- **Frontend**: React, Vite
- **Backend**: Spring Boot, Spring Framework
- **Database**: MySQL
- **Authentication**: BCrypt를 이용한 ID/PW 찾기 및 보안

## 담당 역할
- **로그인/로그아웃 세션 관리**: 관리자, 교수자, 학습자 역할별 관리
- **관리자 기능**:
  - 교수자 추가/수정/삭제 (Front-End, Back-End, Database)
  - 공지사항 생성, 수정, 삭제 기능 (Front-End, Back-End, Database)
- **회원 정보 찾기**: BCrypt를 활용한 아이디 및 비밀번호 찾기 기능 (구현 중)


## 📌 기타
- **팀원 역할 분배**: 관리자, 교수자, 학생별 역할 구분 및 기능 개발
- **프로젝트 일정**: 지속 업데이트 예정
