package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.function.IntConsumer;

public class IntIteratorGen implements PrimitiveIterator<Integer, IntConsumer> {
    private int[] array;
    private int cursor;

    public IntIteratorGen(int... a) {
        this.array = Arrays.copyOf(a, a.length);
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
