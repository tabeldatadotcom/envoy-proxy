FROM openjdk:17-oraclelinux8
ARG JAR_FILE=target/demo-istio1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]
EXPOSE 8080