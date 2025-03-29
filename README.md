# 모두를 위한 학사 관리 시스템 "LearnAliveLMS"

## 📌 프로젝트 소개
LearnAliveLMS는 기존에 한국에서 사용하는 학사시스템의 단점들을 보완한 학사시스템 입니다.</br>
[관리자,교수자,학습자]의 역할별 권한에 따른 기능들을 효과적으로 관리하고 사용할 수 있게 설계되었습니다.

<img width="800" alt="스크린샷 2025-03-29 오후 11 49 03" src="https://github.com/user-attachments/assets/905bba32-d5f1-4220-8893-6f53f9d37526" />

</br></br>



## 🕹️ 기술 스택

### 프론트엔드  
![React](https://img.shields.io/badge/React-61DAFB?style=flat&logo=react&logoColor=black)
![JavaScript](https://img.shields.io/badge/JavaScript-F0DB4F?style=flat&logo=javascript&logoColor=black)

### 백엔드  
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=plastic&logo=Spring%20Boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=plastic&logo=Java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=plastic&logo=Apache%20Maven&logoColor=white)

### DB / 데이터베이스  
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=plastic&logo=MySQL&logoColor=white)
![MyBatis](https://img.shields.io/badge/MyBatis-000000?style=plastic&logo=data&logoColor=white)

### 기타 도구  
![GitHub](https://img.shields.io/badge/GitHub-181717?style=plastic&logo=GitHub&logoColor=white)




</br>

---

## **🔑 담당 주요 기능** 

### 1. 로그인 세션 관리
- **관리자, 교수자, 학습자 역할별 로그인 및 세션 관리**
- **BCrypt를 이용한 ID/PW 찾기 기능**
- **회원정보 찾기 및 재설정 기능**

### **2. 관리자 기능**
- **교수자 관리** : 교수자 추가, 수정, 삭제 기능 구현
- **공지사항 관리** : 공지사항 생성, 수정, 삭제 기능 구현
- **대학/학과 관리** : 단과대학/학과 생성, 수정, 삭제 기능 구현 

### **3. 교수자 기능**
- **팀활동 현황** : 각 조별과제 과정 현황을 나타낼 수 있는 '마일스톤' 관리기능
- **팀 동료평가** : 조별과제 진행 중 동료평가 기능 구현 (구현중)

</br></br>

---

## **💻 프로젝트 주요 화면**

### 1. 첫 화면 (Admin,Professor,Student) 계정으로 로그인
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

## 2. 교수자 생성/수정/삭제
교수자 관리 페이지에서 교수자를 생성/수정/삭제 할 수 있습니다.

<table>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/95a08c16-79c1-449f-96be-a5f196549ed0" width="750" alt="교수자 관리 생성"></td>
    <td><img src="https://github.com/user-attachments/assets/9b7ae159-8f52-4afe-ac6d-32267df47537" width="750" alt="교수자 관리 수정/삭제"></td>
  </tr>
</table>



</br>

---


## 3. 공지사항 관리
공지사항 관리 페이지에서 공지사항을 생성/수정/삭제 할 수 있습니다.

<table>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/2707a62f-60ae-4234-a7c4-0cdd162ee017" width="750" alt="공지사항 열람">
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/dd7c1cb6-fcb7-4cee-96c7-9f0ecf4a7347" width="750" alt="공지사항 생성">
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/dfce858c-200b-4945-845b-3aec4376cc86" width="750" alt="공지사항 수정">
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/1f9196af-bfb1-4e60-9229-e7c0b8532a61" width="750" alt="공지사항 삭제">
    </td>
  </tr>
</table>


</br>

---


## 4. 대학/학과 관리
대학/학과 관리 페이지에서 단과대학 및 학과를 생성/수정/삭제 할 수 있습니다.

<img src="https://github.com/user-attachments/assets/66ed5ddb-3c68-47dc-a0c4-c5acdc5d9028" width="800" alt="대학: 학과관리">


</br></br>

---

## 5. 회원가입, 회원정보 찾기 및 비밀번호 수정
- 생성한 단과대학/학과를 이용하여 학습자 회원가입을 할 수 있습니다. </br>
- ID찾기 및 비밀번호 재설정을 할 수 있습니다.


<table>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/a91143ee-aa26-4bd6-9fff-f22186cc3f02" width="750" alt="회원가입">
    </td>
    <td>
      <img src="https://github.com/user-attachments/assets/2306b97f-87f2-4da0-9a14-ce0c3ab47664" width="750" alt="교수자 아이디 찾기 및 비밀번호 재설정">
    </td>
  </tr>
</table>



</br>

---
## 6. 팀활동 현황
- 각 조별과제 과정 현황을 나타낼 수 있는 '마일스톤' 관리기능

<table>
  <tr>
    <td>
      <img src="https://github.com/user-attachments/assets/49e92ae3-56ec-4066-be34-7114bf0b9928" width="750" alt="팀활동현황 설정">
    </td>
  </tr>
</table>


