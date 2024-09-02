package org.example.algortihme.interview.testInterviewQuestions;

/**
 * La méthode reshape(n, string) retourne la chaîne str sans les espaces et formatée en ligne de n caractèrez maximum. Ecri le corps de la méthode reshape(n, string)
 */
public class StringFormatter {
    public static String reshape(int n, String str) {
        // Suppression de tous les espaces de la chaîne
        String noSpaces = str.replace(" ", "");

        // Utilisation de StringBuilder pour créer la nouvelle chaîne formatée
        StringBuilder reshapedString = new StringBuilder();

        // Parcours de la chaîne sans espaces
        for (int i = 0; i < noSpaces.length(); i++) {
            // Ajout du caractère courant au StringBuilder
            reshapedString.append(noSpaces.charAt(i));

            // Ajouter un saut de ligne après chaque n caractères, sauf après le dernier caractère
            if ((i + 1) % n == 0 && (i + 1) < noSpaces.length()) {
                reshapedString.append("\n");
            }
        }

        return reshapedString.toString();
    }

    public static void main(String[] args) {
        // Exemples d'utilisation
        String input = "Hello World Example Text";
        System.out.println(reshape(5, input));

        String input2 = "This is a test string for reshaping";
        System.out.println(reshape(10, input2));
    }
}
