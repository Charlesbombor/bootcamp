package demo_generics.src;

public class Bag<T> { // <T> is a scope (No scope - you can put any class for T)
// <T> = <T extends Object>
  T thing;

  public T eat(){  // instance method related to the class, and the type of class is defined by <T>
                    // which means could be any type;
    return null;
  }

  public static <T> T get(T t){ // this is static method, which is not related to the class.
                                  // <T> here is not consider as the <T> of class at line 3
    return t;
  }

  public static void main(String[] args) {
    Bag<Integer> bag = new Bag<>();
    Bag<Long> bag2 = new Bag<>();

    Bag.get("hello");
    System.out.println(Bag.get(12));
  }
  
}
