package org.example.functionalprogrammingjava8.collections.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ça pioche
public class Deck {

    private final List<Card> cards = new ArrayList<>();
    private int index = 0;

    //Deck : un paquet mélangé qui permet de piocher
    public Deck() {

        for (Suit suit : Suit.values()) {

            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }

    Card draw() {
        return cards.get(index++);
    }
}
