package classPracticing.src;

public class intToString {
  public static void main(String[] args) {
    
  
  int x = 11001;
  String str;
  boolean ans = true;
  str = String.valueOf(x);
 int y = str.length();
 int z = y / 2;
 for (int i=0; i<z; i++){
  if (str.charAt(i) != str.charAt(y-1-i)){
    ans = false;
  }
 }
System.out.println(ans);
  
}
}
