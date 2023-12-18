package demo_object;

public class Eye {

  private String colorLeft;
  
  private String colorRight;
  public Eye(String colorLeft, String colorRight){
    this.colorLeft = colorLeft;
    this.colorRight = colorRight;
  }

  public static void main(String[] args) {
    Eye eyes = new Eye("black", "black");
  }
  
}
