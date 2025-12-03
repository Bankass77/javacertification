package org.example.functionalprogrammingjava8.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class DeskCardExample2 {
    public static void main(String[] args) {

        final String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        final String[] suites = {"Hearts", "Clubs", "Spades", "Diamonds"};

        BiFunction<String, String, DeskCards> createdCards = (face, suite) -> new DeskCards(face, suite);

        List<DeskCards> cards = new ArrayList<>();

        for (String face : faces) {

            for (String suite : suites) {
                cards.add(createdCards.apply(face, suite));
            }
        }
        cards.forEach(System.out::println);
        // Function chain: create -> flatMap -> map -> collect -> shuffle
        List<DeskCards> desk = Arrays.stream(suites) // On crée un flux à partir des 4 suites.
                .flatMap(suit -> Arrays.stream(faces) //.flatMap(...) :Pour chaque suite, on crée un sous-flux des 13 valeurs.
                        .map(face -> new DeskCards(face, suit)))  // map(face -> new Card(face, suit)): On crée les cartes avec la combinaison face + suit.
                .collect(Collectors.toList());

        // Shuffle the deck after creation
        Collections.shuffle(desk);

        desk.forEach(System.out::println);
    }
}
