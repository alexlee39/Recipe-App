package server;

public final class Constants {

  protected static final String GET = "GET";
  protected static final String POST = "POST";
  protected static final String PUT = "PUT";
  protected static final String DELETE = "DELETE";
  protected static final String TRUE = "TRUE";
  protected static final String FALSE = "FALSE";
  protected static final String INVALID_REQ_TO_ROUTE =
    "ERROR: Invalid Request Method to Route";
  protected static final String INVALID_GET_TO_ROUTE =
    "ERROR: Invalid Get Request to Route";
  protected static final String INVALID_POST_TO_ROUTE =
    "ERROR: Invalid Post Request to Route";
  protected static final String INVALID_PUT_TO_ROUTE =
    "ERROR: Invalid Put Request to Route";
  protected static final String INVALID_DELETE_TO_ROUTE =
    "ERROR: Invalid Delete Request to Route";
  protected static final String USER_EXISTS = "ERROR: Username Already Exists";
  protected static final String WRONG_AUTH = "ERROR: Incorrect Username/Password";

  protected static final String uri =
  "mongodb+srv://fangzhongli0:dm3DeEs1C7UGwbOn@cluster0.zd5oxwj.mongodb.net/?retryWrites=true&w=majority";
  protected static final String database = "pantryPal";
  protected static final String collection = "recipesByUserId";

  protected static final String API_ENDPOINT =
  "https://api.openai.com/v1/completions";
protected static final String API_KEY =
"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";
protected static final String MODEL = "text-davinci-003";
protected static final int MAX_TOKENS = 300;

protected static final String DALLE_MODEL = "dall-e-2";
protected static final String DALLE_API_ENDPOINT =
  "https://api.openai.com/v1/images/generations";
protected static final String DALLE_API_KEY =
"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";

  private Constants() {}
}
