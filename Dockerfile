FROM openjdk:18-slim-buster
COPY build/libs/ylen-api-1.0-SNAPSHOT.jar ylen-api-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ylen-api-1.0-SNAPSHOT.jar"]
EXPOSE 8080
