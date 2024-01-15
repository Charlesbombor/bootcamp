package Charles_Practicing.src.Practicing.src;

import java.util.ArrayList;
import java.util.List;

public class charlesPractic728 {
  public static void main(String[] args) {
    int left = 47;
    int right = 85;
    int number = 0;
    
    List<Integer> ans = new ArrayList<>();
    List<Integer> digits = new ArrayList<>();
    int i = 0;
    int j = 0;
    boolean divid = false;

    for(i=left; i<=right; i++){
      number = i;
      digits.clear();
    while (number != 0 || i < 0) {
      int digit = number % 10;
      digits.add(digit);
      number = number / 10;
    }

    for (j = 0; j < digits.size(); j++) {
       if (i < 10 && i > 0){
      divid = true;
      break;
      }
      if(digits.get(j) == 0){
      divid = false;
      break;
    }
      if (i % digits.get(j) != 0){
        divid = false;
        break;
      }
      else
        divid = true;
    }
    if (divid == true)
    ans.add(i);
  }
   
   System.out.println(ans);
  }
}
