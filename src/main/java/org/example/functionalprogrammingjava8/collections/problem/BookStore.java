package org.example.functionalprogrammingjava8.collections.problem;

import java.util.HashMap;
import java.util.Map;

public class BookStore {
    public static void main(String[] args) {


        Map<String, Book> bookMap = new HashMap<>();

        // --- Initial Database ---
        bookMap.put("Moby-Dick", new Book("Herman Melville", 19.99, 25));
        bookMap.put("The Zen of Java Programming", new Book("Java J. Guru", 15.99, 5));
        bookMap.put("Frankenstein", new Book("Mary Shelley", 12.99, 10));

        // computeIfPresent + return null ⇒ supprime l’entrée
        bookMap.computeIfPresent("Frankenstein", (title, book) -> null);

        // --- 2. Ajouter Dracula --
        bookMap.merge("Dracula", new Book(" Bram Stoker", 14.99, 13), (oldValue, newValue) -> newValue);  // overwrite si déjà présent

        // --- 3. Changer le prix de "The Zen of Java Programming" ---
        bookMap.computeIfPresent("The Zen of Java Programming", (oldValue, newValue) -> {
            newValue.setPrice(13.99);

            return newValue;
        });

        // --- 4. Changer le stock de Moby-Dick ---
        bookMap.computeIfPresent("Moby-Dick", (oldValue, newValue) -> {

            newValue.setNumberOfCopies(24);
            return newValue;
        });

        bookMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
