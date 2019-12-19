FROM  maven:3.6-jdk-14
LABEL maintainer EJANGUE (ejemaster@gmx.de)
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn package
CMD ["java","-cp","target/Mathlib-0.0.1-SNAPSHOT.jar", "org.i9Bach.mathUtils.MathutilsTest"]
