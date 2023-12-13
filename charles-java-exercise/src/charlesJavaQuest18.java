/*
 * 
 * Question : Given an array of strings words, 
 * return the first palindromic(對稱) string in the array.
 *  If there is no such string, return an empty string "".
*/

import java.util.Arrays;

public class charlesJavaQuest18 {
  public static void main(String[] args) {
    String[] testCase1 = new String[] { "abc", "car", "ada", "racecar", "cool" };
    String[] testCase2 = new String[] { "notapalindrome", "racecar" };
    String[] testCase3 = new String[] { "ADABCCBADA", "car", "ada", "racecar" };
    String[] testCase4 = new String[] { "abc" };

    System.out.println(firstPalindrome(testCase1)); // Output : "ada"
    System.out.println(firstPalindrome(testCase2)); // Output : "racecar"
    System.out.println(firstPalindrome(testCase3)); // Output : "ADABCCBADA"
    System.out.println(firstPalindrome(testCase4)); // Output : "No Palindrome word in String Array."

  }

  private static boolean isPalindrome(String s) {
    // hints : if a String is Palindrome , return true
    
    int i;
    StringBuffer reverseTial;
    //System.out.println(s);
    i = s.length() / 2;
    
   
    
    StringBuffer head = new StringBuffer(s.substring(0, i));
    StringBuffer tial;
    //System.out.println("head: " + head);
    
    if (s.length() % 2 == 0){
    tial = new StringBuffer(s.substring(i));
    
     }
     else{ 
    tial = new StringBuffer(s.substring(i+1, s.length()));
    
     } 
     reverseTial= tial.reverse();
    //System.out.println("tial: " + reverseTial);
    if (head.toString().equals(reverseTial.toString())){
      
       return true;
    } else
      
    return false;
 
  }

  
  public static String firstPalindrome(String[] words) {
    // hints : finish the logic by using isPalindrome() , for-loop , if-else
   // System.out.println(Arrays.toString(words));
    System.out.println("words: " + Arrays.toString(words));
    for (int i=0; i<words.length; i++){
      //System.out.println(isPalindrome(words[0]));
    if (isPalindrome(words[i]) == true){

      return words[i];
      
    } 
    
    }
     return "No Palindrome word in String Array.";
  }
    
    
  }


