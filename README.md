# TeamService - Football Team Management Microservice

This microservice is part of a football team management system and is responsible for handling operations related to football teams.

## Technologies Used

- Java
- Spring Boot
- Eureka for service registration
- Ribbon for client-side load balancing
- Hystrix for circuit breaker
- Swagger for API documentation
- Actuator for monitoring endpoints

## Project Structure
```
team-service/
|-- src/
| |-- main/
| | |-- java/
| | |-- com/
| | | |-- example/
| | | | -- teamservice/
| | | | -- TeamServiceApplication.java
| | | | -- controller/
| | | | | -- TeamController.java
| | | | -- model/
| | | | -- Team.java
| | | | -- service/
| | | | -- TeamService.java
| | | | -- impl/
| | | | -- TeamServiceImpl.java
|-- src/
| |-- main/
| |-- resources/
| |-- application.properties
|-- pom.xml
|-- README.md
```

## Endpoints

- `GET /teams/{id}`: Retrieve details of a team by its identifier.
- `POST /teams`: Add a new team.
- `PUT /teams/{id}`: Update information of an existing team.
- `DELETE /teams/{id}`: Delete a team by its identifier.

## Setup

1. Clone the repository.
2. Import the project into IntelliJ.
3. Make sure you have Java 11 and Maven installed.
4. Run all the service application class to start microservices.

## Usage

- Access Swagger documentation: `http://localhost:8080/swagger-ui.html`
- Monitor endpoints using Actuator: `http://localhost:8080/actuator`
- Swagger Player management : `http://localhost:8011/swagger-ui.html#/Player_Management`
- Swagger Match management : `http://localhost:8083/swagger-ui.html#/Match_Controller`
- Swagger Team management : `http://localhost:8081/swagger-ui.html#/Match_Controller`
- Swagger Stats management : `http://localhost:8084/swagger-ui.html#/Match_Controller`
  
## pictures of working project 

- Eureka server listening to all microservices clients :
![eureka](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/9a3c3e50-f6c1-448a-9566-88a799f3d233)
- 2 examples of Swagger :
![matchswagger](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/b3dcbfca-f292-40db-94fb-ea60cc104f07)
![playerswagger](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/d518cd5f-c0aa-46a8-a87a-2352a4cfbea4)

## Notes

- This microservice registers itself with Eureka for service discovery.
- It utilizes Ribbon for client-side load balancing.
- Hystrix is used for circuit breaking to enhance system resilience.

Feel free to customize the code and configuration based on your specific requirements.
