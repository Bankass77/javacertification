package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class MyIntsP implements Iterable<Integer> {

    int[] array;

    public MyIntsP(int... a) {

        this.array = Arrays.copyOf(a, a.length);
    }

    @Override
    public PrimitiveIterator.OfInt iterator() {
        return new IntIterP();
    }

    private class IntIterP implements PrimitiveIterator.OfInt {


        int cursor;

        public IntIterP() {
            this.cursor = 0;
        }

        @Override
        public int nextInt() {

            int i = 0;

            if (hasNext()) {

                i = array[cursor];
                cursor++;
            }
            return i;
        }

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }
    }

}
