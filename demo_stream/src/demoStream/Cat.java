package demo_stream.src.demoStream;

import java.util.Comparator;
import java.util.Objects;


public class Cat implements Comparable<Cat> {
  // name
  // age
  private String name;
  private int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cats = (Cat) obj;
    return Objects.equals(this.name, cats.getName())
        && Objects.equals(this.age, cats.getAge());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }


  @Override
  public String toString() {
    return "Cat Name " + this.name + "  Age " + this.age;
  }

//  @Override
 // public int compare(Cat c1, Cat c2){
  //  return c2.getAge() > c1.getAge() ? -1 : 1;
 // }

  @Override
  public int compareTo(Cat c) {
  // return compare(this, c);
  return this.getAge()>c.getAge() ? -1:1;
  }



}

