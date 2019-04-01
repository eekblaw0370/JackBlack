
/**
 * CrazyEights a game like Uno can be played by one player verus the computer to see who can run
 * out of cards faster than the other.
 *
 * Evan Ekblaw
 * 1.1 - 4/1/2018
 *
 * Major Rules
 * 8 is the wild card
 * Playing a 2 forces the next player to play a 2 or, if unable, to draw two cards from stock and miss a turn. 
 * If that player draws, the next player may proceed in the usual way; but, if a 2 is played, the next player must do 
 * likewise or draw four cards and miss a turn. Each successive 2 so played adds two to the number that must be drawn 
 * by the next player for failure to play a 2, up to a maximum of eight cards. A 4 works like a 2, except that it 
 * requires a 4 to be played or four cards to be drawn (up to a maximum of 16 cards). Playing a jack reverses the direction 
 * of play and forces the preceding player to play a jack too, reversing play again, or else that player misses a turn.
 */

import java.util.Random;
import java.util.*;

public class crazy8 
{   public static void play(){
        Deck deck1 =new Deck();
        ArrayList<Card> human=new ArrayList<Card>();
        ArrayList<Card> computer=new ArrayList<Card>();
        menu1();
    }

    public static int menu1(){
        int num=-1;
        while(num<0 || num>0){
            System.out.println("Here is your oppnent ");
            System.out.println("0 - Jack, the world Crazy Eight Cup Champion. You will probably lose. Type 0 to challenge this master.");
            Scanner get=new Scanner(System.in);
            num=get.nextInt(); if(num<0 || num>0){System.out.println("No! Not an option!");}
        }
        return num;
    }

}
 