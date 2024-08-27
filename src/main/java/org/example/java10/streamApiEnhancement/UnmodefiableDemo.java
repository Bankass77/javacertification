/*
package org.example.java10.streamApiEnhancement;

import org.example.java9.collectionsAPiUpdate.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodefiableDemo {

    public static void main(String[] args) {
        createUnmodifiableList();
        createUnmodifiableSet();
        createUnmodifiableMap();
    }

    public static Stream<Employee> getStream() {
        return Stream.of(new Employee(101, "Joy"), new Employee(102, "Bob"),
                new Employee(103, "John"));
    }

    private static void createUnmodifiableMap() {
        Employee employee = new Employee(101, "Joy");
        Employee employee2 = new Employee(102, "Bob");
        Employee employee3 = new Employee(103, "John");
       // Map<Object, Object> map = Stream.of(employee, employee2, employee3).collect(Collectors.toUnmodifiableMap(e -> e.getEmpId(), e -> e));
       // System.out.println("UnModifiable map  =>");
        //System.out.println(map);

        //unModifiableMap() with binary Function or merge function
        Map<Object, Object> empMap = Stream.of(employee, employee2, employee3).collect(Collectors.toUnmodifiableMap((i) -> (int) Math.random(), i -> i, (x, y) -> x + ", " + y));
        System.out.println("UnModifiable Map  =>");
        System.out.println(empMap);
    }

    private static void createUnmodifiableSet() {
        Set<Employee> empSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println("UnModifiable Set  =>");
        System.out.println(empSet);
        //empSet.add(new Employee(13, "Smith"));
    }

    private static void createUnmodifiableList() {

        List<Employee> emplList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println("UnModifiable List  =>");
        System.out.println(emplList);
        //emplList.add(new Employee(13, "Smith"));

    }

   // public  static <T,K,U> Collector <T,?,Map<K,U>> toUnmodifiableMap(Function<? super T,? extends  keyFunction> key, Function<? super T , ? extends valueFunction>) {}
}
*/
