package Charles_Practicing.src;

public class Practing_StringReplace {
  public static void main(String[] args) {
    
  
  String s = "abcdefg";
  String var = "90";
  s = s.replace("ab", "12");
  s = s.concat(var);
  System.out.println(s);
  System.out.println(s.substring(0, 2));
  }
}
