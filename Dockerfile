FROM openjdk:8
ADD target/order-management.jar order-management.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","order-management.jar"]