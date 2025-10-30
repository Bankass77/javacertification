package org.example.java17.chapter8.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class WrappingUserPromptsInASupplierExample {

    public static void main(String[] args) {

        Supplier<Integer> selectedOperation = () -> {

            int operation = 0;
            Scanner userInput = new Scanner(System.in);

            while (operation < 1 || operation > 4) {
                System.out.println("select an Operation: ");
                System.out.println("  1: Operation 1");
                System.out.println("  2: Operation 2");
                System.out.println("  3: Operation 3");
                System.out.println("  4: Quit");

                operation = Integer.parseInt(userInput.nextLine());
                if (operation < 1 || operation > 4) {
                    System.out.println("Invalid Operation.");
                }
            }

            return operation;
        };


        boolean done = false;

        while (!done) {
            switch (selectedOperation.get()) {

                case 1:
                    System.out.println("Performing Operation 1");
                    break;
                case 2:
                    System.out.println("Performing Operation 2");
                    break;
                case 3:
                    System.out.println("Performing Operation 3");
                    break;
                case 4:
                    System.out.println("Performing Operation 4");
                    break;
                default:
                    done = true;
            }
        }
    }
}
