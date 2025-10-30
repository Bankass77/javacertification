package org.example.java17.chapter7.records;

import java.util.Objects;
import java.util.UUID;

/**
 * Documentation of the Customer class
 *
 * @param id   customer id
 * @param name customer name
 */
public record Customer(UUID id, String name) {

    /**
     * Default values
     * Create a new customer with a fresh id.
     *
     * @param name customer name
     */
    public Customer(String name) {
        this(UUID.randomUUID(), name);
    }

    /*Validation  with record class*/
    //Assurer la non-nullité des champs en utilisant des annotations comme @NonNull de Lombok ou Objects.requireNonNull()
    public Customer {
        Objects.requireNonNull(id, "Id cannot be null");
        Objects.requireNonNull(name, "name cannot be null");
        name = name.trim();
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    // Modify Manually add wither methods
    public Customer withName(String name) {
        return new Customer(id, name);
    }

    //Données dévirées dans les records
     public String fullName(){
        return String.format("%s%s", id, name);
     }

}
