package demo_generics.src;

public class Test {
  public static <U extends Number> Double calaulate(U u1, U u2){
    // Integer result = (Integer) u1 + (Integer) u2; // risky
    // return (U) result;

    // instranceof to check type of U
    // Byte, Short, Integer, Long, Float, Double
    double result = 0;
    if (u1 instanceof Byte)
      result += (Byte) u1;
      else if (u1 instanceof Short)
      result += (Short) u1;
      else if (u1 instanceof Integer)
      result += (Integer) u1;
      else if (u1 instanceof Long)
      result += (Long) u1;
      else if (u1 instanceof Float)
      result += (Float) u1;
      else if (u1 instanceof Double)
      result += (Double) u1;
      
      if (u2 instanceof Byte)
      result += (Byte) u2;
      else if (u2 instanceof Short)
      result += (Short) u2;
      else if (u2 instanceof Integer)
      result += (Integer) u2;
      else if (u2 instanceof Long)
      result += (Long) u2;
      else if (u2 instanceof Float)
      result += (Float) u2;
      else if (u1 instanceof Double)
      result += (Double) u1;
    
    }
  
  
  public static void main(String[] args) {
    System.out.println(calculate(1,2));

    Long x = (long) Integer.valueOf("10");

    
  }
}
