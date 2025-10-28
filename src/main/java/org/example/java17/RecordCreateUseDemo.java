package org.example.java17;

import java.rmi.server.UID;
import java.util.UUID;

public class RecordCreateUseDemo {
    public static void main(String[] args) {

        //Creating one is done using the constructor:
        var customer = new Customer(UUID.randomUUID(), "John");

        System.out.println("Customer is : " + customer);
        //Note that JavaBean conventions are not used, so a getter is called x() and not getX()
        var name = customer.name();

        // Default values with a additionanl constructor
        var newCustomer = new Customer("John");
        UUID generated = newCustomer.id();
        System.out.println("newCustomer is :" + newCustomer );

        Customer customer1 = new Customer(UUID.randomUUID(), "John\n");
        // This will be "John"
        String name1= customer1.name();
        System.out.println("name1 is :" + name1);


        //Modifier le record  en créant une nouvelle instance
        var customer2 = new Customer(UUID.randomUUID(), "John");
        var renamed = customer2.withName("John Doe");
        System.out.println("renamed is :" + renamed);

        // valeur dérivée de champs
        var derivedData = customer2.fullName();
        System.out.print("derivedData : "+ derivedData);

        /* Test Validation with record class */
        var invalidCustomer = new Customer(UUID.randomUUID(), " ");
        System.out.println("Validation of record class :" + invalidCustomer);


    }
}
