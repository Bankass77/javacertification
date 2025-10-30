package org.example.java17.chapter8.shortProblems;

import java.util.List;

public class PokerTest {

    public static void main(String[] args) {
        PokerHand flushand = new PokerHand(List.of(
                new Card("2", "Hearts"),
                new Card("5", "Hearts"),
                new Card("7", "Hearts"),
                new Card("9", "Hearts"),
                new Card("King", "Hearts")

        ));

        PokerHand straightHard = new PokerHand(List.of(
                new Card("9", "Hearts"),
                new Card("10", "Clubs"),
                new Card("Jack", "Spades"),
                new Card("Queen", "Hearts"),
                new Card("King", "Diamonds")

        ));

        PokerHand fullHouseHand = new PokerHand(List.of(
                new Card("King", "Hearts"),
                new Card("King", "Clubs"),
                new Card("King", "Spades"),
                new Card("9", "Hearts"),
                new Card("9", "Diamonds")



        ));

        System.out.println("Flush: " + PokerPredicates.isFlush.test(flushand));
        System.out.println("Straight: " + PokerPredicates.isStraight.test(straightHard));
        System.out.println("Full House: " + PokerPredicates.isFullHome.test(fullHouseHand));
    }
}
