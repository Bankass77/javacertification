package org.example.functionalprogrammingjava8.consumers;

import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class TestBiConsumerSpecilization {
    public static void main(String[] args) {

        ObjIntConsumer<String> oic = (x, y) -> System.out.println(x + "=" + y);

        ObjLongConsumer<String> loc = (x, y) -> System.out.println(Long.parseLong(x) + y);

        ObjDoubleConsumer<String> odc = (x, y) -> System.out.println(x + Double.valueOf(y).toString());

        oic.accept("Value", 4);
        loc.accept("7", 2L);
        odc.accept("DBL", 4.1);

    }
}
