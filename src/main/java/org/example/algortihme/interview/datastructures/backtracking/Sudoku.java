package org.example.algortihme.interview.datastructures.backtracking;

public class Sudoku {

    // N est la taille de la matrice 2D N*N
    private static final int N = 9;

    /**
     * @param board   matrice 2D avec N*N
     * @param ligne   de la matrice
     * @param colonne de la matrice
     * @return false si le sudoku n'a pas été résolu
     * Prend une grille partiellement remplie et tente
     * d'attribuer des valeurs à tous les emplacements non attribués
     * de manière à respecter les exigences pour une
     * solution de Sudoku (non-duplication dans les lignes,
     * colonnes et sous-grilles)
     */
    public boolean solveSudoku(int[][] board, int ligne, int colonne) {

        /* Si nous avons atteint la 8e ligne et la 9e colonne (matrice indexée à 0),
           nous renvoyons vrai pour éviter un backtracking supplémentaire */
        if (ligne == N - 1 && colonne == N) {
            return true;
        }

        // Vérifie si la valeur de la colonne devient 9,
        // on passe à la ligne suivante et la colonne commence à 0
        if (colonne == N) {
            ligne++;
            colonne = 0;
        }

        // Vérifie si la position actuelle contient déjà une valeur > 0
        if (board[ligne][colonne] != 0) {
            return solveSudoku(board, ligne, colonne + 1);
        }

        // On essaie les chiffres de 1 à 9
        for (int i = 1; i <= 9; i++) {

            // Vérifie s'il est sûr de placer le numéro (1-9)
            if (estSecurise(board, ligne, colonne, i)) {
                // Assigne le numéro dans la position actuelle
                board[ligne][colonne] = i;

                // Vérifie la possibilité suivante avec la colonne suivante
                if (solveSudoku(board, ligne, colonne + 1)) {
                    return true;
                }
            }

            // Retire le numéro attribué si notre hypothèse est incorrecte
            board[ligne][colonne] = 0;
        }
        return false;
    }

    /**
     * @param board   matrice 2D N*N
     * @param ligne   de la matrice 2D
     * @param colonne de la matrice 2D
     * @param num     valeur à placer
     * @return true si toutes les conditions de placement sont respectées
     */
    private boolean estSecurise(final int[][] board, final int ligne, final int colonne, final int num) {

        // Vérifie si le numéro se trouve déjà dans la même ligne
        for (int x = 0; x < N; x++) {
            if (board[ligne][x] == num) {
                return false;
            }
        }

        // Vérifie si le numéro se trouve déjà dans la même colonne
        for (int y = 0; y < N; y++) {
            if (board[y][colonne] == num) {
                return false;
            }
        }

        // Vérifie si le numéro se trouve déjà dans la sous-grille 3x3
        int debutLigne = ligne - ligne % 3, debutColonne = colonne - colonne % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + debutLigne][j + debutColonne] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @param board matrice 2D N*N
     *              Fonction utilitaire pour imprimer la matrice
     */
    public void imprimer(int[][] board) {
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < N; i++) {
            System.out.print("| ");
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print(board[i][j] + " ");
                }

                if ((j + 1) % 3 == 0) {
                    System.out.print("| ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
        }
    }

    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        // Exemple de grille de Sudoku avec quelques cases déjà remplies (0 représente les cases vides)
        int[][] grille = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        sudoku.solveSudoku(grille, 0, 0);
        sudoku.imprimer(grille);
    }
}
