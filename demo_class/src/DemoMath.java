package demo_class.src;

import java.util.Random;

public class DemoMath {
  public static void main (String[] args) {
    // pow()
    System.out.println(Math.pow(2.0, 10));
    System.out.println(Math.pow(2.0, -1));
    System.out.println(Math.pow(2.0, -2));
    System.out.println(Math.pow(-2.0, 3));

    // abs(), absolute value
    System.out.println(Math.abs(3.2)); // 3.2
    System.out.println(Math.abs(-3.2));

    // ceil(), floor(), round()
    System.out.println("ceil: " + Math.ceil(3.1));
    System.out.println(Math.ceil(3.9));

    System.out.println(Math.floor(3.1));
    System.out.println("**"+Math.floor(3.9));

    System.out.println(Math.round(14.4));
    System.out.println(Math.round(14.5));
    System.out.println(Math.round(14.44));
    System.out.println(Math.round(14.45));

    // Approach 1
    int[] arr = new int[] {-2,20,100,-40};
    int max = -1;
    for (int i=0; i<arr.length; i++){
      if (arr[i]>max){
        max = arr[i];
      }
    }
    System.out.println(max);

    //Approach 2
    for (int i=0; i<arr.length; i++){
      max = Math.max(arr[i], max);
    }
    System.out.println(Math.min(7.5, 6.8));

    System.out.println(Math.sqrt(81)); // 9
    System.out.println(Math.sqrt(-81)); // Nan

    double d1 = Math.sqrt(-81);
    System.out.println(d1);
    if (Double.isNaN(d1))
    System.out.println("d1 is NaN");

    int random1 = new Random().nextInt(3); // 0,1,2
    System.out.println(Math.random()); //0.0 - 1.0 inclusively

    // 1 - 10
    int random2 = (int)(Math.random() * 10);
    System.out.println(random2);

   //int x = 3.5 + 4;
   int y = 7;
   y += 3.5;
   //y = y + 3.5;
   System.out.println(y);
  }
  
}
