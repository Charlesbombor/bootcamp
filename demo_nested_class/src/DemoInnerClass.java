package demo_nested_class.src;

public class DemoInnerClass { // Outer Class

  public class Calculator {

  }

  public static void main(String[] args) {
    DemoInnerClass d = new DemoInnerClass();
    DemoInnerClass.Calculator c = d.new Calculator();
    DemoInnerClass.Calculator c2 = new DemoInnerClass().new Calculator();
    

  }
}
