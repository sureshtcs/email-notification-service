FROM openjdk:8
ADD target/department-management.jar department-management.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","department-management.jar"]