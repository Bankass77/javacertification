package org.example.java17.chapter8;

public class Receipt   implements  ReceiptPrinter{

    String item;
    double price;
    double discount;
    double tax;

    public Receipt( String item,  double price,  double discount,  double tax) {
        this.item = item;
        this.price = price;
        this.discount = discount;
        this.tax = tax;
    }


    public  Receipt(Receipt receipt){
        item= receipt.item;
        price= receipt.price;
        discount= receipt.discount;
        tax= receipt.tax;
    }

    @Override
    public void print(final Receipt receipt) {

    }
}
