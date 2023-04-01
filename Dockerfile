FROM amazoncorretto:11-alpine-jdk
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=mike_gor_bot
ENV BOT_TOKEN=6246729348:AAHxHG3NCczDs8o6hNYUdlDRHffqsJhns2Y
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
