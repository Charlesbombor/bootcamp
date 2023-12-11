public class Practicing_forloop {
    //0-100
    //i) 0-50, odd -> sum1
    //ii) 51 - 100, even -> another sum2
    //total --> sum1 * sum2

  public static void main(String[] args) {
    Integer sum1 = 0; // sum up odd num
    Integer sum2 = 0;
    Integer i;
    for (i=0; i<=100; i++){
      if (i>0 && i<=50 && i%2==1){
        sum1 = sum1 + i;
      } else if(i>50 && i<=100 && i%2==0){
        sum2 = sum2 + i;
      }
    }
      System.out.println(sum1 * sum2);
      System.out.println(sum1);
      System.out.println(sum2);
    // Continue
    // sum up all odd number (0-100)
        //i) sum <= 200
        //The loop should be ended at which number of t?
        Integer sum = 0;
        for(i=0; i<=100; i++){
          if (i%2==0){
          continue;
        }
        sum += i;
          if (sum > 200){
          sum = sum-i;
          break;
      } 
      }
      System.out.println(sum);
      System.out.println(i);
    }
     
    }


