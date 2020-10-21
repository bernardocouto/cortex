FROM openjdk:11

LABEL MATAINER="Cortex"

ENV JVM_XMS 256m
ENV JVM_XMX 512m
ENV PORT 8080

ARG JAR_FILE=cortex.jar

ADD ${JAR_FILE} application.jar
ADD application.sh /

RUN chmod 0755 /application.sh

CMD /application.sh

EXPOSE ${PORT}
