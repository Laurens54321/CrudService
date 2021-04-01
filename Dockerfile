FROM openjdk:11-oracle
EXPOSE 8000
COPY . /usr/src/
WORKDIR /usr/src/
RUN javac /src/main/java/com/bbqService/repo/DemoApplication.java
CMD ["java", "Main"]