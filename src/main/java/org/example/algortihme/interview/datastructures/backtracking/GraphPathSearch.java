package org.example.algortihme.interview.datastructures.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
Trouver le chemin entre des sommets donnés dans un graphe orienté
Google Translate Icon
Étant donné un graphe orienté et deux sommets (disons un sommet source et un sommet de destination),
déterminez si le sommet de destination est accessible depuis le sommet source ou non.
S'il existe un chemin entre le sommet source et le sommet de destination, imprimez-le.

Par exemple, il existe deux chemins [0—3—4—6—7] et [0—3—5—6—7] du sommet 0 au sommet 7 dans le graph suivant.
En revanche, il n'y a pas de chemin depuis le sommet 7 à tout autre sommet.

 */
public class GraphPathSearch {

    public void searchAllPaths(int source, int dest, List<List<Integer>> graph, boolean[] visited, List<Integer> currentPath, List<List<Integer>> allPaths) {
        visited[source] = true;
        currentPath.add(source);

        // Si on atteint la destination, ajouter le chemin actuel à la liste des chemins
        if (source == dest) {
            allPaths.add(new LinkedList<>(currentPath));
        } else {
            // Explorer les voisins du sommet courant
            List<Integer> neighbors = graph.get(source);
            for (Integer neighbor : neighbors) {
                if (!visited[neighbor]) {
                    // Si un chemin est trouvé à partir de ce voisin, retourner vrai
                    searchAllPaths(neighbor, dest, graph, visited, currentPath, allPaths);
                }
            }
        }

        // Retour arrière (backtracking) : enlever le sommet courant du chemin et le marquer comme non visité
        currentPath.remove(currentPath.size() - 1);
        visited[source] = false;
    }

    // Méthode pour initialiser la recherche et afficher le chemin
    public List<List<Integer>> findAllPath(int source, int dest, List<List<Integer>> graph) {
        // Tableau de sommets visités
        boolean[] visited = new boolean[graph.size()];
        // Liste pour stocker tous les chemins
        List<List<Integer>> allPaths = new ArrayList<>();
        // Pile pour stocker le chemin actuel
        List<Integer> path = new Stack<>();
        searchAllPaths(source, dest, graph, visited, path, allPaths);

        // Retourner tous les chemins trouvés
        return allPaths;
    }

    public static void main(String[] args) {
        GraphPathSearch graphPathSearch = new GraphPathSearch();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            graph.add(new ArrayList<>());
        }
        // Ajouter les arêtes du graphe
        graph.get(0).add(3);
        graph.get(3).add(4);
        graph.get(4).add(6);
        graph.get(6).add(7);
        graph.get(3).add(5);
        graph.get(5).add(6);
        // Recherche d'un chemin entre les sommets 0 et 7
        System.out.println(graphPathSearch.findAllPath(0, 7, graph));


    }

}
