package classPracticing;


public class privateStatic {
  
  public static void main(String[] args) {
    publicStatic test = new publicStatic();
  test.myStaticMethod();
  System.out.println(test.hashCode());
  if (test == test){
    System.out.println("yes");
  }
    
  }
}
