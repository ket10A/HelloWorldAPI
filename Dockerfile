FROM openjdk
LABEL authors="ketanaswani"
COPY target/HelloWorldAPI-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]