package demo_generics.src;

import java.util.ArrayList;
import java.util.List;

public class Printer<T extends Number> { // T is part of class defintion, and it can be bounded
  //private T[] values;
  //private T value;
  private List<T> values;

  // public Printer (T value){
  //   this.value = value;
  // }
  
  // public Printer(T[] value){
  //   values = values;
  // }



  public Printer(T value){
    this.values = new ArrayList<>(List.of(value));
  }

  public List<T> getValue(){
    return values;
  }

public double sum(){
  double sum = 0;
  for (T t : this.values){
    sum += (double) t;
  }
  return sum;
}

  // public double sum2(){
  //   double sum = 0.0;
  //   for(int i=0; i<values.length; i++){
  //     sum += (double) values[i];
  //   }
  //   return sum;
  // }

  public void add(T value){
   values.add(value);
  }

  @Override
  public String toString(){
    return String.valueOf(this.values);
  }

  public static void main(String[] args) {
    Printer<Integer> a1 = new Printer<>(10);
    //Printer<String> stringPrinter = new Printer<>("abc");
    Printer<Double> a2 = new Printer<>(10.3);
    Printer<Double> doublePrinter = new Printer<>(10.3);
    doublePrinter.add(5.5);
    doublePrinter.add(1.2);
    System.out.println(doublePrinter.sum());


    // System.out.println(integerPrinter);
    // System.out.println(stringPrinter);

    // Printer[] arr = new Printer[]{a1, a2};
    // System.out.println();


  }
  
}
