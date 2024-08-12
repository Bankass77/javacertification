package org.example.java9.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java9OptionalFeatures {

    static List<Employee2> employees = Arrays.asList(new Employee2("Bab Williams", 45, 7000.0), new Employee2("John Hiscus", 65, 8000.0),
            new Employee2("Jack Travolta", 22, 10000.00), new Employee2("Brayan Waugh", 29, 9000.00));

    public static void main(String[] args) {

        Optional<Employee2> maxSalaryEmployee = employees.stream().filter(e -> e.getSalary() > 5000.00).findFirst();

        //Avec Java 8 , on faisait

        if(maxSalaryEmployee.isPresent()) {
            System.out.println(maxSalaryEmployee);
            System.out.println("Condition is not matched");
        }

        // Avec Java 9, on pourra utilisé la méthode ifPresentOrElse()
        System.out.println("Vérification de la disponibilité de l'objet en utilisant la méthode ifPresentOrElse()");

        maxSalaryEmployee.ifPresentOrElse(e -> System.out.println(e.getName()), () -> System.out.println("Employee not found"));

        // Creation of Supplier to supply the default object
        Supplier<Optional<Employee2>> supplierEmployee = () -> Optional.of(new Employee2("Bab Williams", 45, 7000.0));

        // Working with or() in Optional
        System.out.println("Supplying the default object if object not found---->");

        maxSalaryEmployee = maxSalaryEmployee.or(supplierEmployee);

        Employee2 employee2 = maxSalaryEmployee.get();
        System.out.println(employee2);

        // Creatingf of list consisting non-null and null object

        List<Optional<Employee2>> optionalEmployees = Arrays.asList(Optional.of(new Employee2("Mark Root", 78, 7999.00)),
                Optional.of(new Employee2("Daniel Martin", 25, 17000.00)), Optional.empty());


        // Java 8 to create list of non-null objects using isPresent()
       List<Employee2> filteredListJava8= optionalEmployees.stream().flatMap(o->o.isPresent() ? Stream.of(o.get()): Stream.empty()).toList();
        //  List<Employee2> filteredListJava8 = optionalEmployees.stream().flatMap(o -> o.stream().flatMap(Stream::of)).toList();

        System.out.print("\nList of non-null Employees with java 8 isPresent () Method--->");
        System.out.print(filteredListJava8);

        // Java 8 to create list of non-null objects using isPresent()
        List<Employee2> filteredListJava9= optionalEmployees.stream().flatMap(Optional::stream).toList();

        System.out.print("\nList of non-null Employees with java 9--->");
        System.out.print(filteredListJava9);

    }

}
