# MVCModelStudy

이 프로젝트는 Spring Boot와 Thymeleaf를 사용하여 MVC(Model-View-Controller) 패턴을 학습하기 위한 프로젝트입니다.

## 버전

- Java 21 이상
- Gradle 8.11.1
- PostgreSQL 17.2

## 설정

### 데이터베이스 설정

`src/main/resources/application.properties` 파일에서 데이터베이스 설정이 필요합니다.

```ini
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=본인의 DB 이름
spring.datasource.password=본인의 DB 비밀번호
```

### 실행
애플리케이션이 실행되면 웹 브라우저에서 `http://localhost:8080/hello/model`에 접속하여 결과를 확인할 수 있습니다.

## 주요 기능

### HelloModelController

`HelloModelController`는 `/hello/model` 경로로 들어오는 GET 요청을 처리합니다. 
Model 객체에 데이터를 추가하고, 해당 데이터를 사용하여 Thymeleaf 템플릿을 렌더링합니다.

### Thymeleaf 템플릿

`src/main/resources/templates/helloThymeleaf.html` Thymeleaf를 사용하여 데이터를 다양한 방법으로 렌더링 하는방법을 공부

### 프래그먼트

`src/main/resources/templates/fragment.html` 파일은 Thymeleaf 프래그먼트를 정의하고, 이를 `helloThymeleaf.html` 파일에서 사용하는 예제입니다. 타이머 기능을 포함한 태그를 다른 뷰에서 가져와 사용할 수 있습니다.
