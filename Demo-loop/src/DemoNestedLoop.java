public class DemoNestedLoop {

  public static void main(String[] args) {
    for (int i=0; i<5; i++){  //0,1,2,3,4
      //System.out.println("*");
      System.out.println("*"); // *****
      
    }

    for (int i=0; i<4; i++){ // 52 weeks in a year
      System.out.println("Happy, i=" + i );
      for (int j=0; j<3; j++){ // 7 days in a week
        //System.out.println("i=" + i + " j= " + j);
        if (i>1 && j>1){
          break;
        }
          System.out.println("Sad, j= " + j);
      }
    }

    //i<5
    //j<4
    //System.out.println();  --> print & newline
    //System.out.print(); --> print

    for (int i=0 ; i<5; i++){ //two pratten use nest forloop (two forloop )
      for (int j=0 ; j<4-i; j++){
       System.out.print("*");
        }
          System.out.println("");
      }

      String str = "abcdefghijk";
      int k =0;
      for (int i=0; i<str.length(); i++) { //variable length
        if (k==str.length())
        break;
      for (int j =0; j<4; j++){
        if (k<str.length())
        System.out.print(str.charAt(k++));  
        }
        System.out.println("");
     }
       // nested loop, 4 character in a row
      //abcd
      //efgh
      //ijk
     

      for(int i=0; i<6; i++){       // two prattens need two forloop
        for(int j=0; j<3; j++){
          // *** *** *** *** *** ***
          System.out.print("*");
        }
        System.out.print(" ");
      }

      System.out.println();

      for (int i=0;i<9;i++){      
        System.out.print("*");
          int cnt=i+1;
          if (cnt%3==0 && cnt!=9){
            
            System.out.print("a");
          }
       
      }
    }
  }
  
    // ****
    // ***
    // **
    // *
  
  


  

