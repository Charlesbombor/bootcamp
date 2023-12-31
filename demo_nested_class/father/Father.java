package demo_nested_class.father;

public class Father implements Driver {
  @Override
  public void drive() {
    System.out.println("Father is driving ... ");
  }

  public static void main(String[] args) {
    Driver driver = new Father();
    driver.drive();

    Driver driver2 = new Driver() {
      @Override
      public void drive() {
        System.out.println("Anonymous Inner Class ... driving...");
      }
    };
    driver2.drive();
  }
}
