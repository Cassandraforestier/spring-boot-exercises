# Football Team Management Microservice

This project is talking about the Football Management System, designed to manage various aspects of football. The system consists of multiple microservices, each focusing on specific functionalities : 
- Team service
- Player service
- Match service
- Stats service
- Eureka server ( service to plug All services as a client of this server )

## Technologies Used

- Java
- Spring Boot
- Eureka for service registration
- Ribbon for client-side load balancing
- Hystrix for circuit breaker
- Swagger for API documentation
- Actuator for monitoring endpoints

## Project Structure
all services have the same structure, here is an example :
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
<p>Team service :</p>

- `GET /teams/{id}`: Retrieve details of a team by its identifier.
- `POST /teams`: Add a new team.
- `PUT /teams/{id}`: Update information of an existing team.
- `DELETE /teams/{id}`: Delete a team by its identifier.
  
<p>Player service :</p>

- `GET /players/{id}`: Retrieve details of a player by their identifier.
- `POST /players`: Add a new player.
- `PUT /players/{id}`: Update information of an existing player.
- `DELETE /players/{id}`: Delete a player by their identifier.

<p>Match service :</p>

- `GET /matches/{id}`: Retrieve details of a match by its identifier.
- `POST /matches`: Add a new match.
- `PUT /matches/{id}`: Update information of an existing match.
- `DELETE /matches/{id}`: Delete a match by its identifier.

<p>Stats service :</p>

- `GET /team-stats/{teamId}`: Retrieve season statistics for a team.
- `GET /player-stats/{playerId}`: Retrieve season statistics for a player.


## Setup

1. Clone the repository.
2. Import the project into IntelliJ.
3. Run all microservices individually.
4. Make sure you have Java 11 and Maven installed.
5. Run all the service application class to start microservices.

## Usage

- Access Swagger documentation: `http://localhost:8080/swagger-ui.html`
- Monitor endpoints using Actuator: `http://localhost:8080/actuator`
- Hystrix stream : `http://localhost:8083/hystrix.stream`
- Swagger Player management : `http://localhost:8011/swagger-ui.html#/Player_Management`
- Swagger Match management : `http://localhost:8083/swagger-ui.html#/Match_Controller`
- Swagger Team management : `http://localhost:8081/swagger-ui.html#/Match_Controller`
- Swagger Stats management : `http://localhost:8084/swagger-ui.html#/Match_Controller`
  
## pictures of working project 

- <strong>Eureka server listening to all microservices clients</strong> :
![eureka](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/9a3c3e50-f6c1-448a-9566-88a799f3d233)

- <strong>2 examples of Swagger</strong> :
![matchswagger](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/b3dcbfca-f292-40db-94fb-ea60cc104f07)
![playerswagger](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/d518cd5f-c0aa-46a8-a87a-2352a4cfbea4)

- <strong>Example of Hystrix stream</strong> :
<p>You can see here the postman url to find informations of the first match :</p>
![postmanMatch](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/7bfee190-400e-4cf9-895d-5fafaee08d8b)
<p>And here you can see the stream of hystrix catching this url</p>
![hystrixMatchStream](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/77795ea5-0838-408c-a226-d9d7bb5cbf7e)

- <strong> Example of actuator on Match </strong>:
![actuatorMatch](https://github.com/Cassandraforestier/spring-boot-exercises/assets/39778007/32b9c427-609e-4db6-ada3-7468ed80fbd6)

## all parts that is not implemented :
1. Part 8 about Load balancing
2. Part 9 about Kubernetes and Docker

## Notes

- This microservice registers itself with Eureka for service discovery.
- It utilizes Ribbon for client-side load balancing.
- Hystrix is used for circuit breaking to enhance system resilience.

Feel free to customize the code and configuration based on your specific requirements.
