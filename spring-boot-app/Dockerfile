FROM maven:3.5-jdk-8
FROM java:8
WORKDIR /app
COPY target/*.jar /app/thegeekyasian-docker-spring-boot-app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","thegeekyasian-docker-spring-boot-app.jar"]
