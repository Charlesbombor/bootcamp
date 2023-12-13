public class Cat extends Animal{

  // Cat Class inherit all public attributes, methods
  // *** *** Cat did not inherit constructor

  public Cat(){
    // super(); // implicitly call Animal() [Animal empty constructor] constructor 
  }

  public static void main(String[] args) {
    Cat cat = new Cat(); // Create a Cat Object --> Cat() --> call Animal()
    cat.getAge();
    cat.setAge(2);
  }
  
}
