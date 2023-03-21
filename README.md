# Time Flow System 
Backend and Frontend implementation of software to measure time quality in work

## Eureka Server Microservice
This project is designed to run in *Java 8*.

2022-11-22 - Started Core project
2023-03-16 - Created Config microservice
2023-03-17 - Connected Config microservice with Core microservice
2023-03-18 - Connected Config microservice with Eureka microservice

2023-03-20 - Unified Config + Eureka + Core  (See specific branch inside those repositories: "2023-03-20-Config+Eureka+Core")

It gets the properties (example: the port to run) from Connfig Server repository
:
http://localhost:8888/eureka-java8/default
(file: https://github.com/mselucas/configRepo/blob/master/eureka-java8.yml )

Access to see the monitor page:
http://localhost:8761/

