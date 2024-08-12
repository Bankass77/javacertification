package org.example.java9.collectionsAPiUpdate;

import java.util.List;

public class UnmodifiableList {

    public static void main(String[] args) {
        // Creation d'une Liste Vide d'employee
        List<Employee> employeeList = List.of();

        // Création d'une liste contenant un employee.
        List<Employee> employeeList1 = List.of(new Employee(101, "Pascal Blaise"));

        // Création d'une liste avec plusieurs employee
        List<Employee> employeeList2 = List.of(new Employee(102, "Pascal Blaise"), new Employee(103, "Paul François"), new Employee(104, "Abdoulaye Sissoko"),
                new Employee(105, "Daouda Diakité"), new Employee(106, "Fatoumata Diallo"), new Employee(107, "Idrissa Sacko"),
                new Employee(108, "Almamy Berthé"), new Employee(109, " Fanta Traoré"), new Employee(110, " Lamine Sacko"));

        System.out.println("Printing empty list");
        employeeList.forEach(System.out::println);

        System.out.println("Printing list of 1 element.");
        employeeList1.forEach(System.out::println);

        System.out.println("Printing list of multiple elements.");
        employeeList2.forEach(System.out::println);

        // Toute List crée avec les factory Method sont par défaut unmodifiable. On ne peut pas modifiér la List
        List<String> strList = List.of("John", "Dave", "Vivian");

        // On voulant modifié la List on lève l'exception du type "UnsupportedOperationException
        strList.add("Emma");

        System.out.println(strList);

    }

}
