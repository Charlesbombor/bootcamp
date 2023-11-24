public class charlesPractic {
  public static void main(String[] args) {
    
int x = 0;
x += 1; // same as x = x+1;
System.out.println("x +=1 make x become " + x); // 1


String good = "y";
String str = "Nice";
System.out.println(good.length());
System.out.println("str length is "+ str.length());
  if (str.length() == 0 ) {
  System.out.println("Done"); 
  } else 
  System.out.println("Not done");
 
double mark = 0.0d;
double mark2 = 0.0d;
String name = "Charles"; 

if ( mark <= 50 && mark2 <= 50 || name == "Charles" ){
 System.out.println("Pass");
}
int sum7 =0;
        int t=0;
        for ( t=0; t <101;t++){
            if ( t%2==1){
                sum7 +=t;
                //System.out.println("t=" + t + ",sum" + sum7);
               if  (sum7 > 200)
                break;
                
                //**if ( sum7 == 196)
               // int t1 = 0;
               // if (sum7+(t1+2) <=200 && (sum7+(t+(t1+2))>200) )
                    //**if (sum7+(t1+2) <=200)
                       //**  if ((sum7+(t+(t1+2))>200))
               System.out.println("t=" + t + ",sum" + sum7);
                
            }


    } 

         sum7 =0;
         t=0;
        for ( t=0; t <101; t++){
            if ( t%2==0){
                continue;
                  sum7+=t;
                  if (sum7>200){
                    sum7-=t;
                    break;
                  }
                 = t;

        } 
         System.out.println("sum=" + );  
      } 


      
          }
        }
    



  








