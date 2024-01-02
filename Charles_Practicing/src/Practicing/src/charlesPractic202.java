package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;

public class charlesPractic202 {
  public static void main(String[] args) {
    int n = 7;
    int check = 0;
    int i = 0;
    String s = "";
    boolean happy = false;


    while (n > 1) {
      s = Integer.toString(n);
      int[] arr = new int[s.length()];
      n = 0;
      for (i = 0; i < s.length(); i++) {
        arr[i] = (int) Math.pow(Character.getNumericValue(s.charAt(i)), 2);
        check = arr[i];
        n += arr[i];
      }
      if (check == 0){
       happy = false;
       break;
      }
    }

    System.out.println(n);
    if (n == 1)
      happy = true;
    else
      happy = false;

    System.out.println(happy);

  }
}
