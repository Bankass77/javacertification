package org.example.algortihme.interview.datastructures.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
Trouver tous les nombres à n chiffres avec une somme égale de chiffres aux indices pairs et impairs, où n varie de 2 à 9.
Par exemple,

3–digit numbers with an equal sum of digits at even and odd indices

110 121 132 143 154 165 176 187 198 220 231 242 253 264 275 286 297 330 341 352 363 374 385 396 440 451 462 473 484 495
550 561 572 583 594 660 671 682 693 770 781 792 880 891 990

5–digit numbers with an equal sum of digits at even and odd indices

10010 10021 10032 10043 10054 10065 10076 10087 10098 10120 10131 10142 10153 10164 10175 10186 10197 10230 10241 10252
10263 10274 10285 10296 10340 10351 10362 10373 10384 10395 10450 10461 10472 10483 10494 10560 10571 10582 10593 10670
10681 10692 10780 10791 10890 11000 11011 11022 11033 11044 11055 11066 11077 11088 11099 11110 11121 11132 11143 11154
11165 11176 11187 11198 11220
 */
public class EqualSumDigitsSolution {

    /**
     * @param n le nombre qui permet de générer des chiffres
     * @return vraie si la sommes des chiffres aux indices paires est égale au chiffre en indice impaire dans un nombre
     */
    public boolean sumIndicePairEqualIndiceImpaire(int n) {

        String numStr = String.valueOf(n);
        int sumIndicePair = 0;
        int sumIndiceImpaire = 0;
        //on parcourt les chiffres du nombre, exemple pour n =3 le nombre 110 : chiffre à l'indice pair sont 1 et 0 et à
        // l'indice impair est 1, 1+0 = 1, donc 110 est vrai
        for (int i = 0; i < numStr.length(); i++) {
            // Convertir le caractère en chiffre
            // Ajouter à la somme des indices pairs ou impairs
            int digit = numStr.charAt(i) - '0';
            if (i % 2 == 0) {
                sumIndicePair += digit;
            } else {
                sumIndiceImpaire += digit;
            }
        }

        // Vérifier si les deux sommes sont égales
        return sumIndicePair == sumIndiceImpaire;
    }

    /**
     * Méthode pour générer et afficher tous les nombres de n chiffres avec des sommes égales
     *
     * @param n nombres de n chiffres avec des sommes egales
     */
    public void equalSumDigits(int n) {
        //premier nombre à n chiffres, exemple si n=2 , le premier nombre est 10
        int start = (int) Math.pow(10, n - 1);

        //Le dernier nombre à n chiffres, si n=2, le dernier nombre est 99
        int end = (int) (Math.pow(10, n) - 1);
        List<Integer> nombreValides = new ArrayList<>();
        for (int number = start; number <= end; number++) {
            if (sumIndicePairEqualIndiceImpaire(number)) {
                nombreValides.add(number);
            }
        }
        //afficher les nombres trouvés
        System.out.println("Nombre à n " + n + " chiffres avec sommes égale aux indices pairs et impairs");
        System.out.println(nombreValides);
    }

    public static void main(String[] args) {
        EqualSumDigitsSolution solution = new EqualSumDigitsSolution();
        // Trouver tous les nombres à n chiffres où n varie de 2 à 9
        for (int n = 2; n <= 9; n++) {
           solution.equalSumDigits(n);
        }
    }
}
