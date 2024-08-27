package org.example.algortihme.interview.testInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

public class BlockPuzzle {
    public static int solve(int width, int height, int nbBlocks, String[] grid) {
        // Parse the grid to collect blocks with their positions
        List<Block> blocks = new ArrayList<>();
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c++) {
                char cell = grid[r].charAt(c);
                if (cell != '0') {
                    blocks.add(new Block(cell - '0', r, c));
                }
            }
        }

        // Sort blocks by their column in ascending order
        blocks.sort(Comparator.comparingInt(b -> b.col));

        // Prepare result array
        StringBuilder result = new StringBuilder();

        // Process each block in sorted order
        for (Block block : blocks) {
            result.append(block.value);
        }

        // Convert result to a single integer
        return Integer.parseInt(result.toString());
    }

    // Helper class to store block information
    static class Block {
        int value;
        int row;
        int col;

        Block(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int width = 5;
        int height = 5;
        int nbBlocks = 3;
        String[] grid = {
                "01234",
                "56789",
                "00000",
                "00000",
                "00000"
        };

        int result = solve(width, height, nbBlocks, grid);
        System.out.println(result); // Output should be the order of blocks
    }
}
