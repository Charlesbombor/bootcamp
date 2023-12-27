import java.util.Arrays;

public class charlesJavaQuest16 {
  /*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]


  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1

    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));
    System.out.println(Arrays.toString(nums3));
  }


  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  public static int[] sumToZero ( int n){

    int i;
    int j;
    int k;
    int temp;
    int sum=0;
    int[] num = new int[n-1];
    int[] sort = new int[n];
    boolean gened = false;

    if (n==1){
      sort[0] = 0;
       return sort;
      }

    do{
      for (i=0; i<n-1; i++){
       num[i] = (int)Math.floor(Math.random()*21-10);
      }
      
      for (i=0; i<n-2; i++){
        for (j=0; j<n-2-i; j++){
          if (num[j] > num[j+1]){
            temp = num[j];
            num[j] = num[j+1];
            num[j+1] = temp;
          }
        }
       }

       sum = 0;
      for(k=0; k<n-1; k++){
      sum += num[k];
      }

      sort[n-1] = 0 - sum;
      for (i= 0; i<n-1; i++){
      sort[i] = num[i];
      }

      for (i=0; i<n-1; i++){
        for (j=0; j<n-i-1; j++){
          if (sort[j] > sort[j+1]){
            temp = sort[j];
            sort[j] = sort[j+1];
            sort[j+1] = temp;
          }
        }
       }

       for (j=0; j<n-1; j++){ // check unique
        if (sort[j] == (sort[j+1])){
          gened = false;
          
          break;
         }
         else {
          gened = true;
         }
        }
      }while(gened == false);
    
    return sort;
}
}


