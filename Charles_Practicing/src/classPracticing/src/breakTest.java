package classPracticing.src;

import java.util.Arrays;

public class breakTest {
  public static void main(String[] args) {
    int[] nums = new int[] {3, 3};
    int[] ans = new int[2];
    int target = 6;
    boolean found = false;
    for (int i = 0; i < nums.length; i++) {
      int t = target - nums[i];
      for (int j = 0; j < nums.length; j++) {

        if (t == nums[j] && i != j) {
          ans[0] = i;
          ans[1] = j;
          found = true;
          break;
        }

      }
      if (found == true)
        break;
    }
    System.out.println(Arrays.toString(ans));
  }
}
