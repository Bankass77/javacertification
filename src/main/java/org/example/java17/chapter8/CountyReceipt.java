package org.example.java17.chapter8;

public class CountyReceipt extends Receipt{
    double countyTax;

    public CountyReceipt( Receipt receipt,  double countyTax) {
        super(receipt);
        this.countyTax = countyTax;
    }
}
