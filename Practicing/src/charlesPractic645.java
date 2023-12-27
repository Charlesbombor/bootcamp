package Practicing.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class charlesPractic645 {

  public static void main(String[] args) {

    int[] nums = new int[] {8, 7, 3, 5, 3, 6, 1, 4};

    int len=nums.length;
        int an=0;
        int arr[]=new int[10001];
        int ans[]=new int[2];
        int count=0;
         
        for(int i=0;i<len;i++){
            arr[nums[i]]++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<len+1;i++){
            if(arr[i]==2){
                ans[0]=i;
                count++;
            }
            else if(arr[i]==0){
                count++;
                ans[1]= i;
            }

            if(count==2){
                break;
            }
        }

    // int[] result = new int[2];
    // int i = 0;
    // int j = 0;
    // int counter = 0;

    // String str;

    // ArrayList<Integer> number = new ArrayList<>();
    // for (int num : nums) {
    //   number.add(num);
    // }
    // // missing
    // for (i = 1; i <= nums.length; i++) {
    //   if (!number.contains(i)) {
    //     result[1] = i;
    //   }
    // }


    // duplicate by for-loop
    // for (i = 1; i <= nums.length; i++) {
    //   counter = 0;
    //   for (j = 0; j < nums.length; j++) {
    //     if (nums[j] == i) {
    //       counter++;
    //     }
    //     if (counter > 1) {
    //       result[0] = i;
    //       break;
    //     }
    //   }
    // }

    // duplicate by HashSet

    // HashSet<Integer> set = new HashSet<>();
    // for (int num : nums){
    //   if (!set.add(num)){
    //   result[0] = num;
    //   break;
    //   }
    // }





    System.out.println(Arrays.toString(ans));
  }
}

