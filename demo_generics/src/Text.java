package demo_generics.src;

public class Text<T> extends Box<T> {

  T t;

  public static void main(String[] args) {
    Test test = new Test();
    Object o = test.t;
  }
  
}
