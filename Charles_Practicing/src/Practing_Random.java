import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Practing_Random {
  public static void main(String[] args) {
   
    // double random = Math.random();
    // System.out.println(random);
    // int random2 = (int) (Math.random() * 21) ;
    // System.out.println(random2);
    // double random3 = Math.floor(Math.random() *(21) + -10);
    // System.out.println(random3);


    int i;
    int j;
    int k;
    int x;
    int temp;
    int sum=0;
    int n=5;
    int[] num = new int[5-1];
    char [] arr = new char[5];
    char [] finalArr = new char[5];
    int[] sort = new int[5];
    String str;
    boolean gened = false;

    x=n-1;

   do{
   for (i=0; i<n-1; i++){
    num[i] = (int)Math.floor(Math.random()*21-10);
   }
   System.out.println("num" + Arrays.toString(num));
   str = Arrays.toString(num);
  
   

   for (i=0; i<n-1-1; i++){
    for (j=0; j<n-2-i; j++){
      if (num[j] > num[j+1]){
        temp = num[j];
        num[j] = num[j+1];
        num[j+1] = temp;
      }
    }
   }
  
   sum = 0;
  for(k=0; k<n-1; k++){
    sum += num[k];
  }
  
  sort[n-1] = 0 - sum;
  for (i= 0; i<n-1; i++){
    sort[i] = num[i];
  }

  
   

   for (i=0; i<n-1; i++){
    for (j=0; j<n-i-1; j++){
      if (sort[j] > sort[j+1]){
        temp = sort[j];
        sort[j] = sort[j+1];
        sort[j+1] = temp;
      }
    }
   }
 



   for (j=0; j<n-1; j++){ // check unique
    if (sort[j] == (sort[j+1])){
      gened = false;
       System.out.println(gened);
      break;
     }
     else {
      gened = true;
     }
    }
  }while(gened == false);


     System.out.println("*" + gened);

    System.out.println(Arrays.toString(sort));
   
  }
}
