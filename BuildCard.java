//Joe Adcock
//Period 3
//Building a visual representation of a playing card for user purposes

public class BuildCard
{
    private Card card;
    
    //creates a Card object
    public BuildCard(Card crd)
    {
        this.card = crd;
    }
    
    //displays the card's rank as a string
    public static String displayRank(Card crd)
    {
        if (crd.getSuit().equals(Suit.black) || crd.getSuit().equals(Suit.white)){
            if (crd.getRank() == 2)
                return "P";
            else if (crd.getRank() == 4)
                return "B";
            else if (crd.getRank() == 6)
                return "N";
            else if (crd.getRank() == 8)
                return "R";
            else if (crd.getRank() == 12)
                return "Q";
            else if (crd.getRank() == 13)
                return "K";
            else
                return Integer.toString(crd.getRank());
        }
        else if (crd.getRank() == 1)
            return "A";
        else if (crd.getRank() == 10)
            return "T";
        else if (crd.getRank() == 11)
            return "J";
        else if (crd.getRank() == 12)
            return "Q";
        else if (crd.getRank() == 13)
            return "K";
        else if (crd.getRank() == 0)
            return " ";
        else
            return Integer.toString(crd.getRank());
    }
    
    //displays the card's suit as a string
    public static String displaySuit(Card crd)
    {
        if (crd.getSuit().equals(Suit.club))
            return "C";
        else if (crd.getSuit().equals(Suit.diamond))
            return "D";
        else if (crd.getSuit().equals(Suit.heart))
            return "H";
        else if (crd.getSuit().equals(Suit.spade))
            return "S";
        else if (crd.getSuit().equals(Suit.empty))
            return " ";
        else if (crd.getSuit().equals(Suit.white))
            return "W";
        else
            return "B";
    }
    
    //displays an entire card
    public static void printCard(Card crd)
    {
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "┌───┐", "│" + displaySuit(crd) + "   " + displaySuit(crd) + "│", "│  " + displayRank(crd) + "  │", "│" + displaySuit(crd) + "   " + displaySuit(crd) + "│", "└───┘");
    }
}

//template:

/* 
        ┌───┐
        │♠   ♠|
        │  A  │
        │♠   ♠|
        └───┘
*/ 