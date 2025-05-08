# Spring Boot Kotlin Project

## Folder Structure

```
spring-boot-kotlin/
│
├── src/
│   └── main/
│       └── kotlin/
│           └── com/
│               └── yourdomain/
│                   └── project/
│                       └── user/
│                           ├── controller/   # REST controllers handling HTTP requests
│                           ├── model/        # Data classes, DTOs, and JPA entities
│                           ├── service/      # Business logic and service interfaces/implementations
│                           └── repo/         # Spring Data repositories (interfaces for data access)
│
├── src/
│   └── main/
│       └── resources/
│           ├── application.yml               # Main application configuration
│           └── other-configs/
│
├── build.gradle.kts                          # Kotlin-based Gradle build file
├── settings.gradle.kts                       # Gradle settings
└── README.md

```

> Replace `yourdomain` and `project` with your actual package path.
