package org.example.algortihme.interview.designpaterns.proxy;

/**
 * Client code
 */
public class ProxyBankExample {
    public static void main(String[] args) {
        // Using the proxy to access the real bank account
        BankAccount bankAccount = new SecureBankAccountProxy("secret");

        //Operations
        bankAccount.deposit(1000);
        bankAccount.withdraw(100);
        double balance = bankAccount.getBalance();

        System.out.println(" Current balance is " + balance);
    }
}
