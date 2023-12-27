package demo_comparator.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparable {
  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    students.add(new Student(40, "Peter"));
    students.add(new Student(10, "John"));
    students.add(new Student(98, "Ann"));
    students.add(new Student(29, "John"));

    

    Collections.sort(students);
    System.out.println(students); 

    // Comparator
    Collections.sort(students, new SortByScore());
    System.out.println(students);

    Collections.sort(students, new SortByName());
    System.out.println(students);

  }
}
