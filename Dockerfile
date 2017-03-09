FROM java:8
VOLUME /tmp
ADD target/mash-hello-service.jar mash-hello-service.jar
ENTRYPOINT [ "java", "-jar","mash-hello-service.jar"]