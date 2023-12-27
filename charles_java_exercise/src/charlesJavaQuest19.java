import java.util.HashMap;
import java.util.Map;

/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class charlesJavaQuest19 {
  // Declare instance variables carYear and carModel
  private int carYear;
  private String carModel;

  // Constructor with variables carYear and carModel
  public charlesJavaQuest19 (int carYear, String carModel){
    this.carYear = carYear;
    this.carModel = carModel;
  }

  public int  getCarYear (){
    return this.carYear;
  }

  public String getCarModel (){
    return this.carModel;
  }



  public static void main(String[] args) {
    // Create an instance of class JavaQuest19, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    charlesJavaQuest19 car = new charlesJavaQuest19(2020, "ModelY");
    System.out.println("Car Year=" + car.getCarYear()   
                      + ", " + "Car Model=" + car.getCarModel());
  }
}