public class charlesJavaQuest20 {
  /*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

the input need to be lowercase English letters.
*/

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    if (s.equals(goal))
    return true;
    int i = 0;
    for (i=0; i<s.length(); i++){
      if (s.charAt(i) == goal.charAt(0))
      break;
    }
    if (i==0)
    i =1;
    // System.out.println(i);
     //System.out.println(s.substring(0, i));
    int j = goal.length()-i;
    //System.out.println(goal.substring(j));
    return (s.substring(0, i).equals( goal.substring(j)));
   
    }
    
}
  



