public class Card {
    private int suit;
    private int rank;
    private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int valueOf() {
        if (this.rank == 0) {
            return 11;
        }
        if (this.rank < 10) {
            return rank + 1;
        }
        if (this.rank >= 10) {
            return 10;
        } else {
            return 0;
        }
    }

    public String toString() {
        return ranks[this.rank] + " of " + suits[this.suit];
    }
}