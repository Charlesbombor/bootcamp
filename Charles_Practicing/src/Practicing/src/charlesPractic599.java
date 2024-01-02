package Charles_Practicing.src.Practicing.src;
import java.util.Arrays;

public class charlesPractic599 {
        
       

        public charlesPractic599(){

        }
    

public String[] findRestaurant(String[] list1, String[] list2) {
        
        String[] newList1 = new String[list1.length];
        
       
        int i;
        int j;
      
        int m;
       
        int x = 0;
        String temp;
        int temp2 = 0;
        int counter = 0;


        

         for (i=0; i< list1.length; i++){
            for(j=0; j< list2.length; j++){
                if(list1[i].equals( list2[j])){
                    newList1[x++] = list1[i];
                    
                    
                }
            }
         }
          System.out.println(Arrays.toString(newList1));
         System.out.println(newList1.length);
       counter = 0;
         for (m=0; m < newList1.length; m++){
            if (newList1[m] != null){
                 System.out.println(m +" " +counter);
                counter++;
                System.out.println(m +"*" +counter);
            }
          }
         
         String[] finalList = new String[counter];

         for (m=0; m < finalList.length; m++){
            if (newList1[m] != null){
                finalList[m] = newList1[m];
                
            }
        }
       
        System.out.println(finalList.length);
        int [] sum = new int[finalList.length];
           for(i=0; i<finalList.length; i++){
            for (j=0; j<list1.length; j++){
                if(finalList[i].equals(list1[j]))
                sum[i] += j;
            }
        }
                
                for(i=0; i<finalList.length; i++){
            for (j=0; j<list2.length; j++){
               if(finalList[i].equals(list2[j]))
               sum[i] += j;
           }
           }
           System.out.println(sum.length);
           for(m=sum.length-1; m>0; m--){
            if(sum[m] < sum[m-1]){
                temp = finalList[m];
                temp2= sum[m];
                finalList[m] = finalList[m-1];
                sum[m] = sum[m-1];
                finalList[m-1] = temp;
                sum[m-1] = temp2;
            }
           }

         System.out.println(Arrays.toString(sum));
         
         counter = 0;
         for (i=1; i<sum.length; i++){
            if(sum[0] == sum[i])
            counter++;
         }
         System.out.println(counter);

         String []ans = new String[counter+1];
         for(j=0; j<ans.length; j++)
         ans[j]=finalList[j];
         return ans;
        }


    public static void main(String[] args) {

        
        String [] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String [] list2 = new String[]{"KFC","Burger King","Tapioca Express","Shogun"};
        charlesPractic599 people = new charlesPractic599();
     System.out.println( Arrays.toString(people.findRestaurant(list1, list2)));

      
        
}
}

