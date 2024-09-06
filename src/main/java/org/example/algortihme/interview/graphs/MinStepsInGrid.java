package org.example.algortihme.interview.graphs;

import java.util.LinkedList;
import java.util.Queue;

/*
Find the minimum number of steps required in a 2D array of size (n, m) to reach (n-1, m-1) from (0, 0).
The array contains only 0(s) and 1(s) where cells with value 1 are not accessible.
up down right left
*/
public class MinStepsInGrid {
    // Directions for movement (up, down, left, right)
    private static final int[][] DIRECTIONS = {
            {1, 0},  // down
            {-1, 0}, // up
            {0, 1},  // right
            {0, -1}  // left
    };

    public static int minSteps(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Edge case: starting or ending point is not accessible
        if (grid[0][0] == 1 || grid[n - 1][m - 1] == 1) {
            return -1; // no path possible
        }

        // BFS queue to store coordinates and number of steps
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0}); // {row, col, steps}

        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int steps = current[2];

            // If we have reached the bottom-right corner
            if (row == n - 1 && col == m - 1) {
                return steps;
            }

            // Explore neighbors
            for (int[] direction : DIRECTIONS) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                // Check if the new position is within bounds, not visited, and accessible (value 0)
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && !visited[newRow][newCol] && grid[newRow][newCol] == 0) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol, steps + 1});
                }
            }
        }

        return -1; // If no path exists
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1},
                {0, 0, 1},
                {1, 0, 0}
        };

        int result = minSteps(grid);
        if (result != -1) {
            System.out.println("Minimum steps to reach destination: " + result);
        } else {
            System.out.println("No path exists.");
        }
    }
}
/*
 * Explication :
 * Représentation de la grille : La grille est représentée comme une matrice 2D avec des 0 (cases accessibles) et des 1 (obstacles).
 * Algorithme BFS : L'algorithme BFS est utilisé car il explore couche par couche, garantissant que la première fois qu'il atteint la destination, il le fait avec le nombre minimal de pas.
 * File (Queue) : On utilise une file pour stocker les coordonnées des cellules à visiter ainsi que le nombre de pas faits pour y arriver.
 * Vérifications de validité : Avant d'ajouter une cellule à la file, on vérifie qu'elle est dans les limites de la grille, qu'elle n'a pas été visitée et qu'elle est accessible.
 * Cas de sortie : Si on atteint la destination (n-1, m-1), on renvoie le nombre de pas. Si la file est vide et que la destination n'a pas été atteinte, il n'y a pas de chemin possible.
 * Cela permet de calculer efficacement le nombre minimal de pas pour atteindre la destination dans une grille.
 */