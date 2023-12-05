public class charlesJavaQuest7 {
 
    // Sum values of an array
    public static void main(String[] args) {
      // Declare a int array, with value 1 to 10
      int []arr = new int[]{1,2,3,4,5,6,7,8,9,10};
      // code here
      int sum = 0;
      int i = 0;
      for (i=0; i < arr.length; i++){
        sum = sum + arr[i];
      }
  
      // Write a loop to sum up all value in the int array
      // code here
      System.out.println("The sum is " + sum);
    }
  }

