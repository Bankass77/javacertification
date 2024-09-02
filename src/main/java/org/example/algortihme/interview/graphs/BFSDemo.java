package org.example.algortihme.interview.graphs;

import org.example.algortihme.Node2;

public class BFSDemo {

    public static void main(String[] args) {
        // Création de Node
        Node2 node1 = new Node2(1);
        Node2 node2 = new Node2(2);
        Node2 node3 = new Node2(3);
        Node2 node4 = new Node2(4);
        Node2 node5 = new Node2(5);

        //Configration des adjacences
        node1.addAdjacent(node2);
        node1.addAdjacent(node3);
        node2.addAdjacent(node4);
        node3.addAdjacent(node4);
        node4.addAdjacent(node5);
        BFSDemo bfsDemo = new BFSDemo();
        node1.searchBFS(node2);
    }
}
