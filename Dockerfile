FROM maven:3.8.2-jdk-17 AS build

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17-oracle

WORKDIR /app

COPY --from=build /target/matriculaudea-0.0.1-SNAPSHOT.jar demo.jar

EXPOSE 8080

CMD ["java", "-jar", "matriculaudea-0.0.1-SNAPSHOT.jar"]
