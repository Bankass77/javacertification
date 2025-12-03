package org.example.functionalprogrammingjava8.supplier;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierCreateDictionary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        Supplier<String> wordSupplier = () -> {
            System.out.println("Ecris un Mot dans le dictionnaire");
            return scanner.nextLine();
        };

        Supplier<String> definitionSupplier = () -> {
            System.out.println("Entrez  la definition du mot");
            return scanner.nextLine();
        };

        Supplier<Boolean> quitSupplier = () -> {
            System.out.println(" Avez-vous terminé ? (Y or N) :");
            return scanner.nextLine().charAt(0) == 'Y';
        };

        do {

            String word = wordSupplier.get();
            if (dictionary.containsValue(word)) {
                System.out.println("Erreur : ce mot existe déjà!");
                continue;// On redemande un mot
            }

            String definition = definitionSupplier.get();

            dictionary.put(word, definition);

            if (quitSupplier.get()) {
                break;
            }

        } while (true);
        // afficahge du dictionnaire

        System.out.println("\n Dictionnaire généré :");
        dictionary.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
