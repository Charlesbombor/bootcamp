import java.math.BigDecimal;
import java.util.Arrays;

public abstract class Shape {  
  // abstract class vs class 
  // Difference:
  // 1. Cannot be "new"
  // 2.May contain abstract method(s), implicitly public
  
  // Same:
  // 1. May have instrance variable (attributes)
  // 2. May have intance methods
  // 3. May have static methods
  // 4. Must contain constructor, but cannot be "new", for super() only

  // Constructor
  private String color;
  private Shape[] shapes;

  public Shape () {

  }

  public Shape (String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }


  abstract double area(); // implicitly public

  public static double totalArea(Shape[] shapes){
    BigDecimal total = BigDecimal.valueOf(0);
    for(Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
      // shape.area() -> runtime -> which object (circle / square) -> different implementation of area()
    } 
  return total.doubleValue();
}

  

  public static void main(String[] args) {
    double shapeTotal;
    

    Shape s1 = new Circle(3.0, "Yellow"); // Polymorhism
    // Java Compile Time:ｓ1 has area() method, getColor()
    System.out.println(s1.area());
    System.out.println(s1.getColor());
     //System.out.println(s1.getRadius());
     Circle c2 = (Circle) s1; // downcast form shape to circle
     System.out.println("c2 " + c2.getRadius());

    Circle c1 = new Circle(3.0, "Blue");
    Shape s2 = new Circle();
    s2 = (Shape) c1;
    //System.out.println(s2.getRadius());
    System.out.println(c1.area());
     System.out.println(c1.getRadius());
     System.out.println(c2.getColor());

     Shape s3 = new Square(4.0, "Black");

    Shape[] shapes = new Shape[]{c1,s2,s3};
    System.out.println("Total Area " + totalArea(shapes));

    Shape [] shapes2 = new Shape[]{new Circle(4.2), new Square(9)};
   
    System.out.println(totalArea(shapes2));
    
Circle cTest = new Circle(4.2);
Square sTest = new Square(9);
System.out.println(cTest.area());
System.out.println(sTest.area());
System.out.println(cTest.getRadius());

    
  }
  
}
