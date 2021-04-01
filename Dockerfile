FROM openjdk:11-oracle
EXPOSE 8000
COPY . /usr/src/main/java/com/bbqService/repo/DemoApplication
WORKDIR /usr/src/main/java/com/bbqService/repo/DemoApplication
RUN javac Main.java
CMD ["java", "Main"]