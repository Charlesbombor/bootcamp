import java.math.BigDecimal;

public class Square extends Shape{
  private double length;
  private String color;

  public Square (){

  }

  public Square (double length, String color){
    this.length = length;
    this.color = color;
  }

  public double getLength (){
    return this.length;
  }

  @Override
  public double area (){
    return (BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length))).doubleValue();
  }

  public static void main(String[] args) {
  
  }
}
