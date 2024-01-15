package Charles_Practicing.src.Practicing.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class charlesPractic561 {
  public static void main(String[] args) {
    int[] nums = new int[] {1, 4, 3, 2};

    int i = 0;
    int sum = 0;

    Arrays.sort(nums);
    //System.out.println(Arrays.toString(nums));

    for (i = 0; i < nums.length; i++) {
      if (i % 2 == 1)
        continue;
      sum += Math.min(nums[i], nums[i + 1]);
    }

    System.out.println(sum);

  }
}
