public enum SysCode {

  // 1 - 1000 (reserved for error)
  SERVER_TIMEOUT("Server Connection Time Out."),

  // 1001 - 2000 (reserved for warning)
  DB_TIMEOUT(1, "Database Connection Time Out."),

  // 2001 - 3000 (Others)
  EMAIL_TOO_LONG(2001, "The Email too long."),;

  private int code;
  private String message;

    private SysCode (String message) {
    this.message = message;
  }

  private SysCode (int code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public int getCode(){
    return this.code;
  }  

}
