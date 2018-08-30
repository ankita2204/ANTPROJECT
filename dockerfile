FROM openjdk:8
WORKDIR .
COPY dist/Main.jar /opt/Main.jar
CMD ["java","-jar","/opt/Main.jar","10"]
