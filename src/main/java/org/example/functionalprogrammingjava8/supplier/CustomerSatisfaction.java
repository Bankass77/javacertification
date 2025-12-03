package org.example.functionalprogrammingjava8.supplier;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class CustomerSatisfaction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> questionsToCustomers = new LinkedHashMap<>();

        questionsToCustomers.put("How statisfied are you with our service?", List.of(" 1. Very satisfied", "2. Satisfied", "3. Neutral", "4. Dissatisfied", "5. Very Dissatisfied"));

        questionsToCustomers.put("How fast was the delivery ?",
                List.of("1. Very fast", "2. Fast", "3. Normal", "4. Slow"));

        questionsToCustomers.put("Would you recommend us to others ?",
                List.of("1. Yes", "2. No"));

        Supplier<String> customerResponse = new Supplier<String>() {

            @Override
            public String get() {
                System.out.println("Your answer: ");
                return scanner.nextLine();
            }
        };

        Supplier<Boolean> quit = new Supplier<Boolean>() {
            @Override
            public Boolean get() {
                System.out.println(" Do you want quit ?  (Y or N) ");
                return scanner.nextLine().equalsIgnoreCase("Y");

            }
        };


        for (var entry : questionsToCustomers.entrySet()) {

            System.out.println("\nQuestion: ");
            System.out.println(entry.getKey());

            System.out.println("Possibles answers: ");
            entry.getValue().forEach(System.out::println);

            String anwser = customerResponse.get();

            System.out.println("Your answer is : " + anwser);

            if (quit.get()) {
                System.out.println("Survey termined early by the user.");
                break;
            }

        }
    }
}
