FROM java:8
VOLUME /tmp
ADD DateTimeApp-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 2000
ENTRYPOINT ["java","-Dspring.profiles.active=native","-jar","/app.jar"]