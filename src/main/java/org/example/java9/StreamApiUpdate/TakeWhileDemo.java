package org.example.java9.StreamApiUpdate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Si vous souhaitez interrompre les itérations des éléments d'un flux (stream) à partir de la première occurrence où la condition échoue, vous pouvez utiliser
 * la méthode takeWhile(). La méthode takeWhile() prend un prédicat comme argument, et l'itération est terminée lorsque la condition de test échoue pour un
 * élément particulier. takeWhile() est utilisé pour prendre des éléments tant qu'une condition est vraie, tandis que limit() prend un nombre fixe d'éléments
 */
public class TakeWhileDemo {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Denim Jeans", "Garment", 1500.00),
                new Product("T shirt", "Garment", 500.00),
                new Product("Nike", "Sports", 400.00),
                new Product("Kurtis", "Garment", 150.00));

        System.out.println("-----Utilisation de la méthode takeWhile sur le stream----------------");
        // le filter n'a pas le même comportement que le takeWhile, puis que ce dernier prend un predicateur en argument
        // et retourne les premiers élements en fonction du prédicat sans parcourir tous le stream, contrairement au filter
        products.stream().takeWhile(e -> e.getProductCategory().equals("Garment")).forEach(System.out::println);

        System.out.println("-----Utilisation de la méthode filter sur le stream----------------");
        // le filter et le takeWhile n'ont pas le même comportement si on parcours une collection non ordonée telsque le Set par exemple: avec le filter on retourne tous les éléments qui satisfaient le prédicate.
        products.stream().filter(p -> p.getProductCategory().equals("Garment")).forEach(System.out::println);

        System.out.println(
                "-----Utilisation de la méthode takeWhile sur une collection non-ordonnée: l'orde de sortie des éléments n'est pas garanti----------------");
        // Parcours d'un Set par la méthode takeWhile
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().takeWhile(n -> n < 10).forEach(System.out::println);
    }
}
