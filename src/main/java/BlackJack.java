public class BlackJack {
    public static void main(String[] args) {
        Deck a = new Deck();
        System.out.println(a.toString());
        while(a.hasNextCard()){
            System.out.println(a.nextCard());
        }
        a.shuffle();
        System.out.println(a.toString());
        int counter = 0;
        while(a.hasNextCard()){
            System.out.println(a.nextCard());
        }
    }
}