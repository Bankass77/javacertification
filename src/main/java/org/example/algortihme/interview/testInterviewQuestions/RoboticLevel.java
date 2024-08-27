package org.example.algortihme.interview.testInterviewQuestions;

/*
 Rules
You work in an automated factory. The factory uses a simple robotic arm to move boxes around. The arm is capable of picking a box from a stack, and placing it on another stack.

All boxes are on one of a given number of stacks. Your objective is to rearrange the stacks in order to have an equal number of boxes on each stack. If this is not possible, any excess box must be stacked from left to right.

Your code will periodically receive the current state of the arm and the number of boxes on each stack.

In order to succeed, your method must return one command per turn up until the boxes are correctly positioned. The available commands are:

RIGHT: the arm moves one stack to the right.
LEFT: the arm moves one stack to the left.
PICK: the arm grabs a box from the stack directly below it.
PLACE: the arm places a box onto the stack directly below it.
Warning, you may execute a maximum of 200 commands, but it is not necessary to minimize the amount of instructions.

  Implementation
Implement the method solve(clawPos, boxes, boxInClaw) that takes as arguments: an integer clawPos for the index of the stack the arm is currently above. boxes an array of integers for the size of each stack. The boolean boxInClaw which will be true if the arm is carrying a box, false otherwise.
 */
public class RoboticLevel {

    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
        // Write your code here
        // To debug: System.  int totalBoxes = 0;

        int totalBoxes = 0;
        int stacks = boxes.length;

        for (int b : boxes) {
            totalBoxes += b;
        }

        int targetHeight = totalBoxes / stacks;
        int excessBoxes = totalBoxes % stacks;

        // Identifiez la pile qui nécessite une action (PICK ou PLACE)
        if (boxInClaw) {
            // Si le bras tient une boîte, trouver la première pile qui a besoin d'un placement
            for (int i = 0; i < stacks; i++) {
                if (boxes[i] < targetHeight + (i < excessBoxes ? 1 : 0)) {
                    if (clawPos < i) {
                        return "RIGHT";
                    }
                    if (clawPos > i) {
                        return "LEFT";
                    }
                    return "PLACE";
                }
            }
        } else {
            // Si le bras ne tient pas de boîte, trouver la première pile qui dépasse la hauteur cible
            for (int i = 0; i < stacks; i++) {
                if (boxes[i] > targetHeight + (i < excessBoxes ? 1 : 0)) {
                    if (clawPos < i) {
                        return "RIGHT";
                    }
                    if (clawPos > i) {
                        return "LEFT";
                    }
                    return "PICK";
                }
            }
        }

        // Si aucune action n'est nécessaire (cela ne devrait jamais arriver), rester en place
        return "LEFT";
    }
}
