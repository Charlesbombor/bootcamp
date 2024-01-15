package Charles_Practicing.src.Practicing.src;

import java.util.ArrayList;
import java.util.List;

public class charlesPractic2970b {
  public static void main(String[] args) {
    int[] nums = new int[] {6,5,7,8};

    int leng = nums.length;
    int i = 0;
    int j = 0;
    int k = 0;

    int idx = 0;
    int count = 0;
    boolean sorted = true;
     List<Integer> digits = new ArrayList<>();
      digits.add(6);
    
  

    System.out.println(digits);

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
  }
}
