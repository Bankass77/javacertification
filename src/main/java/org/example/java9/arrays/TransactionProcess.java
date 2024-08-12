package org.example.java9.arrays;

import java.util.Arrays;

public class TransactionProcess {

    public static void main(String[] args) {
        Transaction transaction = new Transaction("txn1", 100);
        Transaction transaction2 = new Transaction("txn2", 200);
        Transaction transaction3 = new Transaction("txn3", 300);
        Transaction transaction4 = new Transaction("txn4", 400);
        Transaction transaction5 = new Transaction("txn1", 100);
        Transaction transaction6 = new Transaction("txn2", 200);
        Transaction transaction7 = new Transaction("txn3", 300);
        Transaction transaction8 = new Transaction("txn4", 400);

        checkTransaction(new Transaction[] { transaction, transaction2, transaction3, transaction4 },
                new Transaction[] { transaction5, transaction6, transaction7, transaction8 });

    }

    private static void checkTransaction(Transaction[] transaction, Transaction[] transaction2) {

        int x = Arrays.mismatch(transaction, transaction2, new TransactionComparator());
        if(x == -1) {
            System.out.println("Transactions Array are matched");

        } else {
            System.out.println("First: "+ x + " " + "elements are matched");
        }
    }
}
