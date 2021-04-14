FROM  openjdk:11-alpine
RUN mkdir /opt/app
ENV APP_FILE eureka-naming-server-1.0.0-SNAPSHOT.jar
ENV APP_HOME /opt/app
EXPOSE 8888
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
