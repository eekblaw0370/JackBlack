public class BuildCardTester
{
    public static void main(String [] args)
    {
        Card c1 = new Card(Suit.spade, 1);
        Card c2 = new Card(Suit.heart, 12);
        Card c3 = new Card(Suit.club, 10);
        Card c4 = new Card(Suit.diamond, 5);
        BuildCard.printCard(c1);
        BuildCard.printCard(c2);
        BuildCard.printCard(c3);
        BuildCard.printCard(c4);
    }
} 
