public class DemoInArray {
    public static void main(String[] args) {
       int age1=20;
       int age2=25;
       int age3=30; 
       int age4=28;
      int []arr2;
       // define an array (container) to store a list of int number
       //this array (container) can only store int number
       int[]arr = new int[9]; // length of array, by index 0 to 8
       // assignment 
       int a=1;
       arr[0]=20;
       System.out.println("arr[0]=" + arr[0]); // 20
       arr[1]=25;
       arr[0]= arr[0] + arr[1];
       System.out.println("arr[0] is " + arr[0]);
       arr[2]=a;
       System.out.println("arr[3] is " + arr[3]);
      System.out.println("arr[2] is " + arr[2]);
      // arr[9] =28; //error, no index 9 in array arr

      int b; // local variable
      b=1; // explicitly assignment
      System.out.println(b); // you have to explicitly assign value before using it

      arr2 = new int[5];
      int []arr3 = new int[]{100, 5, 30, 9, -40};

      double []arr4 = new double []{1.2, 4.9, 4.3, 23.0};
        System.out.println(arr2.length); //5
        arr2 = new int [10];
        System.out.println(arr2.length);
        System.out.println("arr[1] is " + arr[1]);
        arr = new int [10];
        System.out.println("arr[1] is " + arr[1]);
      // array supports for loop
    // default value of int[]
    int[] arr5 =new int[3];
    for ( int x=0; x<arr5.length; x++){
      // arr5 is storing the address of the array object
      // we use arr5[5] find out the 3 value stored in the array object
      arr5[x]= x+1;
      System.out.println(" arr5[X] " + arr5[x]);
      // [0] -> 1
      // [1] -> 2
      // [2] -> 3
      
      for (int y=arr5.length-1; y>=0; y--){
        
        System.out.print(arr5[y]); // "3 2 1"
        if (y>0){
          System.out.print(" ");
        }
      }


      String str= "hello"; // str is storing the address of String object hello
      String str2= new String("hello"); // str2 is storing the address of String object hello
      String str3= String.valueOf("hello");
    }
    }
}


