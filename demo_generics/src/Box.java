package demo_generics.src;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
  T t;

  public void setT(T t){
    this.t = t;
  }

  public T getT(){
    return t;
  }

  public static <T>  Box<T> createBox(T t){
    Box<T> box = new Box<>();
    box.setT(t);
    return box;
  }

  public static double calculate(Box<Shape> box){
    return box.getT().area(); // 
  }

  public static void addShape (List<Shape> ls, Shape shape){
    ls.add(shape);
  }

  public static <U extends Shape> void xxx(U u){
    u.area();
  }


  // this design is NOT OKAY. unexpected outcome may occur at run time
  public static <T extends Shape> void addShape2 (List<? extends Shape> ls, Shape shape){
    List<Shape> ls2 = (List<Shape>) ls;
    ls2.add(shape);
  }

  // this example show how to use super
  public static void addShape3 (List<? super Circle> ls, Shape shape) {
    ls.add(new Circle(3.0));
    ls.add(new SmallCircle(3.0));
  }



  @Override
  public String toString(){
    return t.toString();
  }

  public static void main(String[] args) {
    Box<Circle> circleBox = new Box<>();
    circleBox.setT(new Circle(3.0));
    Box<Shape> circleShape = new Box<>();
    circleShape.setT(new Circle(2.0));
    System.out.println(Box.createBox(1.0));
    Box<Circle> shape1 = Box.createBox(new Circle(1.5));
    // calculate(circleBox); // error, Box<Circle> <-> Box<Shape> is not Parent relationship

    //
    List<? extends Object> xs = new ArrayList<>();
    xs.add();
    Object o = xs.get(0);

    List<? extends Shape> ls = new ArrayList<Shape>();
    ls = new ArrayList<Circle>();
    Shape o3 = ls.get(0);

    

    Shape s = new Circle(3.0);
    System.out.println(s.area()); // 28.xxx
    s = new Shape();
    System.out.println(s.area()); // -1
  }
  

}
