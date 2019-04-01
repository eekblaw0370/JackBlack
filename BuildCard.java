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
    public String displayRank(Card crd)
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
    public String displaySuit(Card crd)
    {
        if (crd.getSuit().equals(1))
            return "♣";
        else if (crd.getSuit().equals(2))
            return "♦";
        else if (crd.getSuit().equals(3))
            return "♥";
        else
            return "♠";
    }
    
    //displays an entire card
    public String printCard(Card crd)
    {
        String str = "┌───┐ \n │" +  displaySuit(crd) + "   " + displaySuit(crd) + "| \n │  " + displayRank(crd) + "  │ \n │" + displaySuit(crd) + "    " + displaySuit(crd) + "| \n └───┘";
        return str;
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