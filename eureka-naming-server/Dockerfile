FROM java:11
# Install netcat
RUN apt-get update && apt-get install -y netcat

VOLUME /tmp

WORKDIR /eureka-naming-server

ADD target/eureka-naming-server.jar eureka-naming-server.jar

RUN bash -c 'touch /eureka-naming-server.jar'

EXPOSE 8761
CMD ["/Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home/bin/java", "-jar", "eureka-naming-server.jar"]