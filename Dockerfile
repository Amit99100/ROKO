# Use an official lightweight Java runtime as a parent image
FROM openjdk:28-ea-trixie

ADD target/demo.jar demo.jar

ENTRYPOINT ["java", "-jar", "/demo.jar"]
