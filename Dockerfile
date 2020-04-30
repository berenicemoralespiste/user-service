FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

FROM​ openjdk:8-jre-alpine
EXPOSE​ 8080
ADD​ /target/microservices-jmg-1.0-SNAPSHOT.jar myapp.jar
ENTRYPOINT​ [​ "java"​ , ​ "-jar"​ , ​ "myapp.jar"​ ]