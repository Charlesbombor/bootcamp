package demo_exception.src;

public class DemoExample {
  public static void main(String[] args) {

    // The most popular runtime exception (unchecked exception)

    // String s = null;
    //s.length(); // java.lang.NullPointerException

    //int x = 0;
    //double average =  100 / x; // java.lang.ArithmeticException

    Object s2 = "hello";
    Double result = (Double) s2; // java.lang.ClassCastException
  }
}
