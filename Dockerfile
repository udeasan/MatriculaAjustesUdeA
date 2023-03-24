FROM maven:3.8.3-openjdk-17

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-oracle

WORKDIR /app

COPY ./target/matriculaudea-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "matriculaudea-0.0.1-SNAPSHOT.jar"]
