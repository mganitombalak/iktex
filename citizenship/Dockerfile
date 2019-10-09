FROM alpine:3.10.2
WORKDIR /api
RUN apk update && apk add openjdk8-jre
COPY ./target/*.jar .
CMD ["java","-jar","citizen-api.jar"]