package org.example.functionalprogrammingjava8.collections.problem;

import java.util.HashSet;
import java.util.Set;

// Gère les cartes du joueur
public class Hand {

    private final Set<Card> cards = new HashSet<>();

    void addUniqueCard(Deck deck) {

        Card card;
        do {
            card = deck.draw();
        } while (cards.contains(card));

        cards.add(card);
    }

    public Set<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return cards.toString();
    }

}
