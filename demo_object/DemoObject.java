package demo_object;


public class DemoObject { // extends Object implicitly
  public void run(){
  
}
  public static void main(String[] args) {
    
    // Example 1: new DemoObject()

    DemoObject do2 = new DemoObject();
    Object o2 = do2; // upcast

    System.out.println(o2.toString());
    // compile time -> o2 is a object ref with the type of Object. Able to itself method
    // runtime must be Okay if we just use upcast

    // Example 2: new Object()

    Object o1 = new Object();
    System.out.println(o1.toString()); //   java.lang.Object@372f7a8d  
   // DemoObject do1 = (DemoObject) o1; // downcast -> runtime error
    // runtime --> once do1 found the object (new Object()), there is NO run() method.
    // --> error happens here

    // compile time -> do1 is a object ref with the type of DemoObject. Able to call run().
   // do1.run();
    
    // getClass()
    DemoObject do3 = new DemoObject();
    if (do3.getClass() == DemoObject.class){ // instance of 
      System.out.println("it is DemoObject class");

    }

    Class<?> clas = do3.getClass();
    System.out.println(clas.getName()); // DemoObject

    // equals() hashcode()
    String s1 = "hello";
    String s2 = "abc";
    System.out.println(s1 == s2); // check if same Object?
    System.out.println(s1.equals(s2));


    // String.Class
  //   public boolean equals(Object anObject) {
  //     if (this == anObject) {
  //         return true;
  //     }
  //     return (anObject instanceof String aString)
  //             && (!COMPACT_STRINGS || this.coder == aString.coder)
  //             && StringLatin1.equals(value, aString.value);
  // }

// Object.Class
//   public boolean equals(Object obj) {
//     return (this == obj);
// }

// Cat equals()
Cat c1 = new Cat("ABC", 5);
Cat c2 = new Cat("ABC", 10);
Cat c3 = new Cat("DEF", 5);
Cat c4 = new Cat("IJK", 7);
Cat c5 = new Cat("ABC", 5);

System.out.println(c1.equals(c2)); // false, different age
System.out.println(c1.equals(c3)); // false, different name
System.out.println(c1.equals(c4)); // false, different name and differnet age
System.out.println(c1.equals(c5));  // true

    
  }


  
}
