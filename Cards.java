public class Cards {

    public static final String[] RANKS = {
            null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King"};
    public static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"};

    private int rank;
    private int suit;

    public Cards(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }  

    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit]; 
    }

    public boolean equals(Cards that) {
        return rank == that.rank
        && suit == that.suit;
    }

    /**
     * Compares Card values when Aces are Low and the suit value dominates.
     * @param that Card to be compared
     * @return -1 if lower value, 1 otherwise.
     */
    public int compareValueALSD(Cards that) {
        if (suit < that.suit) {
            return -1;
        }
        if (suit > that.suit) {
            return 1;
        }
        if (rank < that.rank) {
            return -1;
        }
        if (rank > that.rank) {
            return 1;
        }
        return 0;
    }

    /**
     * Compares Card values when Aces are High and the suit value dominates.
     * @param that Card to be compared
     * @return -1 if lower value, 1 otherwise.
     */
    public int compareValueAHSD(Cards that) {
        if (suit < that.suit) {
            return -1;
        }
        if (suit > that.suit) {
            return 1;
        }
        if (this.rank == 1 && that.rank != 1) {
            return 1;
        }
        if (rank < that.rank) {
            return -1;
        }
        if (rank > that.rank) {
            return 1;
        }
        return 0;
    }

    /**
     * Prints a deck of cards.     
     */
    public static void printDeck(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
}

