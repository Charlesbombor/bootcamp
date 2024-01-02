package Charles_Practicing.src.Practicing.src;

public class charlesPractic2185 {
  public static void main(String[] args) {
    String[] words = new String[]{"pay","attention","practice","attend"};
    String pref = "at";
    int counter = 0;
    int i;
    boolean check;

    for(i=0; i<words.length; i++){
    check = words[i].startsWith(pref);
    System.out.println(check);
    if (check == true)
    counter++;
    }
System.out.println(counter);
    
 
}
}
