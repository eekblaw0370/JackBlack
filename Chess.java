//Joe Adcock
//Period 3
//Chess-related methods

public class Chess
{
    public static boolean checkMove(String pos1, String pos2, ChessBoard brd, int turn)
    {
        Card[][] board = ChessBoard.getBoard(brd);
        Card card1 = new Card((ChessBoard.getCard(board, getY(pos1), getX(pos1))).getSuit(), (ChessBoard.getCard(board, getY(pos1), getX(pos1))).getRank());
        Card card2 = new Card((ChessBoard.getCard(board, getY(pos2), getX(pos2))).getSuit(), (ChessBoard.getCard(board, getY(pos2), getX(pos2))).getRank());
        if (card1.isRed() == card2.isRed())
            return false;
        if (card1.getSuit().equals(Suit.diamond)){
            if (turn == 2)
                return false;
            else{
                if (getY(pos1) == 7 && (getY(pos2) == 5 || getY(pos2) == 6) && (getX(pos1) == getX(pos2)))
                    return true;
                else if (getY(pos2) == getY(pos1) - 1 && (getX(pos2) == getX(pos1) + 1 || getX(pos2) == getX(pos1) - 1) && card2.getSuit().equals(Suit.spade) || card2.getSuit().equals(Suit.club))
                    return true;
                else
                    return false;
            }
        }else if (card1.getSuit().equals(Suit.heart)){
            if (turn == 2)
                return false;
            else{
  
            }
        }else if (card1.getSuit().equals(Suit.club)){
            if (turn == 1)
                return false;
            else{
                
            }
        }else if (card1.getSuit().equals(Suit.spade)){
            if (turn == 1)
                return false;
            else{
                
            }
        }
            
        return true;
    }
    
    public static void move(String pos1, String pos2, ChessBoard brd)
    {
        Card[][] board = ChessBoard.getBoard(brd);
        Card temp = new Card((ChessBoard.getCard(board, getY(pos1), getX(pos1))).getSuit(), (ChessBoard.getCard(board, getY(pos1), getX(pos1))).getRank());
 
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