public class Taxi implements Vehicle{ // Class Signature
  private int speed;
  private int capacity;

  public static final int MAX_SPEED = 100;

  public Taxi(){

  }

  private Taxi (int speed){
    this.speed = speed;
  }

  public Taxi (int speed, int capacity){

  }

  public static Taxi small(){ // Taxi.small()
    return new Taxi(0, 4);
  }

  public static Taxi big(){
    return new Taxi(0, 5);
  }

  public boolean isOn(){
    return this.speed > 0;
  }

  public boolean isStopped(){
    return this.speed <= 0;
  }

  public boolean isOverMaxSpeed(){
    return this.speed > Taxi.MAX_SPEED;
  }

  // setter
  public void setCapacity (int capacity){
    this.capacity = capacity;
  }

  // getter
  public int getSpeed(){
    return this.speed;
  }


  public int getCapacity (){
    return this.capacity;
  }



  @Override // let the compiler to validate the relationship of inheritance
  public boolean start(){
    if (isOn())
    return false;
    this.speed = 10;
    return true;
  }
  
  @Override
  public boolean stop(){
    if (isStopped())
    return false;
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate(){
    if (isStopped())
    return false;
    this.speed += 10;
    if (isOverMaxSpeed())
    this.speed = Taxi.MAX_SPEED;
    return true;

  }

  @Override
  public void brake(){
    this.speed -=10;
  }

  public static void main(String[] args) {
    Taxi t1 = Taxi.small();
    t1.start();
    t1.accelerate();
    t1.accelerate();
    t1.brake();
    t1.stop();
    System.out.println(Vehicle.x);
  }


}
