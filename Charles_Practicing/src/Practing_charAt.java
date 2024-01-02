package Charles_Practicing.src;

public class Practing_charAt {
  public static void main(String[] args) {
    String str = "margelets[wentiawaitnewstelegram";
    char c = 0;
    int i = 0;
    int j = 0;
    int length = 0;
    boolean pal = true;


    str = str.toLowerCase();

    for (i = 0; i < str.length(); i++) {
      c = str.charAt(i);
      if (!Character.isLetter(c) && !Character.isDigit(c)) {
        str = str.replace(Character.toString(c), "");
      }
    }
     

  
    for (j = 0; j < str.length() / 2; j++) {
      if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
        pal = false;
        break;
      }
    }
   
    System.out.println(pal);



    // x = str.charAt(str.length()-1);
    // System.out.println("*" + str.charAt(str.length()-1) + "*");
    // System.out.println(x);

    // if (str.charAt(3) == 32)
    // System.out.println("It is " + "* *");

    // String str = "1";
    // boolean pp=false;
    // int i = str.length();
    // int j= 0;
    // if (str.length() == 1)
    // pp=true;
    // for (j=0; j < i/2; j++ ){
    // if (str.charAt(j) == str.charAt(str.length()-1-j)){
    // pp=true;

    // }else {
    // pp=false;

    // }

    // }
    // System.out.println(pp);
  }
}
