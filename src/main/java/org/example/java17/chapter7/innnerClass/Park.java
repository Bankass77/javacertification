package org.example.java17.chapter7.innnerClass;

// classe interne static
public class Park {
    static class Ride{
        private final int price= 6;
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);

    }
}
