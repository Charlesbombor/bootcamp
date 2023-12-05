import java.util.Arrays;

public class charlesJavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    
    int i = 0;
    int j = 1;
    int k = 0;
    int []f = new int[15];
    for (i=0; i<=14; i++){
    if (i==0){
      f[i] = j;
    }else{
      f[i] = k+j;
      j = f[i];
      k = f[i-1];
     }
    }
    System.out.println(Arrays.toString(f));
    // for loop to print first 15 numbers in Fibonacci Sequence

  }
}
