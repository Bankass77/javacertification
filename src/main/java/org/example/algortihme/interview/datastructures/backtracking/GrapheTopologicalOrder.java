package org.example.algortihme.interview.datastructures.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.example.algortihme.interview.graphs.Graph;

public class GrapheTopologicalOrder {
    /**
     * @param v       sommet de départ
     * @param visited tableau de boolean pour stocker le sommet visité
     * @param stack   permet de l'ordre topologique en construction
     * @param graph   correspond au graphe qui permet de génerer l'ordre topologique des sommets
     */
    private void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack, List<List<Integer>> graph) {
        //Condition d'arrêt: marquer que le sommet v a été visité
        visited[v] = true;
        // on explore tous les voisins du sommet v
        for (int neighbor : graph.get(v)) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack, graph);
            }
        }
        //on ajoute le sommet v après avoir visiter ses voisins
        stack.push(v);
    }

    //Fonction principale pour réaliser l'ordre topologique
    public void topologicalSort(int vertices, List<List<Integer>> graph) {
        Stack<Integer> stack = new Stack<>(); // une pile pour stocker l'ordre topologique
        boolean[] visited = new boolean[vertices]; // Marquer le sommets visités
        //appel recursif DFS pour chaque sommet non visité
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack, graph);
            }
        }
        while (!stack.isEmpty()) {
            int v = stack.pop();
            System.out.print(v + " ");
        }
    }

    public static void main(String[] args) {
        GrapheTopologicalOrder grapheTopologicalOrder = new GrapheTopologicalOrder();
        List<List<Integer>> graph = new ArrayList<>(); // représentation du graphe
        int vertices = 10;
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        // ajout des arretes du graphe
        graph.get(9).add(1);
        graph.get(9).add(0);
        graph.get(8).add(0);
        graph.get(8).add(1);
        graph.get(7).add(8);
        graph.get(6).add(1);
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        System.out.println("L'ordre topologique des sommets est : ");
        grapheTopologicalOrder.topologicalSort(vertices, graph);
    }
}
