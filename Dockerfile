FROM openjdk:8
ADD target/pnc-backend.jar pnc-backend.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","pnc-backend.jar"]