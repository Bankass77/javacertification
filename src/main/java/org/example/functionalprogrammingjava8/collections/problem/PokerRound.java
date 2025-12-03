package org.example.functionalprogrammingjava8.collections.problem;

import java.util.List;

public class PokerRound {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand();

        // Première Pioche: 5 cartes uniques

        while (hand.getCards().size() < 5) {
            hand.addUniqueCard(deck);
        }

        System.out.println("Initial hand: " + hand.getCards());

        // On retire les cartes  <=10 (max 3)
        List<Card> toRemove = hand.getCards().stream().filter(c -> c.getRank().value <= 10).limit(3).toList();

        hand.getCards().removeAll(toRemove);
        // On remplace les cartes retirées

        while (hand.getCards().size() < 5) {
            hand.addUniqueCard(deck);

        }

        System.out.println("Final Hand: " + hand.getCards());

        // Déterminer le gagnant
        boolean win = HandEvaluator.isFlush(hand.getCards()) || HandEvaluator.isFullHouse(hand.getCards()) || HandEvaluator.isStraight(hand.getCards());
        System.out.println(win ? "Player wins!" : " Dealer wins.");
    }
}
