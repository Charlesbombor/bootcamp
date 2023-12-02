package demo_class.src;

// blueprint, to produce Person objects
public class Person {
  // Attributes
   private String name;
   private int age; // 0

   // Constructor (Produce Person's object)
   public Person(){

   }

   public Person(String x){
    this.name = x;   // create an object and string(name)
   }
   public Person(String x,int age){
    this.name = x;   // create an object and string(name)
    this.age = age;
   }
   // Instance Method (Object method)
   // Setter
  public void setName(String name){
    this.name=name;
  }

  // Getter
  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John");
    Person p2 = new Person();
    p2.setName("Peter");
    Person p3 = p1;
    p3.setName("Mary");
   // Person p2 = new Person("Mary",10);
    //Person p3 = new Person("Peter");
    //p1.setName("John");
    //System.out.println(p2.name+p2.age);
     //System.out.println(p3.name+p3.age);

    Person p4 = new Person("Tommy");
    p4.setName("Jenny");
    System.out.println(p4.getName()); // "Jenny"
    System.out.println(p3.getName()); // "Mary"
    System.out.println(p1.getName()); // "Mary"
    System.out.println(p2.getName()); // "Peter"
    
  }


}
