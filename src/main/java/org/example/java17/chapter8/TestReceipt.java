package org.example.java17.chapter8;

public class TestReceipt {
    public static void main(String[] args) {

        ReceiptPrinter<Receipt> simpleReceiptPrinter = new ReceiptPrinter<>() {
            @Override
            public void print(final Receipt receipt) {
                System.out.println("\nItem : \t" + receipt.item);
                System.out.println("\nPrice : \t" + receipt.price);
                System.out.println("\nDiscount : \t" + receipt.discount);
                System.out.println("\nTax : \t" + receipt.tax);
                System.out.println("\nTotal : \t" + computeTotal(receipt));
            }

        };


        ReceiptPrinter<Receipt> examptReceiptPrinter = new ReceiptPrinter<>() {
            @Override
            public void print(final Receipt receipt) {
                System.out.println("\nItem : \t" + receipt.item);
                System.out.println("\nPrice : \t" + receipt.price);
                System.out.println("\nDiscount : \t" + receipt.discount);
                System.out.println("\nTotal : \t" + computeTotal(receipt));
            }

            @Override
            public double computeTotal(final Receipt receipt) {
                return receipt.price - (receipt.price * receipt.discount);
            }
        };

        ReceiptPrinter<CountyReceipt> countyReceiptPrinter = new ReceiptPrinter<CountyReceipt>() {
            @Override
            public void print(final CountyReceipt receipt) {
                System.out.println("\nItem :\t" + receipt.item);
                System.out.println("\nPrice :\t" + receipt.price);
                System.out.println("\nDisc :\t" + receipt.discount);
                System.out.println("\nTax :\t" + receipt.tax);
                System.out.println("\nCnTax :\t" + receipt.countyTax);
                System.out.println("\nTotal :\t" + computeTotal(receipt));
            }

            @Override
            public double computeTotal(final CountyReceipt receipt) {
                double discountedPrice = receipt.price - (receipt.price * receipt.discount);
                return discountedPrice + (discountedPrice * receipt.tax) + (receipt.price) * receipt.countyTax;
            }
        };

        Receipt receipt = new Receipt("shirt", 20.00, 0.05, 0.07);
        simpleReceiptPrinter.print(receipt);
        examptReceiptPrinter.print(receipt);

        CountyReceipt countyReceipt = new CountyReceipt(receipt, 0.04);
        countyReceiptPrinter.print(countyReceipt);
    }



}
