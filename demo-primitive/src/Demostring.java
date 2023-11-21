public class Demostring {
  
    public static void main(String[] args) {
      
      String emailAddress = "charlesbombor@gmail.com";
      // string s = 3; // s is declared by String, so you cannot assign int value
      // int i = "hello"; // i is declared by int, you cannot assign String value
  
      System.out.println(emailAddress);  // charlesbombor@gmail.com

      // Operations -> append (concat)
      String str = "hello" + " " + "world";
      System.out.println(str);// "hello world"

      // Always look at the code inside the bracket first
      // Step 1: "hello" + "world" -> "hello world"
      // Step 2: System.out.println() -> print out
      String cut = "hello" + "o"; // no "-", "*", "/" in string
      System.out.println(cut);

      String str1 = "hello";
      System.out.println(str1); // "hello"
      System.out.println(str1.length()); // 5
      str1 = str1 + "world";
      System.out.println(str1.length()); // 10

      str1 += "!!!";
      System.out.println(str1.length()); //13

    }
  } 

