package org.example.algortihme.interview.designpaterns.proxy;

/**
 * Subject class
 */
public interface BankAccount {
    /**
     * This method deposite an amount
     *
     * @param amount the mount to be deposite
     */
    void deposit(double amount);

    /**
     * This method withdrawn an amount
     *
     * @param amount the amount to be withdrawn
     */
    void withdraw(double amount);

    /**
     * @return a balance
     */
    double getBalance();
}
