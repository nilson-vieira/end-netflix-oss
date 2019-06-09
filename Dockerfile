FROM openjdk:8-jdk-alpine
ARG JAR
ARG PROFILE
ENV JAR ${JAR}
ENV PROFILE ${PROFILE}
LABEL maintainer="PROCESSING SQUAD 4ALL TECNOLOGIA"
VOLUME /tmp
RUN mkdir -p /opt/end-netfilx-oss/app && \
    mkdir -p /opt/end-netfilx-oss/app/keys
COPY ./target/*.jar /opt/end-netfilx-oss/app/
COPY ./keys/*.key /opt/end-netfilx-oss/app/keys/
WORKDIR /opt/end-netfilx-oss/app/    