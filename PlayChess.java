//Joe Adcock
//Period 3
//Running a game of chess

import java.util.Scanner;

public class PlayChess
{
    public static void main(String [] args)
    {
        ChessBoard board = new ChessBoard();
        ChessBoard.printBoard(board);
    }
    
    public static void askMove()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your move: ");
        String move = reader.nextLine();
        String start = move.substring(0, move.indexOf(" "));
        String end = move.substring(move.indexOf(" ") + 1);
    }
}