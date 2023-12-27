import java.util.Scanner;

public class charlesJavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    System.out.print("Please input target character to count: ");
    Scanner input=new Scanner(System.in);
    Character target = input.next().charAt(0); // Update this target to test the logic
    Integer count=0;
    for (Integer i=0; i<str.length()-1; i++ ){
       if(target==str.charAt(i)){
        count++;
    }
      }
    
    if (count ==0){
        System.out.print("Not Found.");
  }else {
    System.out.print("We found "+count+" character "+ target+ " in the String.");
}
    // Use a loop to count the target of character in a String.
    // code here

    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here

  }
}