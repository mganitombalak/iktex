FROM alpine:3.11
RUN apk update && apk add openjdk8-jre-base
WORKDIR /product-api
COPY ./target/product-api.jar .
CMD ["java","-jar","product-api.jar"]