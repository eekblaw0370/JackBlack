//Joe Adcock
//Period 3
//Creating a game of chess using cards

public class Chess
{
    public static void move(String pos1, String pos2, ChessBoard brd)
    {
        //System.out.println(pos1);
        //System.out.println(pos2);
        Card[][] board = ChessBoard.getBoard(brd);
        Card temp = new Card((ChessBoard.getCard(board, getY(pos1), getX(pos1))).getSuit(), (ChessBoard.getCard(board, getY(pos1), getX(pos1))).getRank());
        //System.out.println(getX(pos1));
        //System.out.println(getY(pos1));
        //System.out.println(temp);

        board[getY(pos1)][getX(pos1)] = board[getY(pos2)][getX(pos2)];
        board[getY(pos2)][getX(pos2)] = temp;
        System.out.println(board[getY(pos2)][getX(pos2)]);
        System.out.println(board[getY(pos1)][getX(pos1)]);
        ChessBoard.printBoard(brd);
    }
    
    public static int getX(String pos)
    {
        String x = pos.substring(0, 1);
        if (x.equals("a"))
            return 0;
        else if (x.equals("b"))
            return 1;
        else if (x.equals("c"))
            return 2;
        else if (x.equals("d"))
            return 3;
        else if (x.equals("e"))
            return 4;
        else if (x.equals("f"))
            return 5;
        else if (x.equals("g"))
            return 6;
        else
            return 7;
    }
    
    public static int getY(String pos)
    {
        String y = pos.substring(1);
        return (Integer.parseInt(y) - 1);
    }
} 