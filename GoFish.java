//Joe Adcock
//Period 3
//Turns out chess is really time consuming

import java.util.Scanner;
import java.util.ArrayList;

public class GoFish
{
    static ArrayList<Card> human = new ArrayList<Card>();
    static ArrayList<Card> com1 = new ArrayList<Card>();
    static ArrayList<Card> com2 = new ArrayList<Card>();
    static ArrayList<Card> com3 = new ArrayList<Card>();
    static ArrayList<Card> pile = new ArrayList<Card>();
    static Deck patio = new Deck();
    static int numPlayers;
    static int turn;
    static int score1;
    static int score2;
    static int score3;
    static int score4;
    
    public static void main(String [] args)
    {
        boolean done = false;
        initializeGame();
        while (done == false){
            takeTurn();
        }
        congratulate();
    }
    
    public static void initializeGame()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Go Fish! How many players do we have today? (enter a number 2-4)");
        numPlayers = reader.nextInt();
        
        System.out.println("Shuffling deck and dealing cards...");
        for (int i = 0; i < 10; i++){
            patio.shuffle();
        }
        if (numPlayers == 2){
            for (int i = 0; i < 7; i++){
                human.add(patio.deal());
                com1.add(patio.deal());
            }
        }else if (numPlayers == 3){
            for (int i = 0; i < 6; i++){
                human.add(patio.deal());
                com1.add(patio.deal());
                com2.add(patio.deal());
            }
        }else{
            for (int i = 0; i < 5; i++){
                human.add(patio.deal());
                com1.add(patio.deal());
                com2.add(patio.deal());
                com3.add(patio.deal());
            }
        }
        while (!patio.isEmpty()){
            pile.add(patio.deal());
        }
        
        turn = (int)(Math.random() * numPlayers) + 1;
    }
    
    public static void takeTurn(){
        System.out.println("Player " + turn + "'s turn!");
        Scanner reader = new Scanner(System.in);
        int demandNum;
        int demandRank;
        if (turn == 1){
            System.out.println("Do you want to demand cards from Player 2, Player 3, or Player 4? (2-4)");
            demandNum = reader.nextInt();
            System.out.println("What rank would you like to demand? (1-13)");
            demandRank = reader.nextInt();
        }else{
            demandNum = turn;
            while (demandNum == turn){
                demandNum = (int)(Math.random() * numPlayers) + 1;
            }
            demandRank = (int)(Math.random() * 13) + 1;
        }
        System.out.println("- Player " + demandNum + ", do you have any " + demandRank + "s?");
        boolean response = check(demandNum, demandRank, turnToPlayer(turn));
        if (response == false){
            System.out.println("- No, I do not. Go Fish!");
            turnToPlayer(turn).add(patio.deal());
        }else
            System.out.println("- Yes, I do. Here you go!");
        int[] nums = new int[13];
        for (int i = 0; i < turnToPlayer(turn).size(); i++){
            nums[turnToPlayer(turn).get(i).getRank() - 1]++;
        }
        for (int i = 0; i < 13; i++){
            if (nums[i] == 4){
                for (int j = 0; j < turnToPlayer(turn).size(); j++){
                    if (turnToPlayer(turn).get(j).getRank() == i){
                        pile.add(turnToPlayer(turn).remove(j));
                        if (turn == 1)
                            score1++;
                        if (turn == 2)
                            score2++;
                        if (turn == 3)
                            score3++;
                        if (turn == 4)
                            score4++;
                    }
                }
            }
        }
            if (turn < numPlayers)
            turn++;
        else
            turn = 1;
    }
    
    public static boolean check(int num, int rank, ArrayList<Card> player){
        int count = 0;
        for (int i = 0; i < turnToPlayer(num).size(); i++){
            if (turnToPlayer(num).get(i).getRank() == rank){
                player.add(turnToPlayer(num).remove(i));
                count++;
            }
        }
        
        if (count == 0)
            return false;
        else
            return true;
    }
    
    public static ArrayList<Card> turnToPlayer(int turn){
        if (turn == 1)
            return human;
        if (turn == 2)
            return com1;
        if (turn == 3)
            return com2;
        if (turn == 4)
            return com3;
        return pile;
    }
    
    public static void congratulate(){
        
    }
}