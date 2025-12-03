package org.example.functionalprogrammingjava8.supplier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Supplier;

import org.example.functionalprogrammingjava8.consumers.Audio;
import org.example.functionalprogrammingjava8.consumers.DVD;
import org.example.functionalprogrammingjava8.consumers.Ebook;

public class MediaSupplier {

    public static void main(String[] args) throws FileNotFoundException {

        String file ="entertainmentCollection.txt";

        InputStream inputStream= MediaSupplier.class.getClassLoader().getResourceAsStream(file);

        if (inputStream ==null){
            System.out.println("Fichier introuvable dans resources !");
            return;
        }
        try (BufferedReader reader = new BufferedReader( new InputStreamReader(inputStream))) {
            Supplier<Object> supplier = () -> {

                try {
                    String lines = reader.readLine();

                    if (lines == null) {
                        return null;
                    }

                    String[] fields = lines.split(",");

                    return switch (fields[0]) {
                        case "DVD" -> new DVD(fields[1], fields[2], Integer.parseInt(fields[3]));
                        case "AUD" -> new Audio(fields[1], fields[2], Integer.parseInt(fields[3]));
                        case "EBK" -> new Ebook(fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]));
                        default -> null;
                    };

                } catch (IOException e) {
                    System.err.println("Erreur de lecture : " + e.getMessage());
                    return null;
                }
            };

            // Boucle jusqu' à ce que le supplier retourne null;
            Object object;
            while ((object = supplier.get()) != null) {
                System.out.println(object);
            }
        } catch (IOException e) {
            System.out.println(" Erreur d'ouverture du fichier : " + e.getMessage());
        }
    }
}
