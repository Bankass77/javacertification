/*
package org.example.java9.collectionsAPiUpdate;

import java.util.Map;

public class UnmodifiableMap {

    public static void main(String[] args) {

        // Creation d'un ensemble vide
        Map<Integer, Employee> employeeMap = Map.of();

        //Creation d'un Map avec un seul élément
        Map<Integer, Employee> employeeMap2 = Map.of(1,
                new Employee(101, "Francesca Cescu"));

        //Map.of() est pratique pour des Map plus petites et jusqu'à 10 paires clé-valeur
        Map<Integer, Employee> employeeMap3 = Map.of(1,
                new Employee(101, "Francesca ERETTT"), 2,
                new Employee(102, "Emmanuel Macron"), 3,
                new Employee(103, "François Hollande"), 4,
                new Employee(104, "Jacques Chirac"), 5,
                new Employee(105, " François Mitterand"), 6,
                new Employee(106, "Charles De Gaulle"));

        System.out.println("========Printing Empty Map========");
        employeeMap.forEach((k, v) -> System.out.println("Key=" + k + ": " + "Value=" + v));

        System.out.println("========Printing Map with one element ========");
        employeeMap2.forEach((k, v) -> System.out.println("Key=" + k + ": " + "Value=" + v));

        System.out.println("========Printing Map with multiple  elements ========");
        employeeMap3.forEach((k, v) -> System.out.println("Key=" + k + ": " + "Value=" + v));

        //Creating arbitrary number of elements in Map
        //Map.ofEntries() est utile pour des Map plus grandes et plus lisibles
        Map<Integer, Employee> employeeMap4 = Map.ofEntries(
                Map.entry(1, new Employee(101, "William Smith")),
                Map.entry(2, new Employee(2, "Rakesh Ahuja")),
                Map.entry(3, new Employee(3, "David MOORE")));
        System.out.println("========Printing Map using Map.ofEntries ========");
        employeeMap4.forEach((k, v) -> System.out.println("key=" + k + ":" + "Value=" + v));

    }

}
*/
