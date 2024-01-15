import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  
public static void main(String[] args) {
  
  List<String> strings = new ArrayList<>();
  int index = 0;
  String str = "";

  // Map: 
  // 1. key value pair -> <key, value>
  // 2. key must be unique
  Map<String, Integer> ageBook = new HashMap<>();

  // put(), put method
  ageBook.put("John", 20);
  ageBook.put("John", 13); // Update 20 -> 13, because "John" is the key which exists in the map
  ageBook.put("Mary", 3); // add a new entry

 

  System.out.println(ageBook.size()); // 2

  for (Map.Entry<String, Integer> entry : ageBook.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
  }

  // get(), get method
  System.out.println(ageBook.get("Mary")); // 3
  System.out.println(ageBook.get("John")); // 13

  Map<Integer, String> lifeBook = new HashMap<>();
  lifeBook.put(12, "Charles");
  lifeBook.put(23, "Faye");
  lifeBook.put(34, "HChi");

   str = lifeBook.get(12).concat(lifeBook.get(23));
  System.out.println("String: " + str);

  System.out.println(lifeBook.size());
  for (Map.Entry<Integer, String> input : lifeBook.entrySet()){
    System.out.println(input.getKey() + " " + input.getValue());
  }
  

  System.out.println(lifeBook.get(12));

  Map<Integer, String> winnerBook = new HashMap<>();
  winnerBook.put(1, "Tommy");
  winnerBook.put(1, "Peter");
  winnerBook.put(2, "Sally");
  winnerBook.put(3, "Jenny");
  winnerBook.put(null, "AAA");
  winnerBook.put(null, "BBB");

  // Map<String, Book>
  Map<String, Book> bookMap = new HashMap<>();
  
  bookMap.put("Charles", new Book("ABC"));
  bookMap.put("Faye", new Book("ABC"));
  bookMap.put("HChi", new Book("IJK"));

  System.out.println(bookMap.get("Charles").getName());

    for (Map.Entry<String, Book> entry : bookMap.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue().getName());

  // put Book
  // get Book name

  // Map<Author, Book>
  Map<Author, Book> books = new HashMap<>();
  Author someone = new Author("Someone");
  books.put(new Author("Someone"), new Book ("ZZZ"));
  books.put(new Author ("Someone"), new Book ("AAA")); // if no equals() & hashCode() -> new entry

   books.put(someone, new Book ("ZZZ"));
  books.put(someone, new Book ("AAA"));


  // if there is no equals() & hashCode() -> new entry
  // if there are equals() & hashCode() -> update
  System.out.println(books.get(someone));

  System.out.println("Lion " + books.containsKey(new Author("Lion")));
  System.out.println(books.containsValue(new Book ("AAA")));

  System.out.println(books.putIfAbsent(new Author("Ann"), new Book ("IJK"))); // null, original value
  System.out.println(books.putIfAbsent(new Author("Ann"), new Book ("CCC"))); // IJK, original value

  



}

}
}
