package demo_class.src.Debtboy;

import java.time.LocalDate;

public class Debtboy {

  private Debt []debts;
  private String name;
  

  public Debtboy(){

  }

  public Debtboy (String name, Debt debts){
    this.name = name;
    this.debts = new Debt[]{debts};
  }

  public void setDebtboy (String name, Debt debts){
    this.debts =new Debt[]{debts};
    this.name = name;
  }

  public String getDebtboy(){
    return this.name;
  }

public static void main(String[] args) {
  Debt d1 = new Debt(1, 100, LocalDate.of(2023,1,1));
  Debtboy p1 = new Debtboy("John", d1 );
  Debtboy p2 = new Debtboy("David", new Debt(2, 200, LocalDate.of(2023, 1, 1)));
  Debtboy p3 = new Debtboy();
  System.out.println( p2.getDebtboy());
}


}

