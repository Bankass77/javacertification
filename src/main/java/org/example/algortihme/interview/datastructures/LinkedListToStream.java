package org.example.algortihme.interview.datastructures;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

public class LinkedListToStream {

    public static void main(String[] args) {
        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //Conversion de LinkedList en Stream
        Stream<Integer> stream = linkedList.stream();
        stream.forEach( System.out::println);


        System.out.println("LinkedList to Array");
        //LinkeList to Array
        stream= linkedList.stream();
        Integer [] linkedListArray = stream.toArray(Integer[]::new);
          System.out.println(Arrays.toString(linkedListArray));

        System.out.println("Filter LinkedList");
                 stream= linkedList.stream();
        //Utilisation du stream pour filtrer les valeurs
         stream.filter( n -> n>2).forEach(System.out::println);


         // Méthode Dequeue de LinkedList

    }
}
