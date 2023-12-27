public class charlesJavaQuest9 {
  /**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */

  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    int i = str.indexOf('J');
    System.out.println(str.charAt(i));
    // prints e (the 1st e)
    System.out.println(str.charAt(str.indexOf('e')));
    // code here ...

    // Use indexOf()

    // prints 3
    System.out.println(str.indexOf('t'));
    // prints 9
    System.out.println(str.indexOf('x'));
    // prints 10
    System.out.println(str.indexOf('L'));
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());
    // Use String replace() method
    System.out.println(str.replace("Java", "Coding"));
    // prints VenturenixLAB, Coding
    // code here ...

    // int length()
    System.out.println(str.length());
    // prints 19
    // code here ...

    // Use String substring(int start, int end)
    System.out.println(str.substring(5,8));
    // prints "ren"
    // code here ...

    // print "VENTURENIXLAB, JAVA"
    System.out.println(str.toUpperCase());
    // prints "venturenixlab, java"
    System.out.println(str.toLowerCase());
    // code here ...

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str.toUpperCase().replace('E', '*'));

  }
}
