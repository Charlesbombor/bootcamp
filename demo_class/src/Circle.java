package demo_class.src;

public class Circle {
  private double radius;

  
// Empty Constructor
  public Circle(){
  
  }

  // Argument Constructor
  public Circle(double radius){
    this.radius = radius;
  }

  public void setRadius (double radius){
    this.radius= radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double diameter(){ 
    return this.radius*2;
  }

  // Instance Method
  public double area(){
    //return this.radius*this.radius*3.14;
    // Math library
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(); // radius=0.0
    Circle circle1 = new Circle(1.2d);
    circle.getRadius();
    Circle circle2 = new Circle(3.4d);
    System.out.println(circle2.getRadius());
    System.out.println(circle2.area());
    System.out.println(circle1.area());
    System.out.println(circle1.diameter());
    // Pass by reference
    circle1 = circle2;


  }
}
