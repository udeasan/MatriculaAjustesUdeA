FROM maven:3.8.3-openjdk-17 AS maven

COPY . .

RUN mvn clean package 

FROM openjdk:17-oracle

WORKDIR /app

COPY --from=maven /target/matriculaudea-0.0.1-SNAPSHOT.jar /app

ARG URL_DATABASE
ARG USERNAME
ARG PASSWORD

ENV URL_DATABASE=${URL_DATABASE}
ENV USERNAME=${USERNAME}
ENV PASSWORD=${PASSWORD}

EXPOSE 8080

ENTRYPOINT ["java","-jar","matriculaudea-0.0.1-SNAPSHOT.jar"]