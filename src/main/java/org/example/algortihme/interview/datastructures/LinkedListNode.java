package org.example.algortihme.interview.datastructures;

import java.util.LinkedList;
import java.util.List;

public class LinkedListNode {

    // Creation d'un noeud
    Node head;


    public static void main(String[] args) {
        LinkedListNode linkedListNode = new LinkedListNode();

        linkedListNode.head= new Node(1);
        Node second= new Node(2);
        Node third= new Node(3);

        // Connexion des noeuds
        linkedListNode.head.next = second;
        second.next= third;

        // affichage des valeurs de chaque noeud
        while (linkedListNode.head != null) {
            System.out.println(linkedListNode.head.data);
            linkedListNode.head = linkedListNode.head.next;
        }
        // Création de LinkedList en utilisant une interface List
        List<String> animals= new LinkedList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("Cow");
        System.out.println("Animals : " + animals + " A size of animals : " + animals.size());

        // La méthode add() avec le paramètre index
        animals.add(1, "Horse");
        System.out.println("Animals : " + animals + " A new size of linked list is : " + animals.size());

     // Accéder au élément contenu dans un linked list

        String str = animals.get(0);
        System.out.println("Element at index 0 is : " + str);


        // Modifier un élément
        animals.set(1, "Mouse");
        System.out.println("Update animals : " + animals + " A size of animals : " + animals.size());
    }
}
