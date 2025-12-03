package org.example.functionalprogrammingjava8.supplier;

import java.util.function.Supplier;

public class ShortProblemFibonacciSequence implements Supplier<Integer> {

    private int prev = 0;  // f(n-2)
    private int curr = 1;  // f(n-1)
    private boolean firtCall = true;

    @Override
    public Integer get() {

        if (firtCall) {
            firtCall= false;
            return 0;  // f(0)
        }

        int result= curr; // f(n)
        int next = prev + curr;  // calcule f(n+1)
        prev = curr;             // shift
        curr= next;
        return result;
    }

    public static void main(String[] args) {
        Supplier<Integer> fib = new ShortProblemFibonacciSequence();

        // On génère les 10 premiers termes
        for (int i = 0; i < 10; ++i) {
            int value = fib.get();
            System.out.printf(value + " ");
        }
    }
}
