FROM openjdk:8-jdk-alpine
LABEL maintainer="PROCESSING SQUAD 4ALL TECNOLOGIA"
VOLUME /tmp
RUN mkdir -p /opt/end-netfilx-oss/app && \
    mkdir -p /opt/end-netfilx-oss/app/keys
COPY ./target/*.jar /opt/end-netfilx-oss/app/
WORKDIR /opt/end-netfilx-oss/app/
RUN java end-netflix-oss-0.0.1-SNAPSHOT.jar    