package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class IntIterator implements PrimitiveIterator.OfInt {

    private int[] array;
    private int cursor;

    public IntIterator(int... a) {

        this.cursor = 0;
        this.array = Arrays.copyOf(a, a.length);

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
        return cursor <array.length;
    }
}
