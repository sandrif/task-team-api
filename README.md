# Task & Team Management API

## Getting Started

To start the application, run:
```sh
./mvnw spring-boot:run
```

## Prerequisites
- Java 17/21
- Docker

## Health Check
Once the app is running, open http://localhost:8080/health in your browser.
You should see the following response:
```json
{
  "status": "ok"
}
```

## Run Tests
To run the tests, execute:
```sh
./mvnw test
```
### Generic
- Spring Boot + Postgres + JWT auth
- Features: RBAC (admin/user), pagination, search, upload attachments (S3-compatible storage), audit logging
- UI touch (lightweight): Swagger/OpenAPI + tiny React admin
- Deliverables: README, OpenAPI/Swagger, Postman collection, CI, Dockerfile, Makefile, seed data, 70%+ test coverage
