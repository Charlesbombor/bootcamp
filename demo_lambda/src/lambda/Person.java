package demo_lambda.src.lambda;

import java.util.function.Predicate;
// Wrong Example (We should not use a class to implements Predicate)
public class Person implements Predicate<Integer> {

  private int age;

  @Override
  public boolean test(int adultAge) {
    return this.age >= adultAge;
  }

  public static void main(String[] args) {
    Person person = new Person();
    person.test(18);
  }
  
}
