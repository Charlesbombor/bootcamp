package classPracticing.src;

import java.util.Arrays;

public class overhead {
  public static void main(String[] args) {
    int[] cards = new int[52];
    
    int[] newCards = new int[52];
    int s = 0;
    int i = 0;
    int j = 0;
    for(i=0; i<52; i++){
      cards[i] = i+1;
    }
    //System.out.println(Arrays.toString(cards));
   //Card[] newCards = new Card[52];
    s =(int)(Math.random()*52);
    System.out.println(s);
    
    for(i=0; i < s; i++){
    newCards[i] = cards[52-s+i];
    }
   // System.out.println(Arrays.toString(newCards));
     //System.out.println(Arrays.toString(cards));

   for(i=s; i < 52; i++){
    newCards[i] = cards[j++];
  }

System.out.println(Arrays.toString(newCards));
}
}
