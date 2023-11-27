public class DemointArray2 {
  public static void main(String[] args) {
    // int array 10, 8, 6,4,2
    int[]arr =new int[]{10,8,16,4,2};
    // for loop -> sum
    int sum=0;
    for (int x =0; x<arr.length; x++){
      sum += arr[x];
    }
    System.out.println(sum);

    // find the max value
    int max = Integer.MIN_VALUE; // -21xxxxxxxxx
    int x=0;
    for (x=0; x<arr.length; x++){
      if (arr[x] > max){
        max = arr[x];
        
      }
    }
    System.out.println("max " + max);

    //Find the min value
    int min = Integer.MAX_VALUE;
    for ( x=0; x<arr.length; x++){
      if (arr[x] < min){
        min = arr[x];
      }
    }
    System.out.println("min= " + min);

    // second max value
    max = Integer.MIN_VALUE;
    int SecMax =Integer.MIN_VALUE;
    
    for (x=0; x<arr.length; x++){
      if (arr[x]>max){
      SecMax = max;
      max = arr[x];
     // SecMax= max;
      
    }else if(arr[x] > SecMax){
      SecMax = arr[x];
    }  

    } 
    System.out.println("Second max value is " + SecMax);



    
  }
  
}
