import java.util.Arrays;

public class charlesPractic {
  public static void main(String[] args) {
    
    int num = 99;
    int length=0;
    int index=0;
    String str = String.valueOf(num);
    System.out.println(str.length());
    System.out.println(str.indexOf('6'));
    length = str.length();
    index = str.indexOf('6');
    if (str.indexOf('6' )== -1){
       System.out.println(num);
    } else if (index == length){
    str = str.substring(0, index ) + '9' ;
  } 
  else {
    str = str.substring(0, index ) + '9' + str.substring(index + 1);
  }
  System.out.println(str);


      
   
   }
}
    



  








