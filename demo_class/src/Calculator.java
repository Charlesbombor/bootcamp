package demo_class.src;

import java.math.BigDecimal;

public class Calculator {
  private BigDecimal x;
  private BigDecimal y;

  public Calculator (BigDecimal x, BigDecimal y){
    this.x =x;
    this.y =y;
  }

  public double add(){

    return this.x.add(this.y).doubleValue();

}

public double subtract (){
  return this.x.subtract(this.y).doubleValue();
}
    public static Calculator of (double a, double b){
      return new Calculator(BigDecimal.valueOf(a), BigDecimal.valueOf(b));
    }

    
    
    public static void main (String[] args){
      Calculator c1 =  new Calculator(BigDecimal.valueOf(0.1), BigDecimal.valueOf(0.2));

      Calculator c2 = Calculator.of(0.2, 0.1);
      System.out.println(c1.subtract());
      System.out.println(c2.add());
  }
}
