# Student-Spring-Eureka-Application

A microservice-style application employing Spring Boot REST API and running on a Eureka Server for accessing student, financial, and transportation information for multiple school in a district. The program consists of three backend services (student, transportation, financial) that run independently and access information from their own databases using Spring Boot JPA, as well as a client-side service that extracts information from the backend and utilizes jsp/jstl for user interfacing.



**Server:** spring-eureka-server (port 8761)  
  
**Client-side Service:** spring-eureka-client-school-service (port 9098)
* username: "admin"
* password: "password"
  
**Backend Services:** 
* spring-eureka-financial-service (port 8097)
* spring-eureka-student-service (port 8098)
* spring-eureka-transportation-service (port 8099)  


