FROM openjdk:8
ADD target/email-notification-service.jar email-notification-service.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","email-notification-service.jar"]