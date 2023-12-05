package demo_class.src;

public class StringBox {
  private char[] characters;

  public StringBox (String str){
    for (int i=0; i<str.length(); i++){
      characters[i] = str.charAt(i);
    }
  }

  public static void main(String[] args) {
    StringBox string = new StringBox("hello");
    
  }
}
