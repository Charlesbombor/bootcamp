package classPracticing.interfaceVehicle;

public class Taxi implements Vehicle {
  private int speed;
  public static final int MAX_SPEED = 100;

  public Taxi (int speed){
    
  }

  public Taxi(){

  }

  public boolean isOn(){
    return this.speed > 0;
  }

  public boolean isStopped(){
    return this.speed <= 0;
  }

  @Override
  public boolean start() {
    if (this.speed > 0)
    return false;
    this.speed = 10;
    return true;
  }

  public boolean isOverMaxSpeed(){
    return this.speed > MAX_SPEED;
  }

public int getSpeed(){
  return this.speed;
}

  @Override
  public boolean stop() {
    if (isStopped())
    return false;
    this.speed = 0;
    return true;
  }

  @Override
  public boolean accelerate() {
    if (isStopped())
    return false;
    this.speed += 10;
    if (isOverMaxSpeed())
    this.speed = Taxi.MAX_SPEED;
    return true;
  }


  @Override
  public boolean brake() {
   if (isStopped())
   return false;
   this.speed -= 10;
   return true;
  }

  public static void main(String[] args) {
    Taxi t1;
    Taxi t2 = new Taxi (0);
    //t1 = null;
    //t1.start();
    t2.start();
    System.out.println(t2.getSpeed());
    System.out.println(MAX_SPEED);
    System.out.println(Taxi.MAX_SPEED);
    System.out.println(t2.isStopped());


  }
  
}
