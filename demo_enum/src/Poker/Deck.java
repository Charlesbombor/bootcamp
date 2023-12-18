package Poker;

import java.util.Arrays;

public class Deck {

  private Card[] cards;

  private Deck (int numberOfCards){
    this.cards = new Card[numberOfCards];
    int idx=0;
    for (Suit s : Suit.values()){
      for (Rank r : Rank.values()) {
        this.cards[idx++] = new Card(r,s);
      }
  }
}

public void riffle(){
Card[] cards = new Card[52];
  int s = 0;
  s =(int)(Math.random()*52+1);
 
   System.out.println(s);
  Card[] newCards1 = new Card[s];
  Card[] newCards2 = new Card[52-s];
  Card[] newCards3 = new Card[52];
  
  int i = 0;
  int j = 0;
  int k = 1;
  int m = 0;
  int n = 0;
    
  for (i=0; i<52-1; i++){
    cards[i] = this.cards[i+1];
  }

  for (i=0; i < s; i++){
    newCards1[i] = cards[i];
  }

  for (i=s; i < 52; i++){
    newCards2[j++] = cards[i];
  }

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
  this.cards = newCards3;
    }
  

private void overhand(){
  int s = 0;
  int i = 0;
  int j = 0;
  Card[] newCards = new Card[52];
  s =(int)(Math.random()*52+1);
  
for(i=0; i < s; i++){
newCards[i] = this.cards[52-s+i];
}

for(i=s; i < 52; i++){
newCards[i] = this.cards[j++];

this.cards = newCards;
}
}


  public static Deck ofPocker(){
    return new Deck(52);
  }

 

  public static void main(String[] args) {
    Deck deck = Deck.ofPocker();
    deck.riffle();
    deck.riffle();

    System.out.println(Arrays.toString(deck.cards));
  }
  
}
