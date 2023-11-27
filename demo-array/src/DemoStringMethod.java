public class DemoStringMethod {
  public static void main(String[] args) {
    
    String str="  hello world!  ";
    // empty
    if (!str.isEmpty()){
      System.out.println("String=" + str);

    }
    System.out.println("str length= " + str.length());
    // even number index of the character in string
    for (int i=0; i<str.length(); i++){
      if (i%2==0){
        System.out.println(str.charAt(i));
      }
    }
    System.out.println("");

    // substring()
    // substring(startIndex, endIndex -1)
    String s="hello";
    String newStr= s.substring(2,4);  // index start from 0. 
                                      // .substring(x, y) means from x to y-
    System.out.println("newStr=" + newStr); // ll, print -> index from 2 to 3
    System.out.println("substring(0) " + s.substring(0));

    //trim(), remove all space in the head and tail of the string
    // str = "  hello world!  "
    System.out.println(str.trim());  // "hello world!"
    System.out.println(newStr.trim()); // "ll"

    String s2="Hello, woRld!!";
    System.out.println(s2.toUpperCase()); // "HELLO, WORLD!!"
    System.out.println(s2.toLowerCase()); // "hello, world!!" 

    // equals()
    // equalsIgnoreCase()
    System.out.println("HEllo, woRld!!".equals("hello, world!!")); // false
    System.out.println("HEllo, woRld!!".equalsIgnoreCase("hello, world!!")); //ture
    System.out.println("HE, woRld!!".equalsIgnoreCase("hello")); // false

    // startWith("")
    // endsWith("")
    System.out.println(s2.startsWith("HEllo")); // true
    System.out.println(s2.startsWith("Hello")); // false
    System.out.println(s2.startsWith("H"));  // true
    System.out.println(s2.startsWith(" ")); // false
    System.out.println(s2.startsWith("")); // true, However it is a not good pratice to code
    System.out.println();

    System.out.println(s2.endsWith("!!")); // true
    System.out.println(s2.endsWith(" ")); // false
    System.out.println(s2.endsWith(""));  // true
    System.out.println(s2.endsWith("D!!")); // false. endsWith sensitive to capital or small letter
    System.out.println();

    String s3 ="1234567890";
    // you try 2 String methods, and use && operator to check true/false
    // return true
    System.out.println(s3.startsWith("1") && s3.equals("1234567890"));
    //System.out.println("56".(s3.substring(4,6)) && s3.charAt((s3.length()-1)) == 0);
    System.out.println("56".equals(s3.substring(4,6))&& s3.charAt(s3.length()-1)=='0');

    // indexOf()
    System.out.println(s3.indexOf('7')); // 6(int)
    System.out.println(s3.indexOf('m')); // -1 (int)

    // searching '7' starting from index 8
    System.out.println(s3.indexOf('7', 8)); // -1(int)
  
    if (s3.indexOf('m') == -1){
      System.out.println("No such index");
    
            String s99="12*4*56*";
            int a=0;
            for (a=0; a<s99.length(); a++){
              if (s99.charAt(a)=='*'){
                System.out.println("* at" + s99.indexOf('*', a));
                
              }
               
                
    
      //System.out.println(s4.indexOf('*'), s4.indexOf("*"));
            }

    // lastIndexOf()
    String s4= "1234512345";
    System.out.println(s4.indexOf('5')); // 4, return the first occurence of '5'
    System.out.println(s4.lastIndexOf('5')); // 9, return the last occurence of '5'

    System.out.println(s4.indexOf("345")); // 2
    System.out.println(s4.indexOf("3 45")); // -1

    System.out.println(s4.lastIndexOf("345")); // 7
    System.out.println(s4.lastIndexOf("3 45")); // -1

    System.out.println(s4.lastIndexOf('4', 7)); // 3
    System.out.println(s4.lastIndexOf('4', 9)); // 8
    System.out.println(s4.lastIndexOf('4', 2)); // -1

    String s5 ="ABabc5abcdef";
    System.out.println(s5.lastIndexOf("abc") == 6
      && s5.endsWith("def")
      && s5.indexOf("abc") ==2
      && s5.startsWith("ABa")
      && s5.length() > 10); // true

    String s6 = "abc";
    String s7 = "def";
    System.out.println(s6 + s7); // "abcdef". Not a good practice to use "+" in String
                                // better insted of using .concat()
    System.out.println(s6.concat(s7)); // "abcdef"

    System.out.println(s5.contains("abcdef")); // true. better use .contains() rather than .indexOf
    System.out.println(s5.indexOf("abcdef") != -1); // true
    System.out.println(s5.contains("xxx")); // false

    String result=s5.toUpperCase();
    System.out.println(result); // ABABC5ABCDEF
    String result2 = result.substring(3,5); // BC
    System.out.println(result2);
    // These could be insted of :
    String result3 = s5.toUpperCase().substring(3,5); //BC
    System.out.println(result3);

    String result4 = s6.concat(s7).concat(s5).toUpperCase().substring(3,5);
    System.out.println(result4);

    }
  }



}
