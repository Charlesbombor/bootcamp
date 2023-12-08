package demo_class.src.Debtboy;

import java.time.LocalDate;

public class Debt {
  private double amount;
  private int cases;
  private LocalDate date;

  public Debt(){
  
}

public Debt (int cases, double amount, LocalDate date){
  this.amount = amount;
  this.date = date;
  this.cases = cases;
}

public void setAmount (double amount){
  this.amount = amount;
}

public double getAmount (){
  return this.amount;
}

public int getCases (){
  return this.cases;
}

public static void main(String[] args) {
  Debt d1 = new Debt(1, 100, LocalDate.of(2023, 1, 1));
}
}


