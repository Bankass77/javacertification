package org.example.java17.chapter8;

public interface Climb {   // est une interface fonctionnelle , déclare une seule méthode abstraite, malgré quelle contient une multide de méthodes
    void reach();

    default void fall() {
    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}
