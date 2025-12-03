package org.example.functionalprogrammingjava8.comparator;

import java.util.Comparator;
import java.util.function.ToLongFunction;

public class LongWrapper {
    Long l;

    public LongWrapper(Long a) {
        this.l = a;
    }

    public static void main(String[] args) {
        LongWrapper l1= new LongWrapper(4L);
        LongWrapper l2= new LongWrapper(4L);
        ToLongFunction<LongWrapper> lKey = x -> x.l;
        System.out.println(Comparator.comparingLong(lKey).compare(l1,l2));
    }
}
