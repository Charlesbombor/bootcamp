package demo_nested_class.father;

public interface Driver {
  void drive();
  

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
