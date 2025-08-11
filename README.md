# Day14 Project 1 — Spring Boot + MapStruct + JPA Filtering

A Spring Boot project demonstrating:
- **JPA** for database operations
- **PostgreSQL** as the database
- **MapStruct** for DTO–Entity mapping
- **Lombok** for boilerplate code reduction
- **REST API** with filtering capability

---

## 📂 Project Structure
```
Directory structure:
└── adrin-bershik-c-j-day16proj1/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── example/
    │   │   │           └── day14proj1/
    │   │   │               ├── Day14proj1Application.java
    │   │   │               ├── controller/
    │   │   │               │   └── BugController.java
    │   │   │               ├── dto/
    │   │   │               │   └── BugResponseDTO.java
    │   │   │               ├── entity/
    │   │   │               │   └── Bug.java
    │   │   │               ├── mapper/
    │   │   │               │   └── BugMapper.java
    │   │   │               ├── repository/
    │   │   │               │   └── BugRepository.java
    │   │   │               └── service/
    │   │   │                   └── BugService.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── example/
    │                   └── day14proj1/
    │                       └── Day14proj1ApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties
```

---

## 🛠 Dependencies
- **Spring Boot Starter Web** – Build REST APIs
- **Spring Boot Starter Data JPA** – ORM with Hibernate
- **Spring Boot Starter Security** – Authentication & security (optional in this example)
- **PostgreSQL Driver** – Database connection
- **MapStruct** – Object mapping (DTO ↔ Entity)
- **Lombok** – Auto-generate getters, setters, constructors
- **Spring Boot Starter Test** – Testing support

---

## ⚙️ Requirements
- **Java 17**
- **Maven 3.8+**
- **PostgreSQL** running locally

---

## 🔧 Configuration
Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
