package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class LongIterator implements PrimitiveIterator.OfLong {

    long[] array;
    int cursor;

    public LongIterator(long... a) {

        this.cursor = 0;
        this.array = Arrays.copyOf(a, a.length);
    }

    @Override
    public long nextLong() {

        long l = 0;

        if (hasNext()) {

            l = array[cursor];
            cursor++;
        }
        return l;
    }

    @Override
    public boolean hasNext() {
        return cursor < array.length;
    }
}
