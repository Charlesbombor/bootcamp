package Charles_Practicing.src.Practicing.src;

import java.util.LinkedList;
import java.util.List;

public class charlesPractic2970 {
  public static void main(String[] args) {
    int[] nums = new int[] {1,2,3,4};

    int leng = nums.length;
    int i = 0;
    int j = 0;
    int k = 0;

    int idx = 0;
    int count = 0;
    boolean sorted = true;
    List<Integer> digits = new LinkedList<>();
    for (int numbers : nums) {
      digits.add(numbers);
    }
    List<Integer> index = new LinkedList<>();



    // for (j = 0; j < digits.size(); j++) {
    // index.add(digits.get(j));
    // digits.remove(j);
    // // check if sorted and count
    // for (i = 0; i < digits.size()-1; i++) {
    // if (digits.get(i) > digits.get(i + 1)) {
    // sorted = false;
    // break;
    // }
    // }
    // if(sorted = true)
    // count++;
    // digits.add(j,index.get(j));
    // //System.out.println(digits);
    // }
    // System.out.println("count " + count);



    // for (j = 0; j < digits.size()-1; j++) {
    // index.add(0, digits.get(j));
    // digits.remove(j);
    // index.add(0, digits.get(j));
    // digits.remove(j);
    // System.out.println("index " + index);
    // System.out.println("digits " + digits);
    // // check if sorted and count
    // for (i = 0; i < digits.size() - 1; i++) {
    // if (digits.get(i) > digits.get(i + 1)) {
    // sorted = false;
    // break;
    // }
    // }
    // if (sorted = true)
    // count++;
    // digits.add(j, index.get(0));
    // index.remove(0);
    // digits.add(j, index.get(0));
    // index.remove(0);
    // //index.clear();
    // System.out.println("reboot digits " + digits);
    // }
    // System.out.println("count " + count);



    System.out.println(digits);

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
          if (digits.get(i) < digits.get(i + 1))
            sorted = true;

          else if (digits.get(i) >= digits.get(i + 1)) {
            sorted = false;
            break;
          } 
          
        }

        System.out.println(sorted);
        if (sorted == true)
          count++;
        System.out.println(count);


        for (k = 0; k < idx; k++) {
          digits.add(j, index.get(0));
          index.remove(0);
        }
      }


      System.out.println("reboot digits " + digits);
    }

    System.out.println(count);

  }
}
