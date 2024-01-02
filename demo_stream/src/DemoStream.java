package demo_stream.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) throws Exception {

    List<String> strings =
        new ArrayList<>(List.of("hello", "world", "vincent", "oscar"));
    List<String> result = new ArrayList<>();
    // filter out string with length <= 5,
    for (String str : strings) {
      if (str.length() > 5)
        result.add(str);
    }
    System.out.println(result);

    // stream()
    // list object can invoke stream() method
    List<String> result2 = strings.stream() // similar to for loop
    .filter(s -> s.length() > 5) // Predicate: "s -> s.length() 5"
    .collect(Collectors.toList());
    System.out.println(result2);

  }
}
