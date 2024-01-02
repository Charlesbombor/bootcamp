package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;

public class charlesPractic66 {
  public static void main(String[] args) {
    String str = "";
    int length = 0;
    int i = 0;
    int index = 0;
    int[] digits = new int[] {8,9,9,9};

    length = digits.length;
    int[] newDigits = new int[length+1];

    //System.out.println(length);
    

    for(i = length-1; i>=0; i--){
      if (digits[i] != 9){
      index = i;
       //System.out.println(index);
      break;
    }
    }

    if (length == 1 && digits[0] != 9)
      digits[0] += 1;
      //System.out.println(Arrays.toString(digits));


    if (index == 0 && digits[0] == 9){
      newDigits[0] = 1;
      for(i=1; i < length; i++){
        newDigits[i] = 0;
      }
    }

    if (index == 0 && digits[0] != 9){
      digits[0] += 1;
      for(i=length-1; i > index; i--){
        digits[i] = 0;
      }
    }
//System.out.println(Arrays.toString(digits));

    if (index == length-1 )
      digits[length-1] += 1;
//System.out.println(Arrays.toString(digits));

    if (index != length-1){
      digits[index] += 1;
      for(i=length-1; i > index; i--){
        digits[i] = 0;
      }
    }
//System.out.println(Arrays.toString(digits));

    }
  }

