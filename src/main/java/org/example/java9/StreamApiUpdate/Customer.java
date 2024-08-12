package org.example.java9.StreamApiUpdate;

import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Customer implements Comparable<Customer> {

    private int customerId;

    private String customerName;

    private double customerBalance;

    @Override
    public int compareTo(Customer customer) {

        //Puis que je souhaite comparer les soldes des clients, donc on fait:
        return Double.compare(this.customerBalance, customer.customerBalance);
    }

}
