package demo_lambda.src.lambda;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DemoPredicate {
  public static void main(String[] args) {
    int age = 0;
    boolean isAdult = age >= 18;
    System.out.println(isAdult); // false

    Predicate<Integer> isAdult2 = x -> x >= 18;
    // Function<Integer, Boolean> predicateFunction = x -> x>= 18; // same idea with Predicate<Integer>
    System.out.println(isAdult2.test(17)); // false
    System.out.println(isAdult2.test(18)); // true
    System.out.println(isAdult2.test(19)); // true

    Predicate<Integer> isOdd = x -> x % 2 == 1;
    System.out.println(isOdd.test(10));

    if (isOdd.test(9))
      System.out.println("9 is an odd number");

    Predicate<Integer> isOddAndPositive = x -> x % 2 == 1 && x > 0;
    // Approach 2 (and)
    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isOdd.and(isPositive).test(2)); // false
    System.out.println(isOdd.and(isPositive).test(-2)); // false
    System.out.println(isOdd.and(isPositive).test(1)); // true
    System.out.println(isOdd.and(isPositive).test(-1)); // false

    System.out.println(isOdd.or(isPositive).test(2)); // true

    // Check if the chatAt string is vowel
    BiPredicate<String, Integer> isVowel = (str, idx) -> {
      Objects.nonNull(str); // throw NPE
      Objects.nonNull(idx); // throw NPE
      if (idx > str.length() - 1 || idx < 0)
        return false;
      if (str.charAt(idx) == 'a' || str.charAt(idx) == 'e'
          || str.charAt(idx) == 'i' || str.charAt(idx) == 'o'
          || str.charAt(idx) == 'u')
        return true;
      return false;
    };


    BiPredicate<String, String> isParent = (c, p) -> {
      if (c == "A" && (p == "A" || p == "O"))
        return true;

      else if (c == "B" && (p == "B" || p == "O"))
        return true;
      return false;
    };


    BiPredicate<String, String> isEqual = (s1, s2) -> s1.equals(s2);
    System.out.println(isEqual.test(new String("hello"), (new String("hello"))));  // true

    System.out.println("is parent " + isParent.test("A", "B"));
    System.out.println("is vowel " + isVowel.test(null, 0));

  }
}
