package org.example.functionalprogrammingjava8.consumers;

import java.util.function.IntConsumer;

public class TestMyIntsP {

    public static void main(String[] args) {

        MyIntsP myIntsP = new MyIntsP(1, 2, 3, 4, 5);

        myIntsP.forEach(x -> System.out.println(x));


         System.out.println();
        myIntsP.iterator().forEachRemaining((IntConsumer) x -> System.out.println(x));
    }
}
