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
        if (crd.getRank() == 1)
            return "A";
        else if (crd.getRank() == 10)
            return "T";
        else if (crd.getRank() == 11)
            return "J";
        else if (crd.getRank() == 12)
            return "Q";
        else if (crd.getRank() == 13)
            return "K";
        else
            return Integer.toString(crd.getRank());
    }
    
    //displays the card's suit as a string
    public static String displaySuit(Card crd)
    {
        if (crd.getSuit().equals(Suit.club))
            return "♣";
        else if (crd.getSuit().equals(Suit.diamond))
            return "♦";
        else if (crd.getSuit().equals(Suit.heart))
            return "♥";
        else
            return "♠";
    }
    
    //displays an entire card
    public static void printCard(Card crd)
    {
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "┌───┐", "│♠   ♠|", "│  A  │", "│♠   ♠|", "└───┘");
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