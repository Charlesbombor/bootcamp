import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;
 

  public Circle() {
    // super(); // calling shape()
  }

  public Circle (double radius){
    this.radius = radius;
  }

  public Circle (double radius, String color){
    // super(); // calling shape()
    super(color);  // inherit the color of superClass which is in .getColor method
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  // Circle extends Shape
  // Circle extends Shape, so it has to override all abstract
 @Override
  public double area(){

    return BigDecimal.valueOf(radius)
                      .multiply(BigDecimal.valueOf(this.radius))
                      .multiply(BigDecimal.valueOf(Math.PI))
                      .doubleValue();
                      // divide() --> 10/3 ---> 3.33333333, x.divide(y, 2, RoundingMode.HALF_UP
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(2.0, "red");

    System.out.println(c1.area());
    Circle c2 = new Circle(3.0, "yellow");
    System.out.println(c2.area());
    }
}
