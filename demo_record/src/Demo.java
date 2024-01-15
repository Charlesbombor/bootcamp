package demo_record.src;

public class Demo {
  public static void main(String[] args) {
    Student student = new Student("John", 20);
    System.out.println(student.name());  // getter
    // no setter in Record

    System.out.println(student);  // Student [name=John, age=20]

    // equals
  }
}
