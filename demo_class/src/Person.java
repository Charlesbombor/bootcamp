package demo_class.src;

// blueprint, to produce Person objects
public class Person {
  // Attributes
   private String firstname;
   private String lastname;
   private int age; // 0

   // Constructor (Produce Person's object)
   public Person(){

   }

   public Person(String lastname, String firstname, Integer aInteger){
    this.lastname = lastname;   // create an object and string(name)
    this.firstname = firstname;
    this.age = age;
   }

   public Person(String firstname){
    this.firstname = firstname;
   }

   public Person (String lastname, String firstname){
    this.lastname = lastname;
    this.firstname = firstname;
   }
   //public Person(String x,int age){
    //this.name = x;   // create an object and string(name)
    //this.age = age;
   //}
   // Instance Method (Object method)
   // Setter
  public void setFirstName(String firstname){
    this.firstname = firstname;
  }

  public void setLastName (String lastname){
    this.lastname = lastname;
  }

  // Getter
  public String getFirstName(){
    return this.firstname;
  }

  public String getLastName(){
    return this.lastname;
  }

  public void age (Integer age){
    this.age = age;
  }

  public String getFullName (){
   return this.lastname.isEmpty() ? this.firstname : this.firstname.concat(" ").concat(this.lastname);
  }


  public String getFullName (boolean isCapLetter){
    String fullName= this.firstname.concat(" ").concat(this.lastname);
    return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
}

public String getCapName(){
  
  return this.firstname.substring(0, 1).toUpperCase()
        .concat(this.firstname.substring(1, this.firstname.length()))
        .concat(" ") //
        .concat(this.lastname.substring(0, 1).toUpperCase())
        .concat(this.lastname.substring(1, this.lastname.length()));
}
  

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setFirstName("John");
    Person p2 = new Person();
    p2.setFirstName("Peter");
    
    Person p3 = p1;
    p3.setFirstName("Mary");
   // Person p2 = new Person("Mary",10);
    //Person p3 = new Person("Peter");
    //p1.setName("John");
    //System.out.println(p2.name+p2.age);
     //System.out.println(p3.name+p3.age);

    Person p4 = new Person("Tommy");
    p4.setFirstName("Jenny");
    System.out.println(p4.getFirstName()); // "Jenny"
    System.out.println(p3.getFirstName()); // "Mary"
    System.out.println(p1.getFirstName()); // "Mary"
    System.out.println(p2.getFirstName()); // "Peter"
    Person p5 = new Person("Joe", "GI");
    System.out.println(p5.getFullName());
    System.out.println(p5.getFullName(true));
    //System.out.println(p4.getFullName());

    // Person p6 = new Person("chris", "chan");

    
  }


}
