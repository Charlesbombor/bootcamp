package Charles_Practicing.src.Practicing.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class charlesPractic2970a {
  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};

    int leng = nums.length;
    int i = 0;
    int j = 0;
    int k = 0;

    int idx = 0;
    int count = 0;
    boolean sorted = true;
    List<Integer> digits = new ArrayList<>();
    for (int numbers : nums) {
      digits.add(numbers);
    }
    List<Integer> index = new ArrayList<>();
    System.out.println("start");
    System.out.println(digits + "\n");

    for (idx = 1; idx < leng; idx++) {
      for (j = 0; j < digits.size() + (1 - idx); j++) {
        for (k = 0; k < idx; k++) {
          index.add(0, digits.get(j));
          digits.remove(j);
        }
        System.out.println("index " + index);
        System.out.println("digits " + digits);

        // check if sorted and count
        for (i = 0; i < digits.size() - 1; i++) {
          if (digits.get(i) < digits.get(i + 1)) {
            sorted = true;
            System.out.println("digits 123" + digits);

          } else if (digits.get(i) >= digits.get(i + 1)) {
            sorted = false;
            System.out.println("digits 456" + digits);

            break;
          }

        }

        System.out.println(sorted);
        if (sorted == true || digits.size() == 1)
          count++;
        System.out.println("count " + count);


        for (k = 0; k < idx; k++) {
          digits.add(j, index.get(0));
          index.remove(0);
        }
      }


      System.out.println("reboot digits " + digits);
      System.out.println();

    }

    System.out.println(count+1);

  }
}

