package charles_java_exercise.src;

/**
 * Expected Output: 8
 */
public class Exercise10 {
    int x; // Create an instance attribute
    int y;

    // Create a class constructor for the Main class
    public Exercise10(int x) {
        this.y = x;
        // Set the value for the instance attribute x to expected output
    }

   


    public static void main(String[] args) throws Exception {
        // Create an instance of this class Exercise10
      Exercise10 x= new Exercise10(8);
    
        // Print the value of instance attribute
        System.out.println(x.y);
    }
}
