package Charles_Practicing.src.Practicing.src;
import java.util.Arrays;

public class charles2000 {
  public static void main(String[] args) {
    
  
String word = "abcdefd";
char ch = 'd'; 
int c = word.indexOf(ch);
String subword = "";

System.out.println(c);
if (c == 0){
 System.out.println(word);
} else if (c != 0){
  subword = word.substring(0, c+1);
  System.out.println(subword);

int i = 0;
int s = subword.length();
System.out.println(s);
char []arr = new char[s];
  for(i=0; i < s; i++){
    arr[i] = subword.charAt(s-1-i);
  }
  String newsub = String.valueOf(arr);
  System.out.println(newsub);
  String substring = word.substring(c+1);
  System.out.println(substring);
  String newstring = newsub.concat(substring);
  System.out.println(newstring);
}
}
}
