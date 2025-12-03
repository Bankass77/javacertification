package org.example.functionalprogrammingjava8.supplier;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // Generates a random Integer
        Supplier<Integer> generateRandomInteger = () -> {

            Random random = new Random();
            return random.nextInt(100);

        };

        System.out.println(generateRandomInteger.get());


        // Generates a String  Using a Scanner Object

        Supplier<String> generateString = ()->{

            Random random = new Random();
            random.toString();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a String");
             return scanner.nextLine();
        };

       System.out.println(generateString.get());
    }
}
