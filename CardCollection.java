import java.util.ArrayList;
import java.util.Random;

/**
 * A collection of playing cards.
 */
public class CardCollection {

  private String label;
  private ArrayList<Cards> cards;

  /**
   * Constructs an empty collection.
   */
  public CardCollection(String label) {
    this.label = label;
    this.cards = new ArrayList<Cards>();
  }

  /**
   * Returns the label of the card collection.
   */
  public String getLabel() {
    return label;
  }

  /**
   * Returns the card with the given index.
   */
  public Cards getCard(int i) {
    return cards.get(i);
  }

  /**
   * Adds the given card to the collection.
   */
  public void addCard(Cards card) {
    cards.add(card);
  }

  /**
   * Removes and returns the card with the given index.
   */
  public Cards popCard(int i) {
    return cards.remove(i);
  }

  /**
   * Removes and returns the last card.
   */
  public Cards popCard() {
    int i = size() - 1;
    return popCard(i);
  }

  /**
   * Returns the number of cards.
   */
  public int size() {
    return cards.size();
  }

  /**
   * True if the collection is empty, false otherwise.
   */
  public boolean empty() {
    return cards.size() == 0;
  }

  /**
   * Moves n cards from this collection to the given collection.
   */
  public void deal(CardCollection that, int n) {
    for (int i = 0; i < n; i++) {
      Cards card = popCard();
      that.addCard(card);
    }
  }

  /**
   * Moves all remaining cards to the given collection.
   */
  public void dealAll(CardCollection that) {
    int n = size();
    deal(that, n);
  }


  /**
   * Returns the last card.
   */
  public Cards last() {
    int i = size() - 1;
    return cards.get(i);
  }

  /**
   * Swaps the cards at indexes i and j.
   */
  public void swapCards(int i, int j) {
    Cards temp = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, temp);
  }

  /**
   * Randomly permute the cards.
   */
  public void shuffle() {
    Random random = new Random();
    for (int i = size() - 1; i > 0; i--) {
      int j = random.nextInt(i);
      swapCards(i, j);
    }
  }

  /**
   * Returns a string representation of the card collection.
   */
  public String toString() {
    return label + ": " + cards.toString();
  }

  /**
   * Prints the label and cards.
   */
  public void display() {
    System.out.println(label + ": ");
    for (Cards card: cards) {
      System.out.println(card);
    }
    System.out.println();
  }

}

