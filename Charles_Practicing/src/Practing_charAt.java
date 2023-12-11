public class Practing_charAt {
  public static void main(String[] args) {
    String str = "1";
    boolean pp=false;
    int i = str.length();
    int j= 0;
    if (str.length() == 1)
        pp=true;
    for (j=0; j < i/2; j++ ){
      if (str.charAt(j) == str.charAt(str.length()-1-j)){
        pp=true;
      
      }else {
        pp=false;
     
    }
   
  }
   System.out.println(pp);
}
}
