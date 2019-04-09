
/**
 * CrazyEights a game like Uno can be played by one player verus the computer to see who can run
 * out of cards faster than the other.
 *
 * Evan Ekblaw
 * 1.1 - 4/1/2018
 *
 * Major Rules:
 * Start with 5 cards in your hand, play them all and you win!!
 * Eights are wild and can be played at any time. When a player plays an eight, they then get to pick the current suit, 
 * whether that be hearts, clubs, spades, or diamonds. If the player can't match the top cards, then they must draw cards 
 * from the deck until they get a match. 
 * Playing a 2 forces the next player to play a 2 or, if unable, to draw two cards from stock and miss a turn. 
 * If that player draws, the next player may proceed in the usual way; but, if a 2 is played, the next player must do 
 * likewise or draw four cards and miss a turn. Each successive 2 so played adds two to the number that must be drawn 
 * by the next player for failure to play a 2, up to a maximum of eight cards. A 4 works like a 2, except that it 
 * requires a 4 to be played or four cards to be drawn (up to a maximum of 16 cards). Playing a jack reverses the direction 
 * of play and forces the preceding player to play a jack too, reversing play again, or else that player misses a turn.
 */

import java.util.Random;
import java.util.*;

public class crazy8{ 
    private int rank;
    
    
    public static void StartGame(){
        Deck Stock =new Deck();
        ArrayList<Card> human=new ArrayList<Card>();
        ArrayList<Card> computer=new ArrayList<Card>();
        rules();
        menu();
        Stock.shuffle();
        while (!Stock.isEmpty()){
            Card card = Stock.deal();
            System.out.println(card);
        }
    }

    public static void rules(){
        System.out.println("Major Rules:");
        System.out.println("1. You will start with 5 cards in your hand play them all and you win!!");
        System.out.println("2. Eights are wild and can be played at any time. When a player plays an eight, they then get to pick the current suit,");
        System.out.println("whether that be hearts, clubs, spades, or diamonds. If the player can't match the top cards, then they must draw cards ");
        System.out.println("from the deck until they get a match.");
        System.out.println("3. Playing a 2 forces the next player to play a 2 or, if unable, to draw two cards from stock and miss a turn.");
        System.out.println("If that player draws, the next player may proceed in the usual way; but, if a 2 is played, the next player must do");
        System.out.println("likewise or draw four cards and miss a turn. Each successive 2 so played adds two to the number that must be drawn ");
        System.out.println("by the next player for failure to play a 2, up to a maximum of eight cards. A 4 works like a 2, except that it ");
        System.out.println("of play and forces the preceding player to play a jack too, reversing play again, or else that player misses a turn.");
    }

    public static int menu(){
        int num=-1;
        while(num<0 || num>0){
            System.out.println("-------------------------------------");
            System.out.println("");
            System.out.println("Here is your oppnent ");
            System.out.println("0 - Jack, the world Crazy Eight Cup Champion. You will lose. Type 0 to challenge this master.");
            Scanner get=new Scanner(System.in);
            num=get.nextInt(); if(num<0 || num>0){System.out.println("No! Not an option!");}
        }
        return num;
    }
    
    public String rankToString(){
      if (rank == 1)
         return "Ace";
      else if (rank == 2)
         return "Two";
      else if (rank == 3)
         return "Three";
      else if (rank == 4)
         return "Four";
      else if (rank == 5)
         return "Five";
      else if (rank == 6)
         return "Six";
      else if (rank == 7)
         return "Seven";
      else if (rank == 8)
         return "Eight";
      else if (rank == 9)
         return "Nine";
      else if (rank == 10)
         return "Ten";
      else if (rank == 11)
         return "Jack";
      else if (rank == 12)
         return "Queen";
      else if (rank == 13)
         return "King";
      else
         return "" + rank;
   }
}
