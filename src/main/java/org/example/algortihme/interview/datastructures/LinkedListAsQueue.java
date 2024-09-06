package org.example.algortihme.interview.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

    public static void main(String[] args) {
        Queue<String> languages = new LinkedList<>();
        //ajout des élements
        languages.add("Java");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");
        System.out.println("Languages : " + languages);

        //Accéder et supprimer le premier élément avec poll() qui va retourner le premier , et le supprime de la liste chaînée
        String str1=languages.poll();
        System.out.println("Accès au premier élément avec la méthode poll(): "+ str1);
        System.out.println("Languages  après le poll: " + languages);

        //Accéder au premier élément avec peek() qui va retourner le premier de la liste chaînée
        String str2=languages.peek();
        System.out.println("Accès au premier élément avec la méthode peek(): "+ str2);
        System.out.println("Languages  après le peek: " + languages);


        //Ajouter un élément à la fin (queue) de la liste chaînéee

        languages.offer("Swift");
        System.out.println("Languages après offer : " + languages);
    }

}
