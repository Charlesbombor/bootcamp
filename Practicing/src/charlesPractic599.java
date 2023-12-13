import java.util.Arrays;

public class charlesPractic599 {
        
       

        public charlesPractic599(){

        }
    

public String[] findRestaurant(String[] list1, String[] list2) {
        
        String[] newList1 = new String[list1.length];
        String[] newList2 = new String[list2.length];
        String[] singleList = new String[newList1.length];
       
        int i;
        int j;
        int k;
        int m;
        int n;
        int x = 0;
        int y = 0;
        int z = 0;
        int counter = 0;
        

         for (i=0; i< list1.length; i++){
            for(j=0; j< list2.length; j++){
                if(list1[i].length() == list2[j].length()){
                    newList1[x] = list1[i];
                    x++;
                    newList2[y] = list2[j];
                    y++;
                }
            }
         }
        // System.out.println(Arrays.toString(newList1));
       //  System.out.println(Arrays.toString(newList2));
         for (k=0; k < newList1.length-1; k++){
            if (newList1[k] == (newList2[k])) {
                singleList[z] = newList1[k];
                z++;
            }
         }

     //    System.out.println(Arrays.toString(singleList));
            for (m=0; m < singleList.length-1; m++){
            if (singleList[m] != null){
                counter++;
            }
          }

          String[] finalList = new String[counter];

          for(n=0; n < counter; n++){
            finalList[n] = singleList[n];
          }
         
        // System.out.println(Arrays.toString(finalList));
         
         return finalList;
        }


    public static void main(String[] args) {

        
        String [] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String [] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        charlesPractic599 people = new charlesPractic599();
     System.out.println( Arrays.toString(people.findRestaurant(list1, list2)));

      
        
}
}

