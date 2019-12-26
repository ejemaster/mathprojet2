FROM  maven:3.6-jdk-14
LABEL maintainer EJANGUE (ejemaster@gmx.de)
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn package
CMD ["java","Mathutils.java"]
