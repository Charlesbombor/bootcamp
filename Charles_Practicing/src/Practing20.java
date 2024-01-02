package Charles_Practicing.src;

import java.util.HashMap;
import java.util.Map;

public class Practing20 {
  public static void main(String[] args) {
    
  
  String s = "()[]}";
  boolean same = true;


  Map<Character, Integer> ss = new HashMap<>();
  ss.put('(', 1);
  ss.put(')', 2);
  ss.put('[', 3);
  ss.put(']', 4);
  ss.put('{', 5);
  ss.put('}', 6);

  //sum = sum + roman.get(s.charAt(i));
  //System.out.println(s.get(str.charAt(1)));
  //System.out.println(str.charAt(0));

  if (s.length() % 2 == 1)
  same = false;

  for (int i=1; i<s.length(); i++){
    int m = ss.get(s.charAt(i));
    int n = ss.get(s.charAt(i-1));
 
    if (m % 2 == 0 && m - n != 1)
    same = false;
  } 
    System.out.println(same);
  
//m % 2 == 1 &&


  }
}
