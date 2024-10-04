package org.example.algortihme.string;

public class Palindrom {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;  // Une chaîne vide peut être considérée comme un palindrome
        }

        // On utilise 2 pointeurs:left et right : Ces index partent respectivement du début et de la fin de la chaîne.
        //Les deux avancent vers le centre, en comparant les caractères.
        //Pour gérer les caractères non alphabétiques ou les espaces, tu peux ignorer ces caractères lors de la comparaison.
        int left = 0, right = s.length() - 1;
        while (left < right) {
            //ignorer les caractères non-alphanumériques
            //J'utilise les méthodes Character.isLetterOrDigit pour ignorer les espaces et les symboles.
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }

            //Comparer les caractères en ignant la casse:  Character.toLowerCase pour ignorer la casse
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // ce n'est pas un palindrome
            }
            // On increment left, et on décremente right
            left++;
            right--;
        }
        return true; // si toutes le comparaisons réussissent, c'est un palindrome
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal, Panama!";
        String s1 = "race a car";
        String s2 = "racecar";
        Palindrom p = new Palindrom();
        System.out.println(p.isPalindrome(s));
        System.out.println(p.isPalindrome(s1));
        System.out.println(p.isPalindrome(s2));
    }
}
