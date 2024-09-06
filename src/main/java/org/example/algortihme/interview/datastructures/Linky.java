package org.example.algortihme.interview.datastructures;

import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList <>();
        linkedList.add("François");
        linkedList.add("Belgium");
        linkedList.add("Germany");
        System.out.println(linkedList.remove("Germany"));
        System.out.println(linkedList.get(0));
        linkedList.addFirst("bamako");
        System.out.println(linkedList.pollFirst());
       System.out.println( linkedList.offerLast("Ghana"));
       System.out.println(linkedList);
    }
}
