package classPracticing.src;

import java.util.Arrays;

public class riffle {
  public static void main(String[] args) {
    
  
  int[] cards = new int[52];
  int s = 0;
  s =(int)(Math.random()*52+1);
   //System.out.println(s);
 
   System.out.println(s);
  int[] newCards1 = new int[s];
  int[] newCards2 = new int[52-s];
  int[] newCards3 = new int[52];
  
  int i = 0;
  int j = 0;
  int k = 1;
  int m = 0;
  int n = 0;
    
  for (i=0; i<52; i++){
    cards[i] = i+1;
  }

  for (i=0; i < s; i++){
    newCards1[i] = cards[i];
  }
     System.out.println(Arrays.toString(newCards1));

  for (i=s; i < 52; i++){
    newCards2[j++] = cards[i];
  }
     System.out.println(Arrays.toString(newCards2));

// checked ok
    j=0;
    k=1;
    if (s>26){
    n = 52-((52-s)*2);
    m = newCards1.length-n;
    for(i=0; i<newCards2.length; i++){
    newCards3[j] = newCards1[i];
    j+=2;
    newCards3[k] = newCards2[i];
    k+=2;
    }
     for(i=52-n; i<52; i++){
      newCards3[i] = newCards1[m++];
   } 
  }
    else {
      n = (s*2);
   
      for (i=0; i<newCards1.length; i++){
        newCards3[j] = newCards1[i];
        j+=2;
        newCards3[k] = newCards2[i];
        k+=2;
      }
      for(i=n; i<52; i++){
      newCards3[i] = newCards2[s++];
   }

    }
    
    System.out.println(Arrays.toString(newCards3));

 
   }
        

  }
  


