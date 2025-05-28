# Corbin Activity Hub - Weather API Backend

[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.4-brightgreen?style=for-the-badge&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![Maven](https://img.shields.io/badge/Maven-3.x-orange?style=for-the-badge&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![Docker](https://img.shields.io/badge/Docker-blue?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)

This Spring Boot application serves as a backend API for the [Corbin Activity Hub](https://www.corbinactivityhub.com) project. Its primary purpose is to securely fetch weather data from the [OpenWeatherMap API](https://openweathermap.org/api) and provide tailored endpoints for the frontend application.

---

## Features

*   **API Key Abstraction:** Securely manages the OpenWeatherMap API key on the backend, preventing exposure on the client-side.
*   **Specific Endpoints:** Provides dedicated endpoints for fetching:
    *   5-day forecast for Corbin, KY.
    *   Current weather conditions for Corbin, KY.
*   **CORS Configuration:** Configured to allow requests from the Corbin Activity Hub frontend (both localhost and deployed version).
*   **Dockerized:** Includes a `Dockerfile` for easy containerization and deployment.

---

## Tech Stack

*   **Framework:** Spring Boot 3.4.4
*   **Language:** Java 17
*   **Build Tool:** Apache Maven
*   **Dependencies:**
    *   `spring-boot-starter-web`: For building RESTful web services.
    *   `spring-boot-starter-test`: For testing.
*   **External API:** OpenWeatherMap API
*   **Containerization:** Docker

---

## Prerequisites
*  Java Development Kit (JDK) 17 or later
*  Apache Maven 3.6.x or later
*  An OpenWeatherMap API Key

## Setup
*  Clone the repository:

```
git clone [your-github-repo-url-for-this-backend]
cd [your-backend-project-directory]
```

*  Set OpenWeatherMap API Key:
    *  You need to provide your OpenWeatherMap API key. The recommended way is to set it as an environment variable:
`export OPENWEATHERMAP_API_KEY="your_actual_api_key"`

*  Another way is to modify the application.properties file directly, but using environment variables is preferred for security and flexibility.

## Building and running the Application
*  Use Maven to build the application:
```
./mvnw clean package -DskipTests
java -jar target/corbin-activity-hub-backend-main-0.0.1-SNAPSHOT.jar
```
