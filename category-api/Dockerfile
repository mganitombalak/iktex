FROM alpine:3.11
RUN apk update && apk add openjdk8-jre-base
WORKDIR /category-api
COPY ./target/category-api.jar .
CMD ["java","-jar","category-api.jar"]