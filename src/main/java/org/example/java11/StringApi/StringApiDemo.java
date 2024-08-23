package org.example.java11.StringApi;

public class StringApiDemo {
    public static void main(String[] args) {
        System.out.println("Stripping the string ==>");
        String originalString = "\u2001 \t BPB Publications \t \u2002 ";

        //Méthode strip() : Elle retourne une chaîne de caractères avec tous les espaces blancs en début et en fin de chaîne supprimés.
        // suppression des espaces blancs en début et en fin de chaîne

        // la méthode strip() considère lee\u2001 et \t comme des espaces blancs et les supprime
        System.out.println("Stripped String =" + originalString.strip());

        // la méthode trim() ne considère pas les \u2001 et \t comme des espaces blancs et ne les supprime pas
        System.out.println("Trimmed String =" + (originalString.trim()) + "\n");

        System.out.println("Suppression des espaces blancs en début et en fin de chaîne =>");
        // suppression des espaces blancs en début de chaîne
        // la méthode stripLeading agit comme strip() considère lee\u2001 et \t comme des espaces blancs et les supprime
        System.out.println("Suppression début =" + originalString.stripLeading());
        // suppression des espaces blancs en fin de chaîne
        // la méthode stripTrailing agit comme trim() ne considère pas les \u2001 et \t comme des espaces blancs et ne les supprime pas
        System.out.println("Suppression fin =" + originalString.stripTrailing() + "\n");

        System.out.println("Vérification de la chaîne vide =>");
        String blankString = "\u2001";
        //La méthode isBlank retourne true ou false lorsque la chaîne est vide ou non, ici le caractère u2001 est considéré comme un espace blanc,
        // selon les régles spécifiées dans la métode strip()
        System.out.println("La chaîne est-elle vide =" + blankString.isBlank() + "\n");

        System.out.println("Génération des lignes à partir de la chaîne avec lines() ==>");
        String text = "Ce livre contient des recettes pour Java.\nIl couvre les concepts de Java 9 à 18";

        //La méthode lines() va retourner des lignes à partir de chaînes de caractères données
        // la syntaxe de la méthode est public Stream<String> lines()
        // donc retourne un stream de lignes
        // La méthode lines() utilise le séparateur de ligne présent dans les chaînes de caractères données.
        // Le séparateur de ligne peut être l'un des suivants :
        // "\n" (U+000A), un caractère de saut de ligne
        // "\r" (U+000D), un caractère de retour chariot
        // "\r\n" (U+000D U+000A)

        text.lines().forEach((line) -> System.out.println(line));
        System.out.println("\n");

        System.out.println("Répétition de la chaîne avec repeat() ==>");
        String bookName = "Java 9+ Recettes!";
        System.out.println(bookName.repeat(5));

        //La méthode repeat(int count) lève une exception de type IllegalArgumentException si le nombre est négative
        System.out.println(bookName.repeat(-5));
    }
}
