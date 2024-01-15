package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;

public class CharlesPractic557 {
  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    String ans = "";
    StringBuilder ss = new StringBuilder();
    String[] words = s.split(" ");
    

    System.out.println(Arrays.toString(words));

    for (String str : words){
      StringBuilder strings = new StringBuilder(str).reverse();
     ss = ss.append(strings).append(" ");

    ans = ss.toString();
      System.out.println(ans);
      System.out.println(s.reverse())

    }


    
    // StringBuilder reversed = new StringBuilder(s).reverse();

    // String output = reversed.toString();
    // System.out.println(output);
  }
}
