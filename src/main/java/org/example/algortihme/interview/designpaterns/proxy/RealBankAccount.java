package org.example.algortihme.interview.designpaterns.proxy;

/**
 * RealSubject class
 */
public class RealBankAccount implements BankAccount {

    private double balance;

    @Override
    public void deposit(final double amount) {
        balance += amount;
        System.out.println("deposit " + amount + " to " + balance);
    }

    @Override
    public void withdraw(final double amount) {
        if (balance >= amount) {
           balance -= amount;
            System.out.println("withdraw " + amount + " from " + balance);
        } else {
            throw new RuntimeException("Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
