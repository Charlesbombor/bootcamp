import java.util.Arrays;
import java.util.Scanner;

public class DemointArry3 {
  public static void main(String[] args) {
    int[] arr = new int[]{100,-100,34};
    
    // for loop
    int temp=0;
    for (int x=0; x<arr.length; x++){
      if (x==0){
        //swapping
      temp=arr[x];
      arr[x]=arr[x+1];
      arr[x+1]=temp;
      }
    }
    System.out.println(Arrays.toString(arr));

    // move target index value to the tail of the array
    int[]arr2 = new int[]{100,-20,4,200,500};
    int targetIndex =1;
    // for loop
    // expected result = {100,4,200,500,-20}
    temp=0;
    for (int x=targetIndex; x<arr2.length-1; x++){
     // make the index not out of bound 5
      temp = arr2[x];
      arr2[x]=arr2[x+1];
      arr2[x+1] = temp;
     
  }
   
    
    System.out.println("arr2 last index is " + arr2[arr2.length-1]);
    System.out.println("arr2 length is " + arr2.length);
    System.out.println(Arrays.toString(arr2));

    //temp =0;
   // int[] arr3 = new int[] {100, -20, 100, 400, 4};
    //Scanner input = new Scanner(System.in);
    //System.out
     //   .println("Input whats your target index , index must be smaller then "
    //        + arr2.length + " : ");
   // targetIndex = input.nextInt();

   // if (targetIndex >= 0 && targetIndex < arr3.length) {
    //  temp = arr3[targetIndex];

     // for (int i = targetIndex; i < arr3.length - 1; i++) {
        
     //   arr3[i] = arr3[i + 1];
    //  }

    //  arr3[arr3.length - 1] = temp;
   // }

    //System.out.println("arr3: " + Arrays.toString(arr3));


    // Find Max value, and move to the tail
    int[]arr4=new int[]{100,4,1050,500,-20};
    int max=0;
    int i=0;
    int j=0;
    int maxindex=0;
    for (i=0; i<arr4.length; i++){
      if (arr4[i] > max){
        max=arr4[i];
        maxindex=i;
      }
    }
    System.out.println("Max value located at arr " + maxindex);
    for (j=maxindex; j<arr4.length-1; j++){
      temp = arr4[j];
      arr4[j]=arr4[j+1];
      arr4[j+1]=temp;

    }
    //arr4[arr4.length-1]=max;
    System.out.println("Max is " + max);
    System.out.println("arr4 " + Arrays.toString(arr4));

    int min=Integer.MIN_VALUE;
    System.out.println(min);
    

    int[]arr5=new int[]{100, 4, 1050, 500, -20};
    int temp1=0;
    for (j=0; j<arr5.length-1; j++){
     // if (arr5[j+1]<arr5[j]){
        //temp1=arr5[j+1];
        //arr5[j+1]=arr5[j];
       // arr5[j]=temp1;

     // }
   // }
   // System.out.println("arr5a " + Arrays.toString(arr5));
   for (i=0; i<arr5.length-j-1; i++){
     if (arr5[i]>arr5[i+1]){
       temp=arr5[i];
       arr5[i]=arr5[i+1];
       arr5[i+1]=temp;
      }
    }
  }
 // }
      System.out.println("arr5 " + Arrays.toString(arr5));
  }
}
