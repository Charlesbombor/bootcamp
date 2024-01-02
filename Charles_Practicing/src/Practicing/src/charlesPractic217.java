package Charles_Practicing.src.Practicing.src;

import java.util.HashSet;
import java.util.Set;

public class charlesPractic217 {
  public static void main(String[] args) {
    boolean dup = false;
    int[] nums = new int[] {1, 2, 3, 4};

    Set<Integer> digits = new HashSet<>();

    for (int numbers : nums) {
      System.out.println(digits.add(numbers));
      if (digits.add(numbers) == false) {
        System.out.println("@" + digits.add(numbers));
        dup = true;
        System.out.println("*" + dup);
        
      } 
    
      if (dup = true)
      break;
  }
    System.out.println(dup);



  }
}
