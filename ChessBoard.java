//Joe Adcock
//Period 3
//Handling the board for a chess game

public class ChessBoard
{
    Card[][] board = new Card[8][8];
    public ChessBoard()
    {
        board[0][0] = new Card(Suit.club, 5);
        board[0][1] = new Card(Suit.club, 3);
        board[0][2] = new Card(Suit.club, 1);
        board[0][3] = new Card(Suit.club, 12);
        board[0][4] = new Card(Suit.club, 13);
        board[0][5] = new Card(Suit.club, 2);
        board[0][6] = new Card(Suit.club, 4);
        board[0][7] = new Card(Suit.club, 6);
        for (int i = 1; i <= 8; i++){
            board[1][i] = new Card(Suit.spade, i);
        }
        for (int j = 2; j <= 5; j++){
            for (int i = 1; i <= 8; i++){
                board[j][i] = new Card(Suit.empty, 0);
            }
        }
        for (int i = 1; i <= 8; i++){
            board[6][i] = new Card(Suit.diamond, i);
        }
        board[7][0] = new Card(Suit.heart, 5);
        board[7][1] = new Card(Suit.heart, 3);
        board[7][2] = new Card(Suit.heart, 1);
        board[7][3] = new Card(Suit.heart, 12);
        board[7][4] = new Card(Suit.heart, 13);
        board[7][5] = new Card(Suit.heart, 2);
        board[7][6] = new Card(Suit.heart, 4);
        board[7][7] = new Card(Suit.heart, 6);
    }
} 

/*
            Piece Key
    Diamonds & Hearts (red): Player 1 (white)
    Spades & Clubs (black): Player 2 (black)
    Diamonds & Spades 1-8: pawns
    Heart/Club 13: king
    Heart/Club 12: queen
    Heart/Club 1-2: bishops
    Heart/Club 3-4: knights
    Heart/Club 5-6: rooks
 */ 