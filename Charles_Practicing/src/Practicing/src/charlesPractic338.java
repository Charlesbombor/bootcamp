package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;

public class charlesPractic338 {
  public static void main(String[] args) {

    int n = 5;
    int i = 0;
    int j = 0;
    int count = 0;

    String[] arr = new String[n + 1];

    for (i = 0; i <= n; i++) {
      count = 0;
      arr[i] = Integer.toBinaryString(i);
      for (j = 0; j < arr[i].length(); j++) {
        if (arr[i].charAt(j) == '1')
          count++;
      }
      arr[i] = Integer.toString(count);
    }

    System.out.println(Arrays.toString(arr));

  }
}
