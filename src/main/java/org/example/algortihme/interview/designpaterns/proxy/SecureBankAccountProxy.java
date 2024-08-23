package org.example.algortihme.interview.designpaterns.proxy;

/**
 * Proxy class
 */
public class SecureBankAccountProxy implements BankAccount {
    private RealBankAccount realBankAccount;
    private String password;

    public SecureBankAccountProxy(RealBankAccount realBankAccount) {
        this.realBankAccount = realBankAccount;
    }

    public SecureBankAccountProxy(String password) {
        this.password = password;
        authenticate();
    }

    @Override
    public void deposit(final double amount) {
        if (realBankAccount != null) {
            realBankAccount.deposit(amount);
        }
    }

    @Override
    public void withdraw(final double amount) {
        if (realBankAccount != null) {
            realBankAccount.withdraw(amount);
        }
    }

    @Override
    public double getBalance() {
        return (realBankAccount != null) ? realBankAccount.getBalance() : 0.0;
    }

    /**
     * This method authenticate log user if password is ok.
     */
    private void authenticate() {
        if (password.equals("secret")) {
            realBankAccount = new RealBankAccount();
            System.out.println("Authentication successful.");
        } else {
            System.out.println("Authentication failed. Access denied.");
        }
    }
}
