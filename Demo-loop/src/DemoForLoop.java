public class DemoForLoop {

    public static void main(String[] args) {
       
    int x= 2;

    // counter initialization ; counter's continue condition ; counter's movement
    // Step 1: int i = 0;
    // Step 2: i<4 ??
    // Step 3: Yes --> x*=2
    // Step 4: sysout 4
    // Step 5: i++
    // Step 6: i<4 ?? i is 1
    // Step 7: Yes -> x*=2
    // Step 8: sysout 8
    // Step 9: i++
    // Step10: i <4 ?? i is 2
    // Step11: Yes -> x*=2
    // Step12: sysout 16
    // Step13: i++
    // Step14: x < 4 ?? i is 3
    // Step15: Yes -> x*=2
    // Step16: sysout 32
    // Step17: i++
    // Step18: i <4 ??　i is 4
    // Step19: No --> the end of World
    for (int i= 0; i < 4; i++){  // 0,1,2,3
        x *=2;
        System.out.println("x=" + x);
    }

    int y = 2;
    for (int i= 10; i > 4; i--){  // must use int i=0; i < 2; i++ this format
        y *=2;
        System.out.println("y=" + y);
    }


    // 0+1+2+4+.......+10  --> total
    int total =0; 
    
    for (int q = 0 ; q < 11 ; q++){ 
       total += q;
        System.out.println("subtotal:" + total);
    }
    System.out.println("total=" + total); //55

    // 0+2+4+.......+10  --> total
    int total2 = 0;

    for(int w=0; w <11 ; w++){
        if( w%2 == 0){
            total2 += w;
            System.out.println("Subtotal:" + total2);

        }
    }
    System.out.println("Total2: " + total2); //30

    // int total2 = 0;
    // int times = 10;
    // for(int w=0; w <=((times/2)+1) ; w++){
    //     if( w%2 == 0){
    //         total2 += w*2;
         //   System.out.println("Subtotal:" + total2);


    System.out.println("Total2234: " + total2); //30

    int total3=0;
    for(int g=0; g<11 ; g+=2){
        total3 +=g;
        System.out.println("Subtatal3: " + total3); //30
    }
    //0-100
    //i) 0-50, odd -> sum1
    //ii) 51 - 100, even -> another sum2
    //total --> sum1 * sum2

    int total4 = 0;
    int sum1 = 0;
    int sum2 = 0;
        for (int k=0; k<101; k++){
            if(k <= 50 &&  k%2==1){
                sum1 +=k;    
            }
            if(k<=100 && k>=51 && k%2==0){
                sum2 +=k;
            }
            total4 = sum1*sum2;
        } System.out.println("Total4a: " + total4);



        total4 = 0;
        sum1 = 0;
         sum2 = 0;
        for (int i= 0; i< 101; i++){
            if (i<51){
                if (i%2==1){
                    sum1 += i;
                }
            }else {
                if (i%2 == 0){
                    sum2+=i;
                }
                
            }
        }
        total4 = sum1*sum2;
                System.out.println("Total4b:" + total4);

        //continue
        //sum up all odd number (0-100)
        int sum =0;
        for (int j=0 ; j < 101; j++) { // 0,1,2,3,4,.....100
            // skip even number: continue
            if (j%2 == 0) {
                continue; // go to the next iteration, skip the rest of codes
            }
            // For even number, the following code will skipped
            sum += j;
        }

        System.out.println("sum=" + sum);
        //break
        for (int i=0; i<4; i++){
            if (i==2){
                break;
            }
            System.out.println("i=" + i);

            //continue  -> go to the next iteration of i
            for (int o = 0; o < 4 ; o++){
                if (i==2){
                    continue;
                }
                System.out.println("o=" + o);
            }
        }
        // sum up all odd number (0-100)
        //i) sum <= 200
        //The loop should be ended at which number of t?
        int sum7 =0;
        int t=0;
        for ( t=0; t <101;t++){
            if ( t%2==1){//( t%2==1){
                sum7 +=t;
                //System.out.println("t=" + t + ",sum" + sum7);
               if  (sum7 > 200)
                break;
                
            
                //**if ( sum7 == 196)
                int t1 = 0;
                    if (sum7+(t1+2) <=200)
                        if ((sum7+(t+(t1+2))>200))
               System.out.println("t=" + t + ",sum" + sum7);
                
            }
          // System.out.println("t=" + t + ",sum" + sum7);
           // Ans should be t=27 sum=196
    }
            //if (sum7<=200)
              // System.out.println("t=" + t + ",sum" + sum7);

        
    }
}
    





