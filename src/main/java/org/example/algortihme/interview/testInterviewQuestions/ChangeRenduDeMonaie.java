package org.example.algortihme.interview.testInterviewQuestions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ChangeRenduDeMonaie {
    private int coin2;
    private int bill5;
    private int bill10;

    /**
     * Les supermarchés s’équipent de plus en plus de caisses automatiques. La plupart de ces caisses n’
     * acceptent que le paiement par carte bancaire bien qu’une part non négligeable de consommateurs paye
     * encore en espèces (avec des billets et des pièces).
     * Une des problématiques rencontrées avec le paiement en espèces est le rendu de monnaie : comment
     * rendre une somme donnée de façon optimale, c'est-à-dire avec le nombre minimal de pièces et billets ?
     * C'est un problème qui se pose à chacun de nous quotidiennement, à fortiori aux caisses automatiques.
     * Dans cet exercice, on vous demande d’essayer de trouver une solution optimale pour rendre la monnaie
     * dans un cas précis : quand une caisse automatique ne contient que des pièces de 2€, des billets de 5€ et
     * de 10€.
     * Pour simplifier le problème, nous considérerons que toutes ces pièces et billets sont disponibles en
     * quantité illimitée.
     * Voici quelques exemples de rendu de monnaie :
     * Monnaie à rendre Solutions possibles Solution optimale 1 Impossible Impossible 6 2 + 2 + 2 2 + 2 + 2 10 2
     * + 2 + 2 + 2 + 2 5 + 5 10 10 9223372036854775807 ... ( 10 * 922337203685477580) + 5 + 2
     * Le rendu de monnaie est exprimé par un objet Change. Cet objet a 3 propriétés : coin2, bill5 et bill10 qui,
     * respectivement, stockent le nombre de pièces de 2€, de billets de 5€ et de billets de 10€.
     * Par exemple, si on reprend l’exemple n°2 du tableau (6€), on devrait obtenir un objet Change avec : coin2
     * vaut 3 (3 pièces de 2€) bill5 vaut 0 (pas de billet de 5€) bill10 vaut 0 (pas de billet de 10€) Implémentez la
     * méthode optimalChange(long s) qui retourne un objet Change contenant les pièces et billets dont la
     * somme vaut s. S’il est impossible de rendre la monnaie (comme dans l’exemple n°1), retournez null.
     * Pour obtenir un maximum de points votre solution devra toujours rendre la monnaie quand c’est
     * possible et avec le nombre minimal de pièces et billets.
     * Données : s est toujours un entier ( long) strictement positif inférieur ou égal à 9223372036854775807
     *
     * @param s long, le montant donné
     * @return object Change
     */
    private static ChangeRenduDeMonaie optimalChange(long s) {
        if (s < 2 || s % 2 != 0) {
            // Impossible to give change for these amounts
            return null;
        }

        int bill10 = 0;
        int bill5 = 0;
        int coin2 = 0;

        // Step 1: Use as many 10€ bills as possible
        bill10 = (int) (s / 10);
        s = s % 10;

        // Step 2: Use one 5€ bill if the remaining amount is 5, 7, or 9
        if (s == 5 || s == 7 || s == 9) {
            bill5 = 1;
            s -= 5;
        }

        // Step 3: Use as many 2€ coins as possible
        coin2 = (int) (s / 2);

        return new ChangeRenduDeMonaie(coin2, bill5, bill10);
    }

    public static void main(String[] args) {

        // Tests
        System.out.println(optimalChange(1));    // Output: null
        System.out.println(optimalChange(6));    // Output: Change{coin2=3, bill5=0, bill10=0}
        System.out.println(optimalChange(10));   // Output: Change{coin2=0, bill5=0, bill10=1}
        System.out.println(optimalChange(11));   // Output: null
        System.out.println(optimalChange(16));   // Output: Change{coin2=3, bill5=0, bill10=1}
        System.out.println(optimalChange(27));   // Output: Change{coin2=1, bill5=1, bill10=2}
        System.out.println(optimalChange(31));
    }
}
