package demo_builder_pattern.src;

public class Staff {
  private String name;
  private int yearOfExp;

  public Staff(){

  }

  public static Staff builder(){
    return new Staff();
  }

  public Staff name(String name) {
    this.name = name;
    return this;
  }

  public Staff yearOfExp (int yearOfExp){
    this.yearOfExp = yearOfExp;
    return this;
  }
  
  public void setName (String name) {
    this.name = name;
  }

  public void setYearOfExp (int yearOfExp){
    this.yearOfExp = yearOfExp;
  }

  public static void main(String[] args) {
    
    Staff staff = Staff.builder()   //
      .name("John")   //
      .yearOfExp(3);
  }
}
