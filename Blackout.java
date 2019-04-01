

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Blackout
{
    public Blackout(){
    String[] test = new String[52]("1♥","2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥","Jack♥","Queen♥","King♥","1♦","2♦","3♦","4♦","5♦","6♦","7♦","8♦","9♦","10♦","Jack♦","Queen♦","King♦","1♣","2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣","Jack♣","Queen♣","King♣","1♠","2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠","Jack♠","Queen♠","King♠");
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Initialize cards
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      int index = (int)(Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    
    }
    public static void Rules()
    {
        System.out.println("In blackout, the dealer deals out 10 cards to each of the (4) players");
        System.out.println("and flips over a extra card. Once everyone has their cards, each person will");
        System.out.println("say the number of rounds in which they will win. (The sum of these cannot be"); 
        System.out.println("equal to the size of you hand. You will get 100 points for getting exactly the number of"); 
        System.out.println("cards you declared at the beggining and 10 points for each round you won (but");
        System.out.println("only if you got the number you declared. Once you play all 10 rounds, you add"); 
        System.out.println("up the scores and play again with 9 cards and 9 rounds. then 8 cards and 8 rounds");
        System.out.println("until you play with 1 card and 1 round. Then the player with the highest score wins");
        System.out.println("ROUNDS:");
        System.out.println("Rounds will start with the winner of the last round (or left of the dealer if"); 
        System.out.println("the begging of a game). The first player can play any card. Then each other player");
        System.out.println("will play a card, but if you have a card with the same suite as the card played");
        System.out.println("by the first player you must play that card. The winner of the round is determined");
        System.out.println("by who has played the biggest card (of the first players suite), but can also");
        System.out.println("be won using the trump suite. The trump suite is the suite of the extra card that"); 
        System.out.println("was turned over while dealing cards. If the first player did not play a card of");
        System.out.println("trump suite and you have no cards of the first player's suite, you can win the ");
        System.out.println("round by playing a trump card (bigger trump cards beat smaller ones).");
        
    }
}
