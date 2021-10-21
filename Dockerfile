FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/iqbusiness-service.jar iqbusiness-service.jar
ENTRYPOINT ["java","-jar","app.jar"]
