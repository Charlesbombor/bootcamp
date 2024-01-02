package Charles_Practicing.src.Practicing.src;

public class charlesPractic2706 {
  public static void main(String[] args) {
    int money = 3;
    int[] prices = new int[]{2,2,1};

  
  int i = 0;
  int j = 0;
  int sum = 0;
  int counter = 0;

  int min1 = 101, min2 = 101;
  for (int price : prices) {
      if (price < min1) {
          min2 = min1;
          min1 = price;
      } else if (price < min2) {
          min2 = price;
      }
  }


  // for(j=1; j<=100; j++){
  //     for (i=0; i<prices.length; i++){
  //         if (prices[i] == j){
  //         sum += j;
  //         counter++;
  //     }
  //         if (counter == 2){
  //           System.out.println(sum);
  //         break;
          
  //   }
  //     }
  //    if (counter == 2)
  //     break;
  //}
  sum = min1 + min2;
  if (sum <= money)
  System.out.println(money - sum);
  else 
  System.out.println(money);   
}
}

