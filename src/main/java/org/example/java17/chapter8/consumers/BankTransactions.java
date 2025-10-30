package org.example.java17.chapter8.consumers;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BankTransactions {
    public static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static int numAccounts = 0;
    private static double prevBalance = 0.0;

    private static Scanner scanner = new Scanner(System.in);

    public static String promptTransaction() {
        System.out.println("Enter Transaction Type:");
        System.out.println("OPENACCOUNT");
        System.out.println("DEPOSIT");
        System.out.println("WITHDRAWAL");
        System.out.println("CLOSEACCOUNT");
        System.out.println("QUIT:");
        return scanner.nextLine();
    }

    public  static  double promptAmount(){
        System.out.println("Enter Amount: ");
        return  Double.parseDouble(scanner.nextLine());
    }

    public  static  String promptName(){
        System.out.println(" Enter Name: ");
        return  scanner.nextLine();
    }
    public static int promptId() {

        System.out.println("Enter id:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static BankAccount findBankAcount(int id) {
        int index = accounts.indexOf(new BankAccount(null, id, 0.0));

        return (index > -1) ? accounts.get(index) : null;
    }

    public static void main(String[] args) {
        BiConsumer<String, Double> open = (x, y) -> {
            numAccounts = accounts.size();
            Random generator = new Random();
            accounts.add(new BankAccount(x, generator.nextInt(100000), y));
        };

        BiConsumer<String, Double> openVerification = (x, y) -> {
            if (accounts.size() == (numAccounts + 1) && accounts.get(numAccounts).getName().equals(x)) {
                System.out.println("ACCOUNT for " + x + " OPENED SUCCESSFULLY.\n" + accounts.get(numAccounts));

            } else {
                System.out.println(" COULD NOT OPEN ACCOUNT for " + x);
            }

        };

        BiConsumer<Integer, Double> deposit = (x, y) -> {
            BankAccount account = findBankAcount(x);
            if (account != null) {
                prevBalance = account.getBalance();
                prevBalance += y;
            }
        };

        BiConsumer<Integer, Double> depositVerification = (x, y) -> {
            BankAccount account = findBankAcount(x);
            if (account != null && account.getBalance() == (prevBalance + y)) {
                System.out.println("DEPOSIT OF $" + y + " INTO ACCOUNT " + x + " SUCCESSFULL\n" + account);

            } else {
                System.out.println("ACCOUNT " + x + " " + "NOT FOUND");
            }
        };

        BiConsumer<Integer, Double> withdraw = (x, y) -> {

            BankAccount account = findBankAcount(x);
            if (account != null) {
                prevBalance = account.getBalance();
                if ((prevBalance - y) > 0.0) {
                    prevBalance -= y;
                }
            }
        };

        BiConsumer<Integer, Double> withdrawVerification = (x, y) -> {
            BankAccount account = findBankAcount(x);
            if (account != null) {
                if (account.getBalance() == prevBalance - y) {
                    System.out.println("WITDRAW OF $" + y + " FROM ACCOUNT " + x + " SUCCESSFULL\n" + account);
                } else {

                    System.out.println("ACCOUNT " + x + " NOT FOUND");
                }
            }
        };

        Consumer<Integer> close = x->{
            numAccounts = accounts.size();
            BankAccount account = findBankAcount(x);
            if (account !=null){

                accounts.remove(account);
            }
        };

        Consumer<Integer> closeVerification= x->{
            if (accounts.size() == (numAccounts-1)){
                System.out.println("ACCOUNT " + x + " SUCCESSFULLY  CLOSED");
            }else {
                System.out.println("COULD NOT CLOSE ACCOUNT " + x);
            }
        };

        boolean done = false;
        while (!done){
            String transactionSelected= promptTransaction();
            switch (transactionSelected){
                case "OPENACCOUNT": open.andThen(openVerification).accept(promptName(), promptAmount());
                break;
                case "DEPOSIT" : deposit.andThen(depositVerification).accept(promptId(), promptAmount());
                break;
                case "WITHDRAWAL": withdraw.andThen(withdrawVerification).accept(promptId(),promptAmount());
                break;
                case "CLOSEACCOUNT" : close.andThen(closeVerification).accept(promptId());
                break;
                case "QUIT": done =true;
                break;
                default: System.out.println("Invalid Selection");
            }
        }
    }
}
