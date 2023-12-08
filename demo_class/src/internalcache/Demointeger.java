package internalcache;

public class Demointeger {
  public static void main(String[] args) {
    Integer i1 = 10; // 10 is an int value, auto-box --> integer
    System.out.println("i1= " + i1);

    Integer i2 = new Integer(10);
    System.out.println("i2= " + i2); // 10

    System.out.println(i1 == i2); // false, because of "new"
    System.out.println(i1.compareTo(i2)); // 0
    System.out.println(i1.equals(i2)); // true  
    
    Integer i3 = 10;
    System.out.println(i1 == i3); // true, Integer Cache
    
    Integer i4 = 127;
    Integer i5 = 127;
    System.out.println(i4 == i5); // true, Integer Cache

    Integer i6 = 128;
    Integer i7 = 128;
    System.out.println(i6 == i7); // false, out of Integer Cache
  }
}
