package classPracticing.interfaceVehicle;

public interface Vehicle {
  boolean start();
  boolean stop();
  boolean accelerate();
  boolean brake();

  public static void main(String[] args) {
    Vehicle V1 = new Vehicle();
  }

  
} 