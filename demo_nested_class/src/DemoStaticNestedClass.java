package demo_nested_class.src;

public final class DemoStaticNestedClass { // OUter Class

  public static class Calculator{ // nested Class
     // attributes
    private int x;
   
    // constructor
    public Calculator(int x){
      this.x = x;
    }
    // instance mehtod
    public void add(int y){
      this.x += y;
    }

    public int getX(){
      return this.x;
    }
  }
  public static void main(String[] args) {
    DemoStaticNestedClass d = new DemoStaticNestedClass();

    DemoStaticNestedClass.Calculator c = new DemoStaticNestedClass.Calculator();

    Calculator calculator = new Calculator();
  }
}
