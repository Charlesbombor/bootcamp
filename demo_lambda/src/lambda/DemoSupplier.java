package demo_lambda.src.lambda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class DemoSupplier {

  
  public static void main(String[] args) {
    Supplier<Integer> randomInteger = () -> new Random().nextInt(100) + 1; // 1 to 100
    System.out.println(randomInteger.get());

    Supplier<Book> emptyBook = () -> new Book();
    Book book = emptyBook.get();
  }

  // public static int radom(){
  //   return new Random().nextInt(100) + 1;
  // }

  
}
