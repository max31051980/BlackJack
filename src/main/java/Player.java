public class Player {
    private int valueCount;
    private int cardCount;
    Card[] deckArray = new Card[52];
    private int sum;

    public void addCard(Card a) {
        deckArray[cardCount] = a;
        cardCount++;
    }

    public int getCardCount() {
        return cardCount;
    }

    public Card getCard(int a) {
        return deckArray[a];
    }

    public int getCardValue(int a) {
        valueCount = deckArray[a].valueOf();
        return valueCount;
    }

    public void getValue(int a) {
        for(int i = 0; i < deckArray.length; i++) {
            sum += valueCount;
        }
    }
}
