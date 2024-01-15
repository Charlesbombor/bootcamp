package demo_optional.src;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;

public class DemoOptional {
  public static void main(String[] args) {
    // Cat: age, name
    // Cat.class, Cat is a name of a class only. You can name it anything, such as Box.
    // Or you can simply treat it as AgeAnd NameHolder.class

    Account account = DemoOptional.setUp(1, 0.0d);
    account.credit(10.0d);

    Account account2 = DemoOptional.setUp(0, 0.0d); // accountNo 0 is not allowed -> return null
    // account2.credit(200.0d); // NullPointerException

    // As a caller, we can generally handle the null value in this way.
    // Approach 1 to handle Optional return value
    DemoOptional.setUp2(2, 0.0d).ifPresent(acct -> { // if value is Present, take action what Lambda declare
      acct.credit(1000.d);
    });


    // Approach 2 to handle Optional return value
    Optional<Account> oa = DemoOptional.setUp2(0, 00.d);
    if (oa.isPresent()) { // check if value is Present, ant true
      oa.get().credit(1000.0d);
    } else {
      System.out.println("I decided to do nothing when Account Object is null");
    }

    List<Account> accounts =
        new ArrayList<>(List.of(new Account(1, 120.0d), new Account(2, 10.0d)));
    Optional<Account> optaccount = accounts.stream() //
        .filter(e -> e.getBalance() > 30.0d) //
        .findFirst();
    System.out.println("account " + accounts);

    // ifPresent(Consumer)
    // isPresent -> boolean

    if (optaccount.isPresent()) {
      optaccount.get().credit(1000.0d);
    } else {
      System.out.println("Nothing can do when optaccount obj is null");
    }

    optaccount.ifPresent(acct -> {
      acct.credit(000.d);
    });
    System.out.println("optaccount " + optaccount);


    Optional<Account> optaccount2 = accounts.stream() //
        .filter(e -> e.getBalance() > 150.0d) //
        .findAny();
            System.out.println("optaccount2 " + optaccount2);

         


    Account acct = optaccount2.orElse(new Account(99, 0.1d));
    System.out.println("acct: " + acct);

    Account acct2 = optaccount2.orElseGet(() ->  new Account(99, 0.1d));
        System.out.println("acct2: " + acct2);


    Account acct3 = optaccount2.orElseThrow(() -> new NoSuchElementException());

    OptionalDouble maxBalance = accounts.stream()  //
    .mapToDouble(e -> e.getBalance()) //
    .max();

    double max = 0.0d;
    if (maxBalance.isPresent()) {
      max = maxBalance.getAsDouble();
    }

    max = maxBalance.orElse(-1.0d);

  }


  public static Account setUp(int accountNo, double balance) {
    if (accountNo <= 0 || balance < 0)
      return null; // it is a null, really a null
    return new Account(accountNo, balance);

  }

  public static Optional<Account> setUp2(int accountNo, double balance) { // can allow the object be created,
    if (accountNo <= 0 || balance < 0) // no matter if it is null.
      return Optional.empty(); // this object hold a null
    return Optional.of(new Account(accountNo, balance)); // the reason using Optional is return non-null, thus user use this mehtod no
                                                         // need to do null check.
  }

  // Important Note: We never use Optional<T> as input parameter's type.
  // Inside the method, we still need to perform null check on Optional<T>,
  // So we can't see any benefit in using Optional<T> in input parameter.

  // public static Optional<Account> setUp3(Optional<Integer>accountNo, Optional<Double>balance){
  // if(accountNo == null)
  // return Optional.empty();
  // if (accountNo.isPresent()) { // nullpointerexception
  // }
  // }

}

