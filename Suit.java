// Case Study 14.1: The Suit class

public class Suit implements Comparable{

   static public final Suit spade   = new Suit(4, "spades");   
   static public final Suit heart   = new Suit(3, "hearts");   
   static public final Suit diamond = new Suit(2, "diamonds");   
   static public final Suit club    = new Suit(1, "clubs");
   static public final Suit empty   = new Suit(0, "empty");
   static public final Suit white   = new Suit(5, "white");
   static public final Suit black   = new Suit(6, "black");
   
   private int order;
   private String name;

   public Suit(int ord, String nm){
      name = nm;
      order = ord;
   }

   public int compareTo(Object other){
      if (! (other instanceof Suit))
         throw new IllegalArgumentException("Parameter must be a Suit");
      Suit otherSuit = (Suit)other;
      return order - otherSuit.order;
   }

   public String toString(){
      return name;
   }
}