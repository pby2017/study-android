```
* Custom View 피드백 반영

* NestedScrollView 피드백 반영

* 앱을 죽이는 방법 피드백 반영
* 현재 보여지고 있는 프래그먼트 찾을 수 있는 방법 피드백 반영
* Activity와 Fragment 통신 방법 피드백 반영

* REST Api 조사 및 실습 피드백 반영

* notification 구현 피드백 반영
```
# REST Api 조사 및 실습 피드백 반영
* 프로젝트 : MyRetrofitApp
## REST((Representational State Transfer))
* 웹이 HTTP 설계 상 우수성을 제대로 사용하지 못하는 점에 대해서 웹의 장점을 최대한 활용할 수 있는 아키텍처로 제안되었습니다.
* HTTP 프로토콜을 의도에 맞게 디자인하도록 유도하고 있습니다.
* REST의 기본 원칙이 있으며 기본 원칙을 지키는 서비스 디자인을 RESTful 하다고 합니다.
## API
* 응용 프로그램에서 사용할 수 있도록 기능을 제어할 수 있게 만든 인터페이스입니다.
## REST API
* REST의 원칙을 따르는 API입니다.
* 원칙은 크게 2가지 입니다.
  1. URI는 정보의 자원을 표현해야 합니다.
  2. 원에 대한 행위는 HTTP Method(GET, POST, PUT, DELETE 등)으로 표현합니다.
## REST API 구성
* REST API의 구성은 3가지가 있습니다.
  1. 리소스(Resource) : 자원 또는 자원의 위치입니다. (HTTP URI)
  2. Verb : 자원에 대한 접근 방법입니다. (HTTP Method)
  3. Representations : 자원에 대한 내용입니다. (HTTP Message Pay Load)
## REST API Method
* HTTP 통신에 사용하는 API Method는 4가지가 있습니다.
  1. GET : 리소스 정보를 가져올 때 사용합니다. Database CRUD 중 Read의 역할과 비슷합니다.
  2. POST : 리소스 정보를 생성할 때 사용합니다. Database CRUD 중 Create의 역할과 비슷합니다.
  3. PUT : 리소스 정보를 갱신할 때 사용합니다. Database CRUD 중 Update의 역할과 비슷합니다.
  4. DELETE : 리소스 정보를 삭제할 때 사용합니다. Database CRUD 중 Delete의 역할과 비슷합니다.

# 참고
* [REST API](https://poiemaweb.com/js-rest-api)