public class Pracrting_StringMethods {
  public static void main(String [] args) {
    String str = "abcdefghijk";
    String str1 = "";
    String str2 = " ";
    String str4 = "ABcdefgHIJk";
    String str5 = "abcdabcdabcd";
    String str6 = "How are you? I am good.";
    String str7 = "   abc   ";
    String str8 = "ABCDEFGHIJK";

    System.out.println(str.length());

    System.out.println(str.charAt(0));

    Boolean strisEmpty = str.isEmpty();
    System.out.println(strisEmpty);

    Boolean str1isEmpty = str.isEmpty();
    System.out.println("str1isEmpty: " + str1isEmpty);

    Boolean str1isBlank = str1.isBlank();
    System.out.println(str1isBlank);

    Boolean str2isBlank = str2.isBlank();
    System.out.println(str2isBlank);

    Boolean strisBlank = str.isBlank();
    System.out.println(strisBlank);

    System.out.println(str.substring(3));
    System.out.println("*" + str.substring(3,5));

    System.out.println(str4.toLowerCase());
    System.out.println(str.toUpperCase());

    System.out.println(str.replace('a', 'x'));
    System.out.println(str5.replace('a', 'y'));

    System.out.println(str6.replace("good", "sad"));
    System.out.println(str6.contains("are"));

    System.out.println(str6.endsWith("!"));
    System.out.println(str6.endsWith("good."));

    System.out.println(str6.startsWith("how"));
    System.out.println(str6.startsWith("How"));

    System.out.println(str7.trim());

    Boolean strequals = str.equals(str2);
    System.out.println(strequals); 

    strequals = str.equalsIgnoreCase(str4);
    System.out.println(strequals);
    
    System.out.println(str.indexOf(5));
    System.out.println("*" + str.indexOf('z'));
    System.out.println(str6.indexOf("you"));

    System.out.println(str6.concat(str7));
    System.out.println(str.compareTo(str8));

    //ArraytoChar
    //.Split()

  }
}
