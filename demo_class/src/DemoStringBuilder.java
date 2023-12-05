package demo_class.src;

public class DemoStringBuilder {
  public static void main(String[] args){
    // String: +=, concat()
    String x = "abc";
    x += "def";
    x = x.concat("def");
    System.out.println(x); // abcdefdef

    // StringBuilder
    StringBuilder sb = new StringBuilder("abc");
    sb.append("def").append("def");
    System.out.println(sb.toString()); // abcdefdef

    //while loop -> counter
    //123 456 789 101112
    int counter = 4; // //123 456 789 101112
    StringBuilder sb2 = new StringBuilder("");
    int num = 0;
    while (counter-- > 0 ){
      //sb2.append(++num).append(++num).append(++num);
      for (int i=0; i<3; i++){
        sb2.append(++num);
      }
      if (counter>0){
      sb2.append(" ");
    }
    }
    System.out.println(sb2.toString()); // "123 456 789 101112"

    StringBuilder sb3 = new StringBuilder("");
    counter = 4; // aaa bbb ccc ddd
    
    int z = 'a';
    System.out.println(z);
    while (counter-- > 0){
      for (int i=0; i<3; i++){
        sb3.append((char)z);

      }
      
      if (counter>0){
        sb3.append(" ");
      }
      z++;
    }
      System.out.println(sb3.toString());
      System.out.println(sb3.reverse().toString());
      System.out.println(sb3.insert(4, "bootcamp").toString());

      System.out.println(sb3.delete(0,6).toString()); // otcampccc bbb aaa

      sb3.setCharAt(2, 'J');
      System.out.println(sb3.toString());
      System.out.println(sb3.charAt(2)); // 'J'
      System.out.println(sb3.toString());
      sb3.replace(2, 6, "abc");
      System.out.println(sb3.toString()); // otabcccc bbb aaa

      sb3.isEmpty();
      sb3.length();

      StringBuilder s1 = new StringBuilder("abc");
      StringBuilder s2 = new StringBuilder("abc");
      System.out.println(s1.toString().equals(s2.toString())); // true
      System.out.println(s1.compareTo(s2));
      System.out.println(stringConcat());
      System.out.println(stringBuilderAppend());
  }

      public static long stringConcat(){
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i< 1000; i++){
          s = s.concat("a");
        }
        long end = System.nanoTime();
        return end - start;
      }  
      
      public static long stringBuilderAppend() {
        long start =  System.nanoTime();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1000; i++){
          s.append("a");
        }
        long end = System.nanoTime();
        return end - start;
      }  
    
    }

    
    
  

