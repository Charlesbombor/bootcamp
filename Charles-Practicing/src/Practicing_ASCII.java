public class Practicing_ASCII {
  public static void main(String[] args) {
    char letter= 'a';
    char capital = 'A';
    int value = 'a';
    String s1 = "bootcamp";
    String s2 = "bobby";

    capital = (char)value;
    System.out.println(capital);

    int c1 = 'o';
    int c2 = 'b';
    System.out.println(c1 - c2);
    System.out.println(s1.compareTo(s2));
  }
}
