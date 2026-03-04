# Task & Team Management API

## Getting Started

To start the application, run:
```sh
./mvnw spring-boot:run
```
## Health Check
Once the app is running, open http://localhost:8080/health in your browser.
You should see the following response:
```json
{
  "status": "ok"
}
```


### Generic
- Spring Boot + Postgres + JWT auth
- Features: RBAC (admin/user), pagination, search, upload attachments (S3-compatible storage), audit logging
- Deliverables: README, OpenAPI/Swagger, Postman collection, CI, Dockerfile, Makefile, seed data, 70%+ test coverage