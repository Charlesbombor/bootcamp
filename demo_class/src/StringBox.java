package demo_class.src;

public class StringBox {
  private char[] characters; // object reference type

  public StringBox (String str){
    this.characters = new char[str.length()];
    for (int i=0; i<str.length(); i++){
      characters[i] = str.charAt(i);
    }
  }

public StringBox concat(String str){
  //
  int idx = 0;
  char[] newArr = new char[this.characters.length + str.length()];
  for (int i = 0; i<this.characters.length; i++){
    newArr[idx++] = characters[i];
  }
  for (int i=0; i<str.length(); i++){
    newArr[idx++] = str.charAt(i);
  }
  return new StringBox(String.valueOf(newArr));
}

// Similar to StringBox append()
public StringBox concat2(String str){
  int idx = 0;
  char[] newArr = new char[this.characters.length + str.length()];
  for (int i = 0; i<this.characters.length; i++){
    newArr[idx++] = characters[i];
  }
  for (int i=0; i<str.length(); i++){
    newArr[idx++] = str.charAt(i);
  }
  characters = newArr;
  return this;
}

// instance method
public boolean isEmpty(){
  // check if the char[] is empty 
  return this.characters.length == 0;
}

public int length() {
  // return the char array length
  return this.characters.length;
}

public StringBox replace(char from, char to){
  return null;
}

public StringBox replace(String from, String to){
  return null;
}


@Override
public String toString() {
  return String.valueOf(this.characters);
}

  public static void main(String[] args) {      // produce StringBox
    StringBox string = new StringBox("hello");
    System.out.println(string.toString()); // hello
    System.out.println(string.concat("world"));
    System.out.println(string);
    System.out.println(string.concat2("world"));
    System.out.println(string);
  }
}
