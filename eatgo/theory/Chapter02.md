## Chapter 02
### 어떻게 만들 것인가
* 도메인 모델링
    - Restaurant (가게)
        + 가게 이름
        + 가게 주소
        + 가게가 취급하는 음식 종류
    - Menu Item
    - Food & Beverages
    - User
        + 고객
        + 가게(주인)
        + 관리자
    - Favorite
        + 어느 User가 어느 Restaurant을 즐겨찾기 했다는 정보
    - Review
        + 가게에 대한 리뷰
        + 어느 User가 어느 Restaurant에 몇 점의 점수를 준다는 정보
    - Reservation
        + 어느 User가 어느 Restaurant에 예약을 했는 지에 대한 정보
        + 예약 시기
        + 인원
        + 예약 메뉴

* 시스템 아키텍처
    - 시스템이란 소프트웨어, 하드웨어, 여러 인프라를 포함하 것이다.
    - 3-tier Architecture
        + Presentation (Font-end)
        + Business (Back-end)
        + Data Source (Database)
    - Layered Architecture로 Business (Back-end) 구현
        + UI 
        + Application
        + Domain
        + Infrastructure
        
* 기술 선택
    - Java
    - Java SpringBoot
    - REST API

### Test Driven Development (TDD: 테스트 주도 개발)
* 같은 의미 다른 단어
    - 목표 주도 개발
    - 사용자 중심 개발
    - 인터페이스 중심 개발

* TDD의 목표
    - 올바른 작동
    - 깔끔한 코드 작성

* TDD 방법
    - 올바르게 작동하는 코드 작성 -> 깔끔한 코드가 되도록 Refactoring 
    - 올바르게 작동한다는 것을 보장해줄 수 있는 **Test Code**가 필요하다.
    - Test Code를 가장 먼저 작성하자는 것이 TDD의 핵심 아이디어이다.
* TDD 사이틀 (Red - Green - Refactoring)
    - Red
        + 실패하는 테스트를 의미한다.
        + 실패할 테스트를 작성함으로써 작업을 시작한다.
        + 어떠한 코드 작성없이 테스트 코드를 일단 작성한다.
    - Green
        + 이 테스트를 통과할 최소 코드를 작성한다.
        + 편법이라도 상관없다. (상수 반환 등)
    - Refactoring
        + 코드를 리팩터링해서 이해할 수 있는 코드로 만든다.
        + 테스트는 그대로인 상태에서 내부 구현이 바뀌게 된다.