package demo_class.src;

public class Gun {
  private String model;
  private int power;

  
  public static void main(String[] args) {
    Gun g1 = new Gun();
    g1.setModel("AK-47");
    g1.power(9);
    System.out.println(g1.authority());
    Gun g2 = new Gun("PPK");
    g2.power(4);
    System.out.println(g2.authority());
    
  }

  public Gun(){

  }

 

  public Gun (String model){
    this.model = model;
  }

  public void setModel (String model){
    this.model = model;
  }

  public String getModel(){
    return this.model;
  }

  public String authority(){
    String authority;
    if (power >= 7){
    return authority = "illegal";
    } else {
      return authority = "legal";
    }

  }

  public void power (int power){
    this.power = power;
  }
}
