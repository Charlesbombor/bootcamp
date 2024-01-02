package Charles_Practicing.src.Practicing.src;

import java.util.Arrays;

public class charlesPractic1422 {

  public static void main(String[] args) {
    String s = "1111";
    int[] score0 = new int[s.length() - 1];
    int[] score1 = new int[s.length() - 1];
    int i = 0;
    int j = 0;
    int sumScore = 0;
    int result = 0;
    String str1;
    String str2;

    for (i = 0; i < s.length() - 1; i++) {
      str1 = s.substring(0, i + 1);
      for (j = 0; j < str1.length(); j++) {
        if (str1.charAt(j) == '0') {
          score0[i]++;
        }
      }
    }

    for (i = 0; i < s.length() - 1; i++) {
      str2 = s.substring(i + 1);
      for (j = 0; j < str2.length(); j++) {
        if (str2.charAt(j) == '1') {
          score1[i]++;
        }
      }
    }

    for (i=0; i<score0.length; i++){
    sumScore = score0[i] + score1[i];
    if (sumScore > result){
      result = sumScore;
    }
  }
System.out.println(result);
  }
}


