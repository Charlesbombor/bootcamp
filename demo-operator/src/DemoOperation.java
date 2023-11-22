//package demo-operator;

public class DemoOperation {

  public static void main(String[] args) {
    int x =2;
    x++;
    ++x;
    x += 1;
    x = x+1; //6

   // difference between a++ and ++a
   int a =5;
   int preIncrement = ++a; // a is increment by 1 first, and then being assigned to the variable
   // a -> 6 first, the  preIncrement -> 6

   int b =5;
   //int postIncrement = b++; // assign the value of variable a  to postIncrement
   // postIncrement -> 5, b-? 6
   //System.out.println("postIncrement=" + postIncrement); //5
   //System.out.println("b=" + b); //6

   int c = 2;
  // int MM = --c;
  // System.out.println("MM:" + MM + MM-- + MM);
   //System.out.println("CC: " + (c++ + ++c + c));
   //System.out.println(MM++ + ++MM + MM );

   // Conditional Operatiors
   // && || !

   // Example 1
   if (c == 2 && b == 4) { // && -> both two conditions need to be fulfilled
    // (c ==2) -> true
    // (b == 4) -> false
    // true && false -> false
    System.out.println("yes");
   } else {
      System.out.println("no");
    }

   // Example 2
   if (c == 2 || b ==4 ) {
    // (c == 2) --> true
    // (b == 4) --> false
    // (true || false) --> true
    System.out.println("yes");

   } else {
    System.out.println("no");
  
    }

    //Example 3 And OR
    String h ="hello";
    if (c == 2 && (b == 4 || "hello".equals(h))){
      // (c ==2) --> true
      // (b ==4) --> false
      // "hello".equals(h)  --> true
      // (true && (false || true)) --> true
      System.out.println("yes"); // print
    } else {
      System.out.println("no");
    }

      // Example 4 -- AND only happen on AND situation, not OR situation
      if (c==1 && b==6) {
        // (c==1) --> false
        // (b==6) will Not be executed
        System.out.println("yes");
      }else {
      System.out.println("no");
    }

    int score = 80;
    if(score <=100 && score >=90)
    {
      System.out.println("A");
    }else if(score >=80)
    {
      System.out.println("B");
    }else if(score >= 70)
    {
      System.out.println("C");
    }else
    {
      System.out.println("F");
    }
    // Example 5 -- AND OR
    if (c == 1 || b== 4 && "hello".equals(h)){ // operate && first in this case
      // b == 4 --> false
      // "hello".equals(h)  --> true
      // c == 1 --> false
      // false || false && true
      // false || false
      // false
      System.out.println("example5=yes");
 }  else {
  System.out.println("example5 = no");
 }

 // Example 6 -- AND OR
 if (h.charAt(3) == 'e' || b == 5) {
  //h.charAt(3) == 'l'
  //b == 5 --> true
  // false || true
  // true
  System.out.println("Example 6 = yes");
 }


 // comparsion operators NOT only exists in if statements
 // boolean --> && ||
 boolean b1 = true && false;
 System.out.println("b1: " + b1);

 boolean b2 = false;
 boolean b3 = true;

 boolean result = b2 || b3;
 System.out.println("Result=" + result);  // true

 boolean result2 = b2 || b3 && b1; //false ||　true　＆＆ false
 System.out.println("result2= " + result2); // flase

// Example 7 now b1 is false
 if (b1 == false) { //!b1
  System.out.println("Example 7a: " + "b1 is false"); // print
 }
if (!b1) { // b1 == false
  System.out.println("Example 7b: " + "b1 is false"); // print
 }


 // Example 8 now b1 is false
 if (!b1) {  
  System.out.println("Example 8a:" + "b1 is true");  
 }

if (b1) {  // b1 == true
  System.out.println("Example 8b:" + "b1 is true");  
 }

int g = 0;
if (b1 == false) {
  g = 10; 
  System.out.println(g);
}

int k = b1 == false ? 10 : 0;
// if b1 is false, assign(?) 10 to k, otherwise(:) 0
System.out.println("k= " + k);

int j = b1 == true ? 12 : 0;
System.out.println("j: " + j);

String str1 = "hello";
String str2 = "Bye";
String z =  ( k == 9) ? str1 : str2; // k is 10
System.out.println("z: " + z); // 0

char Char1 = 'Y';
char Char2 = 'N';
char u =  ( z == "hello") ? Char1 : Char2; // z is Bye
System.out.println("U: " + u);

int a1 = 10;
int a2 = 4;
int min = a1 > a2 ? a2 : a1;
System.out.println("Min is: " + min);

int a3 = 2;
int a4 = 8;
int minimum = ( a3 > a4) ? a4 : a3;
System.out.println("Min is: " + minimum);

int a5 = 1;
int a6 = 1;
int min2 = a5 < a6 ? a5 : a6;
System.out.println("Min2 is " + min2 ); // giving a6, because false

int number = 13;
boolean isOdd;
 isOdd = (number % 2 == 1)   ;
  
System.out.println("The number is a " + isOdd); //Odd number: true

double totalAmount = 0;
int itemTotal = 9999 ;
//double feeRate = 0.0d;
// if itemTotal >3000, no transportation fee, otherwise +3% transportation fee
//totalAmount = itemTotal > 3000 ? itemTotal * 0.03 + itemTotal : itemTotal;

  //if (itemTotal > 3000) {
   // totalAmount = itemTotal * 0.03 + itemTotal;
    // totalAmount = itemTotal * (1 + feeRate);
  //} else{
    //totalAmount = itemTotal;
 // }
  //System.out.println("TotalAmount is " + totalAmount);

  if (itemTotal <= 3000) {
    totalAmount = itemTotal;
  } else {
    totalAmount = itemTotal *0.03 + itemTotal;
  }
  System.out.println("TotalAmount is " + totalAmount);

 

  }

}


