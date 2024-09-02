package org.example.algortihme.interview.graphs;

import org.example.algortihme.Node2;

public class DFSDemo {

    public static void main(String[] args) {
        // Création des noeuds
        Node2 node5 = new Node2(5);
        Node2 node10 = new Node2(10);
        Node2 node3 = new Node2(3);
        Node2 node2 = new Node2(2);
        Node2 node7 = new Node2(7);
        // Configuration des adjacences
        node5.addAdjacent(node10);
        node5.addAdjacent(node3);
        node10.addAdjacent(node2);
        node10.addAdjacent(node7);

        // Initialisation et démarrage de la recherche DFS
        node5.searchDFS(node5); // Démarrer la recherche à partir de node5

    }
}
