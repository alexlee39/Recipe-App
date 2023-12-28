FROM --platform=linux/amd64 openjdk:8
WORKDIR /server
COPY ./src /server
RUN javac main/java/server/Server.java main/java/server/MongoDbOps.java main/java/server/PingHandler.java main/java/server/ChatGptReqHandler.java main/java/server/AuthReqHandler.java main/java/server/Helper.java main/java/server/Constants.java main/java/server/WhisperReqHandler.java main/java/server/RecipeReqHandler.java main/java/server/RootReqHandler.java
EXPOSE 8100
ENTRYPOINT ["java", "Server"]