package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator.Car;


public class TraversingObejectUsingIteratorsExemple {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(new Car("Nissan", 255000), new Car("Chevrolet", 340000), new Car(" Hyundai", 650000));

        System.out.println("============call Iterator  with while loop=================");
        Iterator<Car> it = cars.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("============ForEachRemaining of Consumer=================");
        // l'Iterator, le While, et la boucle peut être remplacer l'interface Consumer
        cars.iterator().forEachRemaining(x -> System.out.println(x));
    }
}
