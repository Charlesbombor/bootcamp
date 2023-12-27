package Practicing.src;

import java.util.ArrayList;
import java.util.Collections;

public class charlesPractic1913 {
  public static void main(String[] args) {
    int[] nums = new int[]{5,6,2,7,4};
    int result = 0;
    int length = 0;

     ArrayList<Integer> arr = new ArrayList<>();
     for (Integer numbers : nums)
      arr.add(numbers);

      Collections.sort(arr);
      System.out.println(arr);
      length = nums.length;
      result = (arr.get(length-1)*arr.get(length-2)) - (arr.get(0)*arr.get(1));
      System.out.println(result);

      // my original way
      // ArrayList<Integer> arr = new ArrayList<>();
      // int max1 = 0;
      // int max2 = 0;
      // int min1 = 10001;
      // int min2 = 10001;

      // for (Integer numbers : nums){
      //     arr.add(numbers);
      //     if (numbers > max1){
      //         max2 = max1;
      //         max1 = numbers;
      //     } else
      //     if (numbers > max2)
      //         max2 = numbers;

      //     if (numbers < min1){
      //         min2 = min1;
      //         min1 = numbers;
      //     }else
      //     if (numbers < min2)
      //         min2 = numbers;
      // }
  }
}
