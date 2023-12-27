package Practicing.src;

import java.util.ArrayList;
import java.util.Arrays;

public class charlesPractic1758 { //wrong ans
  public static void main(String[] args) {
    String s = "110010";
    int length = s.length();
    int count = 0;
    int i = 0;
    int[] arr = new int[length];
    //System.out.println(length);
   

    // case of two index
    if (s.length() == 2 && s.charAt(0) == s.charAt(1))
      count++;
    else
      count = 0;

    // String to array
    for (i = 0; i < length; i++) {
      arr[i] = s.charAt(i) - 48;
    }
          


    if (length > 2) {
      // case1
      if (arr[0] == arr[1] && arr[1] == arr[2]) {
        count++;
        if (length > 3) {
          for (i = 2; i < length-1; i++) {
            if (arr[i + 1] == arr[i]){
              count++;
              if (arr[i+1] == 0)
            arr[i + 1] = 1;
            else
            arr[i+1] = 0;
          }
          }
        }
      }
      // case 2
      if (arr[0] != arr[1] && arr[1] == arr[2]) {
        count+=2;
        // if (arr[2] == 0)
        //   arr[2] = 1;
        // else
        //   arr[2] = 0;

        if (length > 3) {
          for (i = 2; i < length-1; i++) {
            if (arr[i + 1] == arr[i]){
              count++;
            if (arr[i+1] == 0)
            arr[i + 1] = 1;
            else
            arr[i+1] = 0;
          }
          }
          System.out.println(Arrays.toString(arr));
        }
      }
      // case 3
      if (arr[0] == arr[1] && arr[1] != arr[2]) {
        count+=2;
        if (arr[1] == 1)
        arr[1] = 0;
        else
        arr[1] = 1;

        if (arr[2] == 1)
        arr[2] = 0;
        else
        arr[2] = 1;
        
        if (length > 3) {
          for (i = 2; i < length-1; i++) {
            if (arr[i + 1] == arr[i]){
              count++;
           if (arr[i+1] == 0)
            arr[i + 1] = 1;
            else
            arr[i+1] = 0;
            }
          }
        }
      }
      // case 4
      if (arr[0] != arr[1] && arr[1] != arr[2] && length > 3){
         for (i = 2; i < length-1; i++) {
            if (arr[i + 1] == arr[i]){
              count++;
            if (arr[i+1] == 0)
            arr[i + 1] = 1;
            else
            arr[i+1] = 0;
         }
          }
      }

    }

    System.out.println(count);



  }
}


