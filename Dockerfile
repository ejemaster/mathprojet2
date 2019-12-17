FROM  openjdk:8-jdk
LABEL maintainer EJANGUE (ejemaster@gmx.de)
RUN apt-get-update
RUN apt-get-install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn Package
CMD ["java","-cp","target/Mathlib-0.0.1-SNAPSHOT.jar", "org.i9Bach.mathUtils"]