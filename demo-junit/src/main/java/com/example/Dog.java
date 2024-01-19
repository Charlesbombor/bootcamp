package com.example;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Dog {
  private final String firstName = "John";

  @NonNull
  private String lastName;

  

  public static void main(String[] args) {
    Dog dog = new Dog("Chan");
    System.out.println(dog);
    Dog dog2 = new Dog(null);
    System.out.println(dog2);
  }


}