public class JobOccupation implements LabourForce {
  private double income;
  private String name;
  private int age;
  private double tax;


  @Override
  public void income(double income){
    this.income = income;
   
  }

  @Override
  public void name (String name){
    this.name = name;
  }

  @Override
  public void age (int age){
    this.age = age;
  }

}