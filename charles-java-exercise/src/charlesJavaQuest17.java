import java.util.Arrays;

public class charlesJavaQuest17 {
  /*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5.
 * Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 :
 * Input : num = 3535
 * Output : 3333
 * 
 * Example 2 :
 * Input: num = 5555
 * Output: 3355
*/


  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {
    String digit;
    int i;
    int counter=0;
    digit = String.valueOf(num);
   
    char [] number = new char[digit.length()];
    for (i=0; i<digit.length(); i++){
      number[i] = digit.charAt(i);
    }
    
    for (i=0; i<digit.length(); i++){
      if (number[i] == '5' && counter < 2){
        number[i] = '3';
        counter++;
      }
    }
    digit = "";
    for (i=0; i<number.length; i++){
    digit += String.valueOf(number[i]);
  }
   
    num = (int)Integer.valueOf(digit);
    return num;

  }
}

