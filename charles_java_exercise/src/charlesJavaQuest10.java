  import java.util.Arrays;
import java.util.Scanner;


public class charlesJavaQuest10 {


/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array


  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
    int i = 0;
    int[] newArray = new int[my_array.length];

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here
    if (indexPosition == my_array.length){
      System.out.println(my_array);
    }

    for (i = 0; i < indexPosition; i++){
      newArray[i] = my_array[i];
    }
    i = 0;
    for (i = indexPosition+1; i < my_array.length; i++){
      newArray[i] = my_array[i];
     }

     newArray[indexPosition] = newValue;
     my_array = newArray;

    System.out.println("New Array: " + Arrays.toString(my_array));
  }
}
