package org.example.java17.chapter8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DiscountDave {

    private static boolean qualifyCustomer(Customer customer, ArrayList<Predicate<Customer>> pList) {
        int count = 0;

        for (Predicate<Customer> p : pList) {
            if (p.test(customer)) {
                count++;
                System.out.println("MATCH" + count);
            }
        }
        return count >= 3;
    }

    public static void main(String[] args) {

        ArrayList<Predicate<Customer>> elantraQualifier = new ArrayList<>();
        elantraQualifier.add(c -> c.gender.equals("female"));
        elantraQualifier.add(c -> c.state.equals("New Jersey") || c.state.equals("Pennsylvania"));
        elantraQualifier.add(c -> c.age > 40 && c.age < 50);
        elantraQualifier.add(c -> c.ed.compareTo(Education.HIGHSCHOOL) > 0);

        ArrayList<Predicate<Customer>> priusQualifier = new ArrayList<>();

        priusQualifier.add(customer -> customer.gender.equals("male"));
        priusQualifier.add(customer -> customer.state.equals("New York"));
        priusQualifier.add(customer -> customer.age > 20 && customer.age < 30);
        priusQualifier.add(customer -> customer.ed.equals(Education.BACHELORS));


        ArrayList<Predicate<Customer>> odysseyQualifier = new ArrayList<>();
        odysseyQualifier.add(customer -> customer.gender.equals("female"));
        odysseyQualifier.add(customer -> customer.state.equals("New Jersey"));
        odysseyQualifier.add(customer -> customer.ed.compareTo(Education.HIGHSCHOOL) > 0);

        Customer customer = new Customer("female", "New York", 43, Education.BACHELORS);
        Customer customer1 = new Customer("male", "New York", 45, Education.BACHELORS);
        Customer customer2 = new Customer("female", "New York", 52, Education.PHD);

        System.out.println("Qualify customer: " + customer);
        if (qualifyCustomer(customer, elantraQualifier)) {
            System.out.println("Sell customer a Hyandai Elantra");
        }

        if (qualifyCustomer(customer, priusQualifier)) {
            System.out.println("Sell customer a Toyata Prius");
        }

        if (qualifyCustomer(customer, odysseyQualifier)) {
            System.out.println("Sell customer a Honda Odyssey");
        }

        System.out.println("Qualify customer: " + customer1);

        if (qualifyCustomer(customer1, elantraQualifier)) {

            System.out.println("Sell customer a Hyundai Elantra");
        }

        if (qualifyCustomer(customer1, priusQualifier)) {
            System.out.println("Sell customer a Toyota Prius");
        }

        if (qualifyCustomer(customer1, odysseyQualifier)) {
            System.out.println("Sell customer a Honda Odyssey");
        }

        System.out.println("Qualify customer: " + customer2);
        if (qualifyCustomer(customer2, elantraQualifier)) {

            System.out.println("Sell customer a Hyundai Elantra");
        }

        if (qualifyCustomer(customer2, priusQualifier)) {
            System.out.println("Sell customer a Toyota Prius");
        }

        if (qualifyCustomer(customer2, odysseyQualifier)) {
            System.out.println("Sell customer a Honda Odyssey");
        }
    }
}
