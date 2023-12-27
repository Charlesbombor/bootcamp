package demo_generics.src;

public class Circle extends Shape {
  private double radius;

  @Override
  public double area(){
    return this.radius * this.radius * Math.PI;
  }
 

  public Circle(double radius){
    this.radius = radius;
  }
}
