FROM eclipse-temurin:17-jre-focal
ARG JAR_FILE=target/servidorRestauranteFonda-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_servidor_eureka.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app_servidor_eureka.jar"]