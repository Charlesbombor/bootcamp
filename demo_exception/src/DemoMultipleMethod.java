

import java.io.IOError;
import java.io.IOException;

public class DemoMultipleMethod {
  // Difference of throwing checked or unchecked exception
  // 1. For checked exception, you have to handle it by try-catch at the end
  // 2. For unchecked exception, you can either program fix to "avoid" or agreee to "accept" the risk
  // 3. For checked / unchecked, there is still poblymorhism between parent and child exception


  public static void main(String[] args) {
    // call methodA

    // Call a method chain, with checked exception handling
    try {
      System.out.println("Start try");
      System.out.println(methodA(5, 5));
      System.out.println("End try");
    } catch (Exception e) {
      // if (e instanceof IOException){
      System.out.println("e is IOException"); // print
    } finally {
      System.out.println("finally here.");
    }
    System.out.println("End main");
  }


  public static int methodA(int x, int y) throws IOException {
    // call methodB
    return mehtodB(x, y);
  }

  public static int mehtodB(int x, int y) throws IOException {
    // call methodC
    // return methodC (x, y);
    return methodD(x, y);
  }

  public static int methodD(int x, int y) throws IOException {
    // what is the difference of throwing checked or unchecked exception in methodC?
    if (x + y > 10)
      return x + y;
    throw new IOException(); // throw unchecked exception
  }

  public static int methodC(int x, int y) throws RuntimeException {
    // what is the difference of throwing checked or unchecked exception in methodC?
    if (x + y > 10)
      return x + y;
    throw new IllegalArgumentException(); // throw unchecked exception
  }
}
