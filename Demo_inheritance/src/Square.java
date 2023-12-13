import java.math.BigDecimal;

public class Square extends Shape{
  private double length;
  private String color;

  public Square (){

  }

  public Square(int length){
    this.length = length;
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
    return Math.pow(this.length, 2);
  }

  public static void main(String[] args) {
  
  }
}
