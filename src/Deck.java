import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        build();
    }

    private void build() {
        String[] palocolores = {"trebol negro", "corazon rojo", "pica negra", "diamante rojo"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "As", "J", "Q", "K"};

        for (String palocolor : palocolores) {
            for (String valor : valores) {
                Card card = new Card(palocolor, valor);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void pick() {
        if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card);
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No quedan cartas en el deck.");
        }
    }

    public void hand() {
        if (cards.size() >= 5) {
            List<Card> hand = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                hand.add(card);
            }

            for (Card card : hand) {
                System.out.println(card);
            }

            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }
}