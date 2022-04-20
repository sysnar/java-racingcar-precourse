# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 기능 요구사항 구현목록 정리
### 자동차 생성 기능
* 현재 위치, 자동차명을 가짐
* 자동차명이 5글자 이하인지 검사

### 자동차 이동 기능
* 입력값에 맞춰 자동차 위치를 이동
  * 입력값이 0 ~ 3일 경우 전진
  * 입력값이 4 ~ 9일 경우 정지
* 잘못된 값이 들어왔을 경우 예외 처리
  * 입력값은 0 ~ 9 사이의 숫자여야함

### 자동차 리스트 생성 기능
* 자동차의 이름들을 `,`로 구분하여 N대의 자동차를 생성
* 잘못된 값이 들어왔을 경우 예외 처리
  * 동일한 자동차명이 2번 입력되었을 경우 예외 발생

### 입력값 예외처리
* 사용자 입력값이 잘못된 경우 `IllegalArgumentException`예외 발생
* 예외발생 시 `[ERROR]` 형식으로 예외를 출력
* 예외발생 후 다시 입력을 받아야 함

### 사용자 입력/출력 기능
* 우승자 안내문구를 출력
  * 단독 우승, 공동 우승을 구별
