FROM adoptopenjdk/openjdk14
ARG JAR_FILE=/build/libs/NotRocketScience-1.0.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]