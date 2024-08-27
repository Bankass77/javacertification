package org.example.algortihme.interview.testInterviewQuestions;

public class Solution {
    public static void main(String[] args) {
        boolean b = true;
        boolean c = b ? !b : b;
        /**
         * Pour l'expression boolean c = b ? !b : b;, analysons comment la valeur de c est déterminée :
         *
         * L'expression b ? !b : b est un opérateur conditionnel ternaire. Il évalue la condition b.
         * Si b est true (vrai), alors !b (qui est false, faux) est attribué à c.
         * Si b est false (faux), alors b (qui est false, faux) est attribué à c.
         * Donc :
         *
         * Si b est true, alors c devient false.
         * Si b est false, alors c reste false.
         * Dans tous les cas, la valeur de c sera toujours false, quel que soit la valeur de b.
         *
         * Donc, la valeur de c est toujours false.
         */
        System.out.println(c);

    }
}
