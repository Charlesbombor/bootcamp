package demo_receursion;

public class DemoRecursion {
  public static void main(String[] args) {
    int sum = 0;
   
  
  // 1+2+3+4+5 -> 15

  for (int i=0; i<=5; i++){
    sum += i;
  }
  // System.out.println(sum); //15
  // System.out.println(sum(5));

  // for-loop: Given int n
  // if n is odd, return n * (n-2) * (n-4) * ... * 1
  // if n is even, return n * (n-2) * (n-4) * ... * 2
  int n = 1;
  int sum2 = n;
  for (int i=2; i<n; i++){
    if (n%2==1 && i%2==0){
      sum2 = sum2 * (n-i);
    }
    if (n%2==0 && i%2==0){
      sum2 = sum2 * (n-i);
    }
   }
  System.out.println("* " + sum2);

  System.out.println(crazy(1));

  }
  // resursion: Given int n, return n + (n-1) + (n-2) + 1

  public static int sum (int n){ // n = 5
    // base criteria
    if (n == 1){
       System.out.println(n);
      return 1;
    }
     System.out.println(n);
    return n + sum(n-1); 
   

    // Step1: sum(5) -> return 5 + sum(4);
    // Step2: sum(4) -> return 4 + sum(3);
    // Step3: sum(3) -> return 3 + sum(2);
    // Step4: sum(2) -> return 2 + sum(1);
    // Step5: sum(1) -> reutrn 1;
  }

  // recursion: Given int n
  // if n is odd, return n * (n-2) * (n-4) * ... * 1
  // if n is even, return n * (n-2) * (n-4) * ... * 2
  public static int crazy (int n){
   if (n==1){
    //System.out.println(n);
    return 1;
   }else if(n==2) {
    return 2;
   }
      return n * crazy(n-2);
  }



}

