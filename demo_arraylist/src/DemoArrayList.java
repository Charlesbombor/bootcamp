import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) throws Exception{
    
    // Before Java 1.5 (No Generic)
    // ???
    // List anything = 

    // 
    ArrayList<String> ss = new ArrayList<String>(); // still OKAY

    // After 1.7
    ArrayList<String> strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    strings.add("XYZ");
    System.out.println(strings.size()); // 3

    // for-each
    for (String s : strings){
      System.out.println(s);
    }

    strings.remove(2);
    System.out.println(strings); // [ABC, IJK]
    strings.remove("ABC");
    strings.remove(new String("ABC"));
    System.out.println(strings); // [IJK]

    ArrayList<String> anotherList = new ArrayList<>(List.of("1234", "2345", "0000"));
    strings.addAll(anotherList);
    System.out.println(strings); // [IJK, 1234, 2345, 0000]

    // removeAll
    ArrayList<String> removedList = new ArrayList<>(List.of("IJK", "2345"));
    strings.removeAll(removedList);
    System.out.println(strings);

    strings.add(1, "CCC"); // insert "CCC" into the position of index 1
    System.out.println(strings);

    strings.set(1, "DDD"); // update element by index
    System.out.println(strings);

    System.out.println(strings.subList(0, 3)); // endIndex (exclusive)
    System.out.println(strings.indexOf("0000")); // 2

    // List<> is an Interface implemented by ArrayList.class
    List<String> strings2 = new ArrayList<>();
    strings2.add("ABC");
    strings2.remove(0);
    System.out.println(strings2); // []

  }
}
