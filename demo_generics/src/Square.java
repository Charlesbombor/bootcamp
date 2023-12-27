package demo_generics.src;

import java.math.BigDecimal;

public class Square extends Shape{
  private double length;

  public Square(){

  }

  public Square (double length){
    this.length = length;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(length)
            .multiply(BigDecimal.valueOf(this.length))
            .doubleValue();
  }
}
