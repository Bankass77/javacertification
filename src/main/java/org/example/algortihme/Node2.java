package org.example.algortihme;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node2 {
    private int value;
    private boolean isVisited;
    private List<Node2> adjacents;

    public Node2(int value) {
        this.value = value;
        this.isVisited = false;
        this.adjacents = new ArrayList<>();
    }

    /**
     * Cette méthode permet de créer des nodes adjacents dans un graphe
     *
     * @param node adjacent à créer
     */
    public void addAdjacent(Node2 node) {
        this.adjacents.add(node);
    }

    private void visit(Node2 node) {
        // Affiche la valeur du noeud ou effectue une autre action
        System.out.println("Visiting node with value: " + node.value);
        // Marque le noeud comme visité
        node.isVisited = true;
    }

    /**
     * Cette méthode permet de chercher le node voisin avec la méthode DFS
     *
     * @param root node à partir duquel on demarre la recherche des voisins adjacents.
     */
    public void searchDFS(Node2 root) {
        if (root == null || root.isVisited) {
            return;
        }

        // Marquer le noeud actuel comme visité
        visit(root);

        root.isVisited = true;

        // Parcourir les adjacents du noeud courant
        for (Node2 adjacent : root.adjacents) {

            // Vérifier si le voisin a été visité
            if (!adjacent.isVisited) {
                searchDFS(adjacent);
            }
        }

    }

    /**
     * Cette méthode permet de chercher le node voisin avec la méthode BFS
     * @param startNode pour lequel on cherche les voisins adjacents.
     */
    public void searchBFS(Node2 startNode) {
        // Création d'une file d'attente
        Queue<Node2> queue = new LinkedList<Node2>();

        // Marquer le noeud de départ comme visité et l'ajouter à la file d'attente
        startNode.isVisited = true;
        queue.add(startNode);
        while (!queue.isEmpty()) {
            // Défilez le noeud courant
            Node2 currentNode = (Node2) queue.poll();
            System.out.println("Visiting node with value: " + currentNode.value);
            // Pour chaque voisin du noeud courant
            for (Node2 adjacent : currentNode.adjacents) {
                if (!adjacent.isVisited) {
                    // Marquer le voisin comme visité et l'ajouter à la file d'attente
                    adjacent.isVisited = true;
                    queue.add(adjacent);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Node2{" +
                "value=" + value +
                ", isVisited=" + isVisited +
                ", adjacents=" + adjacents +
                '}';
    }
}
