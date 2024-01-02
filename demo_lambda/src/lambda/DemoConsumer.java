package demo_lambda.src.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class DemoConsumer {
  public static void main(String[] args) {
    Consumer<String> sendEmailFunction =
        emailAddress -> sendEmail(emailAddress);
    // Consumer is an functional interface.


    List<String> emails = new ArrayList<>(List.of(""));
    emails.forEach(sendEmailFunction);

    // Common way to use forEach()
    emails.forEach(x -> {
      sendEmail(x);
    });

    List<Book> books = new ArrayList<>(List.of(new Book(10.3), new Book(3.4)));
    books.add(new Book(30.8));
    for (Book book : books) {
      System.out.println(book.getPrice());
    }

    books.forEach(e -> {
      System.out.println(e.getPrice());
    });

    BiConsumer<Integer, Integer> pow =
        (x, y) -> System.out.println(Math.pow(x, y));

    pow.accept(2, 3);

    // SuperConsumer<String, Integer, String> superConsumer = (s1, i1, s2) -> {

    // };

    // SuperConsumer<Integer, Integer, Integer> area = 
    // (x, y, z) -> Syst

    CommonConsumer<String> commonConsumer = (s1, s2,s3) -> { // CommonConsumer could be write as Lambda 
                                                             // it proof that function interface could be extends

    };

     
      
    


  }

  public static boolean sendEmail(String emialAddress) {
    System.out.println(("i am sending emal..." + emialAddress));
    return true;
  }


}

