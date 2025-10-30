package org.example.java17.chapter8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDate> supplier = LocalDate::now;
        Supplier<LocalDate> supplier1 = () -> LocalDate.now();

        LocalDate d1 = supplier.get();
        LocalDate d2 = supplier1.get();

        System.out.println(d1);
        System.out.println(d2);


        Supplier<StringBuilder> stringBuilderSupplier = StringBuilder::new;
        Supplier<StringBuilder> stringBuilderSupplier1= () -> new StringBuilder();

        System.out.println(stringBuilderSupplier.get());  // Empty String
        System.out.println(stringBuilderSupplier1.get());  // Empty String

        Supplier<ArrayList<String>> arrayListSupplier = ArrayList::new;
        ArrayList<String> strings= arrayListSupplier.get();
        System.out.println(strings);  // []

        System.out.println(arrayListSupplier);
    }
}
