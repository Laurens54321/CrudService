FROM maven:3.6-openjdk-11
EXPOSE 8000
RUN mkdir /usr/src/project
COPY . /usr/src/project
WORKDIR /usr/src/project
RUN mvn clean package -DksipTests

FROM openjdk:11-oracle
RUN mkdir /project
COPY --from=build /usr/src/project/target/bbqService-0.0.1-SNAPSHOT.jar /project/
WORKDIR /project
CMD java -jar bbqService-0.0.1-SNAPSHOT.jar