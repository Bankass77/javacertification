package org.example.functionalprogrammingjava8.collections.problem;

import java.util.HashMap;
import java.util.Map;

public class CarMapExample {

    public static void main(String[] args) {

        Map<String, Car> carMap = new HashMap<>();
        carMap.merge("S123", new Car("S123", "Hyndai Excel"), (oldvalue, newValue) -> oldvalue);
        carMap.merge("S456", new Car("S456", "Buick Skylark"), (oldValue, newValue) -> oldValue);
        carMap.merge("S789", new Car("S789", "Toyota Prius"), (oldValue, newValue) -> oldValue);

        System.out.println("Après insertion :");
        carMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("=======Change the make of entry “S123” to “Chevy”===========");

        carMap.merge("S123", new Car("Chevy", carMap.get("S123").model), (oldvalue, newValue) -> {
            oldvalue.make = newValue.make;
            return oldvalue;
        });

        carMap.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("=======Change the model of entry “S123” to “Vega”===========");

        carMap.merge("S123", new Car(carMap.get("S123").make, "Vega"), (oldValue, newValue) -> {

            oldValue.model = newValue.model;
            return oldValue;
        });
        carMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("=======Remove the Toyota Prius from the map===========");

        carMap.remove("S789");
        carMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
