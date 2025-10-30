package org.example.java17.innnerClass;

import org.example.java8.interfaces.Climb;

public class Gorilla {
    interface  Cimb{}

    Climb climb= new Climb() {
        @Override
        public Number getSpeed(final int age) {
            return null;
        }
    };  // ici on instantie une classe anonyme qui implement l'interface , c'est la présence de {} après new Climb()  qui le prouve
}
