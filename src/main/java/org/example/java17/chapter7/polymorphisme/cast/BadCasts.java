package org.example.java17.chapter7.polymorphisme.cast;

public class BadCasts {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Dog badWolf = (Dog)wolf;  // Cast invalid vers Dog, ensuite Dog et canine n'ont aucune relation entre elle// Le code compile mais vas lévé une exception de type ClassCastException au moment du runtime

      // si la classe Wolf est marqué final, le code ne compile pas
    }
}
