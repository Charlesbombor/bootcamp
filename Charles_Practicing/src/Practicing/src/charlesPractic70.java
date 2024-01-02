package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class charlesPractic70 {
  public static void main(String[] args) {

    int n = 10;
    int i;
    int[] arr = new int[45];

    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;

    for (i = 1; i < 43; i++) {
      arr[i + 2] = arr[i] + arr[i + 1];
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(arr.length);

    Map<Integer, Integer> steps = new HashMap<>();
    for (i = 0; i < 45; i++) {
      steps.put(i + 1, arr[i]);
    }
    System.out.println(steps.get(n));

  }
}
