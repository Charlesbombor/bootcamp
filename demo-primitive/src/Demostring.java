public class DemoString {
  
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
      // String supports "+", "+="
      System.out.println(cut);

      String str1 = "hello";
      System.out.println(str1); // "hello"
      System.out.println(str1.length()); // 5
      str1 = str1 + "world";
      System.out.println(str1.length()); // 10

      str1 += "!!!";
      System.out.println(str1.length()); //13

      // equals()
      int x = 0;  //single = means assigngment
      int x2 = 3;
      if (x == x2) {  // == means, asking if they are equals
        System.out.println("x is equals to x2");
      }  
      else {
          System.out.println("x is not equals to x2");
        }
        // sysout is the shortcut for System.out.println()
        // String is not a privitive, so you cannot use == to compare their values
       // if (s1.equals(s2)) { // comparing two string variables
          //System.out.println ("s1 is hello");
          String s1 ="hello";
          String s2 = "hello";
          if (s1.equals(s2)) {  // comparing string value to a string variable
            // if (s1.equals)
            System.out.println("s1 is hello");

          }
            if ("hello".equals("hello")){
              System.out.println("ABC");
            }

            //charAt()
            //4 is an index of String.
            // Example: "hello", h --> index =0
            // e -> index =1
            //l -> index =2
            // l -> index =3
            // o -> index =4
            // s1.chaAt(4) return 'o'
            char c = s1.charAt(4); //o
            System.out.println(c); // 'o'

            s1 = "Vincent";
            // Approach 1
            int lastCharindex = s1.length()-1;
            char lastChar = s1.charAt(lastCharindex);
            
            // Approach 2
            lastChar = s1.charAt(s1.length()-1);
            
            // what if we always get the last character of the string
            System.out.println(lastChar);
          
      
        }

      }


