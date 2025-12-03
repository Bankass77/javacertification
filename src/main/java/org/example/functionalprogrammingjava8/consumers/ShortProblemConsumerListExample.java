package org.example.functionalprogrammingjava8.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ShortProblemConsumerListExample {

    public static void main(String[] args) {
        List<Consumer<Number>> numeric= new ArrayList<>();

        numeric.add( x -> System.out.println(" value: " + x));
        numeric.add(x -> System.out.println("Double value: " + x.doubleValue()*2));
        numeric.add( x-> System.out.println("Type :" + x.getClass().getSimpleName()));

        // Tableau de Wrappers
         Number [] numbers= {Integer.valueOf(10), Double.valueOf(3.14), Long.valueOf(50L), Short.valueOf((short) 7)};

        // Utiliser les consumers sur chaque élément
        for (Number num: numbers){
            System.out.println("\nprocessing : " + num);
            numeric.forEach(c-> c.accept(num));
        }

    }
}
