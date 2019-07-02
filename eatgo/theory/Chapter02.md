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

### REST API
* [TIL에 정리한 REST API 링크](https://github.com/always-awake/TIL/blob/master/REST/1_REST_API.md)
* Resource의 분류
    - Collection
        + Read(List): 리소스 리스트를 읽어 온다.
        + Create: 새로운 리소스를 만든다.
    - Member
        + Read(Detail): 리소스 개별 정보를 읽어 온다.
        + Update: 개별 리소스를 수정한다.
        + Delete: 개별 리소스를 삭제한다.
    - 예시
        + Collection: http://host/restaurants
        + Member: http://host/restaurants/{id}
* JSON (JavaScript Object Notation)
    - JSON은 경량(Lightweight)의 DATA-교환 형식이다.
    - Javascript에서 객체를 만들 때 사용하는 표현식을 의미한다.
    - JSON 표현식은 사람과 기계 모두 이해하기 쉬우며 용량이 작아서, 최근에는 JSON이 XML을 대체해서 데이터 전송 등에 많이 사용한다.
    - **특정 언어에 종속되지 않으며**, 대부분의 프로그래밍 언어에서 JSON 포맷의 데이터를 핸들링 할 수 있는 라이브러리를 제공한다.
```
{
    "id": 2019,
    "name": "식당",
    "address": "골목"
}
```
* 사용 예
    - 가게 목록 (Collection GET)
        + GET /restaurants
    - 가게 상세 (Member GET)
        + GET /restaurants/{id}
    - 가게 추가
        + POST /restaurants
    - 가게 수정
        + PUT /restaurants/{id}
        + PATCH /restaurants/{id}
    - 가게 삭제
        + DELETE /restaurants/{id}