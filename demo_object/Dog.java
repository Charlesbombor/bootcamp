package demo_object;

import java.util.Objects;

public class Dog {
  
  private String name;
  private int age;
 private Eye[] eyes= new Eye[2];


  public Dog(){

  }

  public Dog(String name, int age, Eye[] eyes){
    this.name = name;
    this.age= age;
    this.eyes =eyes;
  }

  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public Eye[] getEyes(){
    return this.eyes;
  }



  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(this instanceof Dog))
    return false;
    Dog dog = (Dog)obj;
    return Objects.equals(dog.getAge(), this.age)
            && Objects.equals(dog.getName(), this.name)
            && Objects.equals(dog.getEyes(), this.eyes);
  }

  public static void main(String[] args) {
    
   
    Dog d1 = new Dog("dolly", 5, new Eye[]{new Eye("brown", "black")});
    Dog d2 = new Dog("baby", 4, new Eye[]{new Eye("blue", "blue")});
    Dog d3 = new Dog("dolly", 5, new Eye[]{new Eye("brown", "black")});
    System.out.println(d1.equals(d3));

    Long l = Long.valueOf(1.0L);
  }
  
}
