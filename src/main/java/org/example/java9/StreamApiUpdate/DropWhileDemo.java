package org.example.java9.StreamApiUpdate;

import java.util.Arrays;
import java.util.List;

/**
 * Cette classe crée une liste de clients et élimine les clients dans le flux tant que le solde du client est inférieur à 500
 */
public class DropWhileDemo {

    public static void main(String[] args) {
        List<Customer> customersList = Arrays.asList(new Customer(101, "Fatoumata Guindo", 899), new Customer(102, "Ali Traoré", 55),
                new Customer(103, "Salif Keita", 660), new Customer(104, "Salif Sanogo", 33));


        // Si la classe Customer n'implémente pas l'interface Comparable, on  fourni un Comparator à sorted()
        /*List<Customer> eligibleCustomersList = customersList.stream().sorted((c1, c2) -> Double.compare(c1.getCustomerBalance(), c2.getCustomerBalance())) // Trier les clients par solde
                .dropWhile(c -> c.getCustomerBalance() < 500).toList();*/
        List<Customer> eligibleCustomersList = customersList.stream().sorted() // Trier les clients par solde
                .dropWhile(c -> c.getCustomerBalance() < 500).toList();

        for(Customer customer : eligibleCustomersList) {
            System.out.println(customer);
        }
    }
}
