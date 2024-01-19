package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
// Junit5 -> org.junit.jupiter
import org.junit.jupiter.api.Test;


// unit test
public class CalculatorTest {
  @Test
  // maven trigger this method during "test" phase
  void testAdd() {
    int actualResult = Calculator.add(3, 2);
    int expectResult = 5;
    assertEquals(expectResult, actualResult);
    assertNotEquals(6, Calculator.add(3, 2));
    assertNotEquals(4, Calculator.add(3, 2));
  }

  @Test
  void test2() {
    assertTrue(true);
  }
}
