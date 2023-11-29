import java.util.Arrays;

public class DemoCounting {
  public static void main(String[]args){
    int[] numbers= new int[]{200,10,2,200,200};
    int maxCount=0;
    int i=0;
    int j=0;
    int count=0;
    int[]counts =new int[numbers.length];
    for(j=0;j<numbers.length; j++){
    for(i=1; i<numbers.length-1;i++){
    if (numbers[j]==numbers[i]){
      counts[i-1] +=1;
      
      System.out.println("Counts: " + Arrays.toString(counts));
      System.out.println("Numbers: " + numbers[j]);
    } 
  }
}
    maxCount=counts[i];
    System.out.println("Max.count: " + maxCount); // 3



    String str = "abcabcdpolxyzaa";
    maxCount=0;
    char maxChar=' ';
    j=0;
    int []counting=new int[str.length()];
    char []haveChar= new char[str.length()];
   //for (j=0; j<str.length()-1; j++){
    for (i=0; i<str.length()-1; i++){
      haveChar[i] = str.charAt(i);
    }
    //for(int k=0; k<str.length()-1; k++){
    //for (j=0; j<str.length()-1; j++){
    //if (haveChar[k]==haveChar[k+j]){
      //counting[j]++;
       // }  
     // }
   // }
    //System.out.println("haveChar array: " + Arrays.toString(haveChar));
    //System.out.println("Counting array: " + Arrays.toString(counting));
    //System.out.println("Max count= " + maxCount + ", Char=" + maxChar); //4
  }

  
  }
    



