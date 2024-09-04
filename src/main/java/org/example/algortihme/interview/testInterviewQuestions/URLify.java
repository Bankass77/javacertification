package org.example.algortihme.interview.testInterviewQuestions;

public class URLify {

    private void replaceSpace(char[] str, int trueLenght) {
        int spaceCount = 0, index, i = 0;

        // Compter les espaces dans la partie "true" de la chaîne
        for (i = 0; i < trueLenght; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        // Calculer la nouvelle longueur avec les remplacements
        index = trueLenght + spaceCount * 2;

        // Remplir le tableau de caractères en partant de la fin
        for (i = trueLenght - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }

    }

    public static void main(String[] args) {
        URLify urlify = new URLify();
        String word = "MR John Smith    ";
        char [] wordArray = word.toCharArray();
        urlify.replaceSpace(wordArray, 13);

        // Convertir le tableau de caractères modifié en chaîne et l'afficher
        System.out.println(new String(wordArray));
    }
}
