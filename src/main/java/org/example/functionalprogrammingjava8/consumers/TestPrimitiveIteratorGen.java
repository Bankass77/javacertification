package org.example.functionalprogrammingjava8.consumers;

import java.util.function.IntConsumer;

public class TestPrimitiveIteratorGen {
    public static void main(String[] args) {
        IntIteratorGen iteratorGen = new IntIteratorGen(1, 2, 3, 4, 5);
        iteratorGen.forEachRemaining((IntConsumer) System.out::println);
    }
}
