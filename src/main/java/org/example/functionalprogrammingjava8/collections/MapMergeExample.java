package org.example.functionalprogrammingjava8.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;

public class MapMergeExample {
    public static void main(String[] args) {

        Map<String, MyClass> m = new TreeMap<>();
        m.put("k1", new MyClass(1, 2, "Dog"));

        BiFunction<MyClass, MyClass, MyClass> changeS = (ov, nv) -> new MyClass(ov.i1, ov.i2, nv.s);
        BiFunction<MyClass, MyClass, MyClass> changeI2 = (ov, nv) -> new MyClass(ov.i1, nv.i2, ov.s);

        System.out.println(m.merge("k1", new MyClass(0, 5, null), changeI2));

        System.out.println(m.merge("k1", new MyClass(0, 0, "Cat"), changeS));

        System.out.println(m.merge("k1", new MyClass(6, 7, "Bird"), changeS));

        System.out.println();

        m.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
