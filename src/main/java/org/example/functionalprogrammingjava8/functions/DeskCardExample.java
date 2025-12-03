package org.example.functionalprogrammingjava8.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class DeskCardExample {

    public static void main(String[] args) {
        final String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        final String[] suites = {"Hearts", "Clubs", "Spades", "Diamonds"};

        BiFunction<String, String, DeskCards> createdCard = new BiFunction<String, String, DeskCards>() {
            @Override
            public DeskCards apply(final String s, final String s2) {
                return new DeskCards(s, s2);
            }
        };

        List<DeskCards> deskCardsList = new ArrayList<>();

        for (int i = 0; i < faces.length; ++i) {
            for (int j = 0; j < suites.length; j++) {
                deskCardsList.add(createdCard.apply(faces[i], suites[j]));
            }
        }

        for (DeskCards deskCards : deskCardsList) {
            System.out.println(deskCards);
        }
    }
}
