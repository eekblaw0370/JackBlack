//Joe Adcock
//Period 3
//Running a game of chess

import java.util.Scanner;

public class PlayChess
{
    private static ChessBoard chessboard = new ChessBoard();
    public static void main(String [] args)
    {
        ChessBoard.printBoard(chessboard);
        askMove();
    }
    
    public static void askMove()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your move: ");
        String move = reader.nextLine();
        String start = move.substring(0, move.indexOf(" "));
        String end = move.substring(move.indexOf(" ") + 1);
        Chess.move(start, end, chessboard);
    }
}