package classPracticing;

public class publicStatic {
  public publicStatic(){

  }
  public void myStaticMethod() {
    System.out.println("This is a static method.");
}

public static void main(String[] args) {
  publicStatic test = new publicStatic();
  test.myStaticMethod();
  System.out.println(test.hashCode());
}
}
