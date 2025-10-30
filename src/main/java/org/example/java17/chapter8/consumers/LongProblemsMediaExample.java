package org.example.java17.chapter8.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Your entertainment collection consists of the following:
 * –– DVDs organized by title, production company, and memory size in
 * megabytes
 * –– Audio files organized by title, format, and memory size in megabytes
 * –– E-books organized by title, number of pages, and memory size in
 * megabytes
 * Use a chain of consumers to generate a list of all the titles in
 * your collection and another list of all the memory sizes in your
 * collection.
 */
public class LongProblemsMediaExample {
    public static void main(String[] args) {

        List<Object> media = List.of(new DVD("Matrix", "WB", 4700), new Audio("Image", "mp3", 5), new Ebook("Dune", 800, 2000));

        // Liste des titres
        List<String> titles = new ArrayList<>();

        // Liste des tailles mémoires:
        List<Integer> memoiresSize = new ArrayList<>();

        Consumer<Object> pipeline = ((Consumer<Object>) o -> {
            String title = null;
            int size = 0;
            if (o instanceof DVD d) {
                title = d.title;
                size = d.size;
            } else if (o instanceof Audio a) {
                title = a.title;
                size = a.size;

            } else if (o instanceof Ebook e) {

                title = e.title;
                size = e.size;
            }
            // On stocke dans un transporteur
            Transport.title = title;
            Transport.size = size;
        }).andThen(o -> titles.add(Transport.title))
                .andThen(o -> memoiresSize.add(Transport.size));

        for (Object o : media) {

            pipeline.accept(o);
            System.out.println(titles);
            System.out.println(memoiresSize);
        }
    }

    static class Transport {
        static String title;
        static int size;
    }
}
