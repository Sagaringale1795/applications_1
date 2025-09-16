FROM eclipse-temurin:17-jdk

# Use exact JAR name
ARG JAR_FILE=target/eureka-server-1.0.0.jar
COPY ${JAR_FILE} /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]


