import java.util.Arrays;

public class DemoStringArray {
  public static void main(String[] args) {
    // "abc" "ijk" "xyz"

    String []arrStr= new String[]{"abc", "ijk", "xyz"};
    String []arrStr2 = new String[3];
    arrStr2[0]="abc";
    arrStr2[1]="ijk";
    arrStr2[2]="xyz";

    // for loop
    // arrStr[0] -> "abcijk"
    // arrStr[1] -> "ijkxyz"
    // arrStr[2] -> "xyz"

    for (int x=0; x<arrStr.length; x++){
      if (x<arrStr.length-1){
        arrStr[x] = arrStr[x].concat(arrStr[x+1]);
      } else{
         System.out.println(arrStr[x].concat("!"));
       
      } 
     System.out.println("*" + Arrays.toString(arrStr)); // show the current status of the Arrays

    for ( x=0; x<arrStr.length; x++){
      if (x<arrStr.length-1){
        arrStr[x] = arrStr[x].concat(arrStr[x+1]);
        System.out.println(arrStr[x]);
        continue;
      } 
     System.out.println(arrStr[x].concat("!"));
      
    }
System.out.println("*" + Arrays.toString(arrStr));
  }
  
}
}
