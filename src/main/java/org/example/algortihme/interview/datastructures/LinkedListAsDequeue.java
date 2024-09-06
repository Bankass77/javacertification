package org.example.algortihme.interview.datastructures;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDequeue {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        //Ajouter un élément au début ou en tête de la LinkedList
        deque.add("Cow");
        System.out.println("LinkedList : "+ deque);
        deque.addFirst("Sheep");
        System.out.println("LinkedList après addFirst: "+ deque);

        //Ajouter un élément à la fin ou à la queue de LinkedList
        deque.addLast("Dog");
        System.out.println("LinkedList après addlast : "+ deque);

        //Suppression du premier élément
        deque.removeFirst();
        System.out.println("LinkedList après removeFirst: "+ deque);

        //Suppression du dernier élément
        deque.removeLast();
        System.out.println("LinkedList après removeLast: "+ deque);
    }
}
