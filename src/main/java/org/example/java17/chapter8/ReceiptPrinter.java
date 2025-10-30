package org.example.java17.chapter8;

@FunctionalInterface
public interface ReceiptPrinter <X extends Receipt> {

    void print(X receipt);

    private double getDiscountedPrice(X receipt) {
        return receipt.price - (receipt.price * receipt.discount);
    }

    default double computeTotal(X receipt) {
        double discountedPrice = getDiscountedPrice(receipt);
        return discountedPrice + (discountedPrice * receipt.tax);
    }

}
