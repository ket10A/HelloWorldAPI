FROM openjdk
LABEL authors="ketanaswani"
ARG JAR_FILE
COPY target/HelloWorldAPI-*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]