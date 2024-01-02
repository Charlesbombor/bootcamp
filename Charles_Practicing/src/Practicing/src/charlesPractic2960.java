package Charles_Practicing.src.Practicing.src;

import java.util.ArrayList;

public class charlesPractic2960 {
  public static void main(String[] args) {
    int[] batteryPercentages = new int[]{0,1,2};
    int count = 0;

    ArrayList<Integer> test = new ArrayList<>();
    for (int num : batteryPercentages){
      num = num - count;
      System.out.println(num);

      if(num > 0)
      count++;
      System.out.println("c " + count);
      
      //System.out.println("n " + num);
      test.add(num);
      
      System.out.println("t " + test);
    }
    System.out.println(count);

  }
}
