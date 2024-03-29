package server;

import com.sun.net.httpserver.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.*;

// start server in Run and Debug
public class Server {

  // initialize server port and hostname
  private static final int SERVER_PORT = 8100;
  private static final String SERVER_HOSTNAME = "http://localhost:8100/"; //"100.81.33.8"; //http://localhost:8100/

  public static void main(String[] args) throws IOException {
    // create a thread pool to handle requests
    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(
      10
    );

    // create a server
    HttpServer server = HttpServer.create(
      new InetSocketAddress(SERVER_HOSTNAME, SERVER_PORT),
      0
    );
    //
    HttpHandler pingHandler = new PingHandler();
    server.createContext("/ping", pingHandler);
    //
    HttpHandler authReqHandler = new AuthReqHandler();
    server.createContext("/auth", authReqHandler);
    //
    HttpHandler recipeReqHandler = new RecipeReqHandler();
    server.createContext("/recipe", recipeReqHandler);
    //
    HttpHandler whisperReqHandler = new WhisperReqHandler();
    server.createContext("/translate", whisperReqHandler);
    //
    HttpHandler chatGptReqHandler = new ChatGptReqHandler();
    server.createContext("/genrecipe", chatGptReqHandler);

    HttpHandler rootReqHandler = new RootReqHandler();
    server.createContext("/", rootReqHandler);

    server.setExecutor(threadPoolExecutor);
    server.start();
    System.out.println("Server started on port " + SERVER_PORT);
  }
}
