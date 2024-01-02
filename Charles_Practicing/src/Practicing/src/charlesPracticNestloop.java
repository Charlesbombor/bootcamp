package Charles_Practicing.src.Practicing.src;
public class charlesNestloop {
  public static void main(String[] args) {
    
 String str= "abcdefghijk";
    for (int i=0; i<str.length(); i++){
      System.out.print(str.charAt(i));
      int k=i+1;
      if (k%4==0 ){
        System.out.println();
      }
  }
   System.out.println();

  String str2= "Charlesbombor love fayeswallow forever";
  int num = 0;
    for (int i=0; i<str2.length(); i++){
      if (str2.charAt(i)!='e'){
      continue;
      } 
       num++;
    }  
      System.out.println("found " +num+ " e is in the string"   );

      int mark = 9;
      if (mark >= 90){
        System.out.println("Good");
      }
      else if (mark >=50 ){
         System.out.println("OK LA");
      }
      else {
        System.out.println("Shit!");
      }

  }
}
