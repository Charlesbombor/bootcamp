package demo_object;

import java.math.BigInteger;
import javax.naming.NameAlreadyBoundException;

public class DemoNumber {
  

  public static void main(String[] args) {
    Float f1 = Float.valueOf(60000.0f);
    Number n1 = f1; // upcast
    System.out.println(n1.shortValue()); //-5536 (overflow)
  
    // Long, Short, Byte.....etc
    BigInteger bi1 = add(1,3);
    BigInteger bi2 = add(2,5);
    System.out.println(bi1.compareTo(bi2)); //-1
    

    System.out.println(add(1, 2));
}


    // public static Number add(Number x, Number y){
    //   return 2;
    // }

    public static BigInteger add(Number x, Number y){
      long l1 = 0L;
      long l2 = 0L;
      if (x instanceof Long){ // true --> means, the object of x is created by Long.Class
         l1 = (Long) x;
        
      } else if (x instanceof Short){
        l1 = (Short) x;
      } else if (x instanceof Byte) {
        l1 = (Byte) x;
      } else if (x instanceof Integer){
        l1 = (Integer) x;
      }


         if (y instanceof Long){
         l2 = (Long) y;
        l2 = (Long)y;
      } else if (y instanceof Short){
        l2 = (Short) y;
      } else if (y instanceof Byte) {
        l2 = (Byte) y;
      } else if (y instanceof Integer){
        l2 = (Integer)y;
      }
      return BigInteger.valueOf(l1 + l2);
    }
  }

