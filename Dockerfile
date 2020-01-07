FROM  maven:3.6-jdk-14
LABEL maintainer EJANGUE (ejemaster@gmx.de)

<<<<<<< HEAD
COPY src/main/java/org/i9Bach/mathUtils/ /tmp
#COPY src/main/java/org/i9Bach/mathUtils/Mathutils.java /tmp
=======
COPY pom.xml/ /tmp
COPY src/main/java/org/i9Bach/mathUtils/Main.java /tmp
COPY src/main/java/org/i9Bach/mathUtils/Mathutils.java /tmp
>>>>>>> b709bc86333f367b0be1373c999a03a8cf246f12
COPY src/test/java/org/i9Bach/mathUtils/MathutilsTest.java /tmp
ADD /target/Mathlib-0.0.1-SNAPSHOT.jar /tmp
WORKDIR  /tmp
COPY target/Mathlib-0.0.1-SNAPSHOT.jar  /tmp
# COPY ./target/Mathlib-0.0.1-SNAPSHOT.jar/ /tmp
# WORKDIR /tmp
# EXPOSE 8085
# ENTRYPOINT ["java","-jar","Mathlib-0.0.1-SNAPSHOT.jar"]
CMD ["java","-jar","Mathlib-0.0.1-SNAPSHOT.jar"]

