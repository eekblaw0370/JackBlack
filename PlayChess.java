//Joe Adcock
//Period 3
//Running a game of chess

import java.util.Scanner;

public class PlayChess
{
    private static ChessBoard chessboard = new ChessBoard();
    private static int gameMode;
    private static int turn = 1;
    private static boolean done = false;
    public static void main(String [] args)
    {
        printRules();
        determineGameMode();
        ChessBoard.printBoard(chessboard);
        while (done == false){
            askMove();
        }
        congratulate();
    }
    
    public static void printRules()
    {
        System.out.println("Diamonds & Hearts: Player 1 (white)");
        System.out.println("Clubs & Spades: Player 2 (black)");
        System.out.println("Diamonds & Clubs 1-8: pawns");
        System.out.println("Heart/Spade K: king");
        System.out.println("Heart/Spade Q: queen");
        System.out.println("Heart/Spade A-2: bishops");
        System.out.println("Heart/Spade 3-4: knights");
        System.out.println("Heart/Spade 5-6: rooks");
        System.out.println("Enter moves in the format [a1 h8]");
    }
    
    public static void determineGameMode()
    {
        System.out.println("One player game or Two player game? (enter \"1\" or \"2\")");
        Scanner reader = new Scanner(System.in);
        gameMode = reader.nextInt();
    }
    
    public static void askMove()
    {
        Scanner reader = new Scanner(System.in);
        boolean moved = false;
        while (moved == false){
            System.out.println("Enter your move: ");
            String move = reader.nextLine();
            String start = move.substring(0, move.indexOf(" "));
            String end = move.substring(move.indexOf(" ") + 1);
            if (Chess.checkMove(start, end) == true){
                Chess.move(start, end, chessboard);
                moved = true;
            }else
                System.out.println("Invalid move.");
        }
    }
    
    public static void congratulate()
    {
        
    }
}