package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class DoubleIterator implements PrimitiveIterator.OfDouble {

    private double[] array;
    int cursor;


    public DoubleIterator(double... a) {

        this.cursor = 0;
        this.array = Arrays.copyOf(a, a.length);
    }

    @Override
    public double nextDouble() {

        double d =0;
        if (hasNext()) {

            d = array[cursor];
            cursor++;
        }
        return d;
    }

    @Override
    public boolean hasNext() {
        return cursor < array.length;
    }
}
