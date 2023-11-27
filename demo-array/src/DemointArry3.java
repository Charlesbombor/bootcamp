import java.util.Arrays;

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
    int[]arr2 = new int[]{100,-20,4,100,500};
    int targetIndex =1;
    // for loop
    // expected result = {100,4,100,500,-20}
    
    temp=0;
    for (int x=targetIndex; x<=arr2.length-1; x++){
      
      
      if (x<=arr2.length-2){
      temp = arr2[x];
      arr2[x]=arr2[x+1];
      arr2[x+1] = temp;
     }
  }
   // arr2[arr.length]=last;
    
    System.out.println("arr2 last index is " + arr2[arr.length]);
    System.out.println("arr2 length is " + arr2.length);

    System.out.println(Arrays.toString(arr2));
  }
}
