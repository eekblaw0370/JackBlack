// Case Study 14.1: The Deck class
//modified by Aidan Li

import java.util.*;

public class Deck{

   public static final int MAX_SIZE = 52;

   private ArrayList<Card> cards;

   public Deck(){
      reset();
   }
   
   public Deck(boolean isempty){ //better constructor
       cards=new ArrayList<Card>();
    }
    
   public Deck(Suit suit){
       cards=new ArrayList<Card>();
       addSuit(suit);
    }

   public void reset(){
      cards = new ArrayList<Card>();
      addSuit(Suit.spade);
      addSuit(Suit.heart);
      addSuit(Suit.diamond);
      addSuit(Suit.club);
   }
   
   public void addSuit(Suit suit){
      for (int i = 1; i <= 13; i++)
         cards.add(new Card(suit, i));
   }

   public boolean isEmpty(){
    return cards.isEmpty();
   }

   public int size(){
      return cards.size();
   }

   public Card deal(){
      if (isEmpty())
         return null;
      else
         return cards.remove(cards.size() - 1);
   }

   public Card[] deal(int number){
      if (number > cards.size())
         return null;
      else{
         Card[] hand = new Card[number];
         for (int i = 0; i < hand.length; i++)
            hand[i] = deal();
         return hand;
      }
   }

   public void shuffle(){
      if (cards.size() < MAX_SIZE)
         return;
      Random gen = new Random();
      Card[] array = new Card[MAX_SIZE];
      while (cards.size() > 0){
     Card card = cards.remove(cards.size() - 1);
     int i = gen.nextInt(MAX_SIZE);
     while (array[i] != null)
            i = gen.nextInt(MAX_SIZE);
     array[i] = card;
      }
      for (Card card : array)
         cards.add(card);
   }
   
   public void bettershuffle(){
       int x=cards.size();
      Random gen = new Random();
      Card[] array = new Card[x];
      while (cards.size() > 0){
     Card card = cards.remove(cards.size() - 1);
     int i = gen.nextInt(x);
     while (array[i] != null)
            i = gen.nextInt(x);
     array[i] = card;
      }
      for (Card card : array)
         cards.add(card);
    }

   public String toString(){
    String result = "";
    for (Card card : cards)
        result += card + "  ";
    return result;
   }
   
   //Methods I added becuz u can't just use arraylist methods
   public boolean contains(int ranque){
       for(Card card:cards){if(card.getRank()==ranque)return true;}
       return false;
    }
    
   public int get(int z){return cards.get(z).getRank();} 
   public Card getcard(int z){return cards.get(z);}
    
   public int indexOf(int x){
       for(int i=0;i<cards.size();i++){
           if(cards.get(i).getRank()==x)return i;
        }
        return -1;
    } 
    
   public void priinntt(){
       int l;
       for(Card c:cards){
           l=c.getRank();
           if(l==1)System.out.print("Ace ");
           else if(l==11)System.out.print("Jack ");
           else if(l==12)System.out.print("Queen ");
           else if(l==13)System.out.print("King ");
           else System.out.print(c.getRank()+"  ");
        }
    }
    
   public int remove(int z){return cards.remove(z).getRank();}
   public Card removecard(int z){return cards.remove(z);}
}
