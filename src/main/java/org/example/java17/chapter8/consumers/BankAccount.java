package org.example.java17.chapter8.consumers;

import java.util.ArrayList;

public class BankAccount {
    private String name;
    private int id;
    private double balance;

    public BankAccount(final String name, final int id, final double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object ba) {
        return this.id == ((BankAccount) ba).id;
    }

    @Override
    public String toString() {
        return "name: " + name + " id :" + id + " balance: " + balance;
    }

}
