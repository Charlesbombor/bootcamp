public interface  Vehicle { // "Vehicle" is an abstract Word

  // interface has NO instrance variable
  int x = 10; // implicitly "public static final"

  // interface is a contract with abstract behaviors (abstract methods)

  // if a class implement an inferface, it has to implement all its abstract method 
  // (all or nothing)

  boolean start(); // implicitly "pubic abstract" method
  // public interface void start();

  boolean stop();

  boolean accelerate();
  
  void brake();

  public static void main(String[] args) {
    // x --> static?
    System.out.println(Vehicle.x); // 10, interface --> static final
  }
}
