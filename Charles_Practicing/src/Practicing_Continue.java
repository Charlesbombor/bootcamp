public class Practicing_Continue {
    public static void main(String[] args)  {

      int j=0;
      for (int i=0; i <100;i++ ){
        if (i%2==1 || i<=0 || i%3!=0 || j>=10){
         continue;
        }
        System.out.println("*" + i); 
        j++;
        

        }
          
      }

  }
