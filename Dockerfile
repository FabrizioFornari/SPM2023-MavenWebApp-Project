FROM tomcat:9.0.74-jdk17-temurin-jammy
EXPOSE 8080
RUN rm -fr /usr/local/tomcat/webapps
RUN apt-get update && apt-get install libtinfo5
COPY target/spm2023.war /usr/local/tomcat/webapps/spm2023.war
CMD ["catalina.sh", "run"]