package org.example.java17.chapter8;

import java.util.ArrayList;

public class TraditionalSearch {

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("Kangoroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));

        print(animals, new CheckIfHop()); // peut être remplacer par l'expression lambda
        //print(animals, a ->  a.canHop());
        //print(animals, a ->  !a.canHop());
    }

    private static void print(final ArrayList<Animal> animals, final CheckIfHop checkIfHop) {
        for (Animal animal : animals) {
            if (checkIfHop.test(animal)) {
                System.out.println(animal + " ");
            }
            System.out.println();
        }
    }
}
