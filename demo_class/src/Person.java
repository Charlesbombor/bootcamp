package demo_class.src;

// blueprint, to produce Person objects
public class Person {
  // Attributes
  private String firstName;
  private String lastName;
  private int age; // 0

  // Empty Constructor (Produce Person's object)
  public Person() { // a way to create an object without any value

  }

  public Person(String lastName, String firstName, Integer age) {
    //this.lastname = lastname; // create an object and string(name)
    //this.firstname = firstname;
    this(lastName, firstName);
    this.age = age;
  }

  public Person(String firstName) {
    this.firstName = firstName;
  }

  public Person(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
  }
  // public Person(String x,int age){
  // this.name = x; // create an object and string(name)
  // this.age = age;
  // }

  // Instance Method
  // 1. Belongs to the object (object seems bio)
  // (Person p1 = new Person()); p1.swim();)
  // 2. Able to control the instance variable by "this"

  // Static Method
  // 1. Belongs to the class (class seems no-bio)
  // (ClassName.staticMethod() -> Person.swim(3))
  // 2. Not able to read/write instrance variable
  // 3.The return value completely derived by the inupt parameters


  // Instance Method (Object method)
  // Setter
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  // Getter
  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void age(Integer age) {
    this.age = age;
  }

  public String getFullName() {
    return this.lastName.isEmpty() ? this.firstName
        : this.firstName.concat(" ").concat(this.lastName);
  }


  public String getFullName(boolean isCapLetter) {
    String fullName = this.firstName.concat(" ").concat(this.lastName);
    return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
  }

  public String getCapName() {

    return this.firstname.substring(0, 1).toUpperCase()
        .concat(this.firstname.substring(1, this.firstname.length()))
        .concat(" ") //
        .concat(this.lastname.substring(0, 1).toUpperCase())
        .concat(this.lastname.substring(1, this.lastname.length()));
  }

  public static void swimming() {
    System.out.println("I'm swimming"); // cannot use object data
  }

  public void swim() { // void method can be with "return" or without "return"
    // int a =1;
    // if (a >2)
    // return;
     System.out.println(this.firstname + "is swimming");

  }

  public int eat() { // int method has to be with "return" kewword
    return -1;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setFirstName("John");
    Person p2 = new Person();
    p2.setFirstName("Peter");

    Person p3 = p1;
    p3.setFirstName("Mary");
    // Person p2 = new Person("Mary",10);
    // Person p3 = new Person("Peter");
    // p1.setName("John");
    // System.out.println(p2.name+p2.age);
    // System.out.println(p3.name+p3.age);

    Person p4 = new Person("Tommy");
    p4.setFirstName("Jenny");
    System.out.println(p4.getFirstName()); // "Jenny"
    System.out.println(p3.getFirstName()); // "Mary"
    System.out.println(p1.getFirstName()); // "Mary"
    System.out.println(p2.getFirstName()); // "Peter"
    Person p5 = new Person("Joe", "GI");
    System.out.println(p5.getFullName());
    System.out.println(p5.getFullName(true));
    // System.out.println(p4.getFullName());

    // Person p6 = new Person("chris", "chan");

    // Static vs Instance Method
    // Call Instance Method
    Person p6 = new Person("Jenny");
    p6.swim();

    // Call Static Method
    Person.swimming(); // I'm swimming

    

  }


}
