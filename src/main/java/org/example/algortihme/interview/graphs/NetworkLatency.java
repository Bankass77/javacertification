package org.example.algortihme.interview.graphs;

import java.util.Arrays;
import java.util.List;

public class NetworkLatency {
    public static int getMinMaxLatency(int nbNodes, List<List<Integer>> network, int k) {
        // Variables pour représenter les latences minimales et maximales
        int low = 0;
        int high = Integer.MAX_VALUE;

        // Fonction pour vérifier si on peut diviser le réseau en k sous-réseaux
        // avec une latence maximale donnée
        while (low < high) {
            int mid = (low + high) / 2;
            if (canDivideNetwork(nbNodes, network, k, mid)) {
                high = mid; // On essaie une latence plus petite
            } else {
                low = mid + 1; // On augmente la latence maximale possible
            }
        }
        return low;
    }

    // Fonction qui vérifie si on peut diviser le réseau en k sous-réseaux avec une latence maximale donnée
    private static boolean canDivideNetwork(int nbNodes, List<List<Integer>> network, int k, int maxLatency) {
        boolean[] visited = new boolean[nbNodes];
        int components = 0;

        for (int i = 0; i < nbNodes; i++) {
            if (!visited[i]) {
                components++;
                if (components > k) {
                    return false; // Trop de composants
                }
                dfs(i, visited, network, maxLatency); // Explore le sous-réseau
            }
        }

        return components <= k;
    }

    // DFS pour explorer le réseau
    private static void dfs(int node, boolean[] visited, List<List<Integer>> network, int maxLatency) {
        visited[node] = true;

        // Vérifier que l'indice de node est valide
        if (node >= network.size()) {
            return; // Sortir si l'indice dépasse la taille de la liste
        }

        // Parcourir les voisins du nœud actuel
        for (int neighbor = 0; neighbor < network.get(node).size(); neighbor++) {
            // Vérifier si le voisin n'a pas été visité et que la latence est inférieure à la latence maximale autorisée
            if (!visited[neighbor] && network.get(node).get(neighbor) <= maxLatency) {
                dfs(neighbor, visited, network, maxLatency);
            }
        }
    }

    public static void main(String[] args) {
        int nbNodes = 5;
        List<List<Integer>> network = Arrays.asList(
                Arrays.asList(0, 10, 20, 30, 40),
                Arrays.asList(10, 0, 15, 25, 35),
                Arrays.asList(20, 15, 0, 10, 25),
                Arrays.asList(30, 25, 10, 0, 20),
                Arrays.asList(40, 35, 25, 20, 0)
        );
        int k = 2;

        int result = getMinMaxLatency(nbNodes, network, k);
        System.out.println("Latence maximale minimale possible: " + result);
    }

}
