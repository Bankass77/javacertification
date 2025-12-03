package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;

import java.util.PrimitiveIterator;
import java.util.function.IntConsumer;

public class MyInts implements Iterable<Integer> {

    int[] array;

    public MyInts(int... a) {
        this.array = Arrays.copyOf(a, a.length);
    }

    @Override
    public PrimitiveIterator<Integer, IntConsumer> iterator() {
        return new IntIter();
    }

    private class IntIter implements PrimitiveIterator<Integer, IntConsumer> {


        int cursor;

        public IntIter() {
            this.cursor = 0;
        }

        @Override
        public void forEachRemaining(final IntConsumer action) {

            while (hasNext()) {
                action.accept(array[cursor]);
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Integer next() {

            int i = 0;

            if (hasNext()) {

                i = array[cursor];
                cursor++;
            }
            return i;
        }
    }

    public static void main(String[] args) {


        MyInts myInts = new MyInts(1, 2, 3, 4, 5);
        System.out.println("===============appel de forEach sur un Array =========================");
        myInts.forEach(x -> System.out.println(x));

        System.out.println("===============appel de iterator et forEachRomainning sur Array =========================");
        // ou on peut aussi faire
        myInts.iterator().forEachRemaining((IntConsumer) x -> System.out.println(x));
    }
}
