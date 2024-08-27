package org.example.algortihme.interview.testInterviewQuestions;

import java.io.PrintStream;
import java.util.Scanner;

public class PlayerRobot {

    public static  String solve(int clawPos, int [] boxes, boolean boxInClaw) {

        int totalBoxes = 0;
        for (int boxe : boxes) {
            totalBoxes += boxe;
        }
        int targetHeight = totalBoxes / boxes.length;
        int excessBoxes = totalBoxes % boxes.length;

        // Si le bras tient une boîte , essayons de la placer
        if (boxInClaw) {
            if (boxes[clawPos] > targetHeight + (clawPos < excessBoxes ? 1 : 0)) {
                return "PLACE";
            } else {
                if (clawPos < boxes.length - 1) {
                    return "RIGHT";
                } else {
                    return "LEFT";
                }

            }
        }

        // Si le bras ne tient pas une boîte, essayons d'en prendre une une
        if(boxes[clawPos] > targetHeight + (clawPos < excessBoxes ? 1 : 0)) {
            return "PICK";
        }
        //Snon, déplacer le bras pour trouver une pile à equilibrer
        if(clawPos < boxes.length - 1) {
            return "RIGHT";
        }else {
            return "LEFT";
        }
    }
        public static void main (String args[]){
            Scanner in = new Scanner(System.in);

            // game loop
            while (true) {
                int clawPos = in.nextInt();
                boolean boxInClaw = in.nextInt() != 0;
                int stacks = in.nextInt();
                int[] boxes = new int[stacks];
                for (int i = 0; i < stacks; i++) {
                    boxes[i] = in.nextInt();
                }
                PrintStream outStream = System.out;
                System.setOut(System.err);
                String action = solve(clawPos, boxes, boxInClaw);
                System.setOut(outStream);
                System.out.println(action);
            }
        }
}
