package org.example.algortihme.interview.testInterviewQuestions;

public class AsciiArt {
    // Hypothèse: Cette méthode existe et renvoie une chaîne représentant le caractère en art ASCII.
    public static String printChar(char c) {
        // Implémentation fictive pour illustrer. En réalité, cette méthode
        // renvoie la représentation graphique ASCII du caractère c.
        return "";
    }
    public static char scanChar(String s) {
        // Parcours de tous les caractères possibles de A à Z
        for (char c = 'A'; c <= 'Z'; c++) {
            // Obtenez la représentation ASCII du caractère actuel
            String asciiRepresentation = AsciiArt.printChar(c);

            // Comparer avec la chaîne entrée s
            if (asciiRepresentation.equals(s)) {
                // Si ça correspond, retourner le caractère actuel
                return c;
            }
        }

        // Si aucune correspondance n'est trouvée, retourner '?'
        return '?';
    }

    public static void main(String[] args) {
        // Exemple d'utilisation:
        String asciiA = AsciiArt.printChar('A');
        System.out.println(scanChar(asciiA)); // Devrait retourner 'A'

        // Pour un exemple non correspondant
        String unknownAscii = "someInvalidAsciiArt";
        System.out.println(scanChar(unknownAscii)); // Devrait retourner '?'
    }
}
