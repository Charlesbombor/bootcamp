import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// the strength of Set is remove the dupicate element in a list. Do it by .add
public class DemoSet {
  public static void main(String[] args) {
    Set<String> ss = new HashSet<>(); // Set is an interface, HashSet is a Class
    List<String> ls = new ArrayList<>();
    ls.add("ABC");
    ls.add("ABC");
    ls.add("ABC");

    for (String s : ls){
      System.out.println(ss.add(s)); // true, false, false
    }
    
    System.out.println(ss.size()); // 1
    System.out.println(ss.contains("ABC")); // true
  }
}
