package org.example.functionalprogrammingjava8.supplier;

import java.time.LocalDate;

public abstract class Ticket implements Comparable<Ticket> {
    String customerName;
    int id;
    String description;
    LocalDate dueDate;
    LocalDate servicedDate;

    public Ticket(final String customerName, final int id, final String description, final int dueDate) {
        this.customerName = customerName;
        this.id = id;
        this.description = description;
        this.dueDate = LocalDate.now().plusDays(dueDate);
        this.servicedDate = LocalDate.now().minusDays(1);
    }

    @Override
    public String toString() {

        return "Name:" + customerName + "\nID:" + id + "\nDESCRIPTION: " + description + "\nDUE DATE: " + dueDate + "\nSERVICED DATE:" + servicedDate;
    }

    @Override
    public int compareTo(Ticket t) {
        return dueDate.compareTo(t.dueDate);
    }


}
