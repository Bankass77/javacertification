/*
package org.example.java10.optionalInterfaceEnhancement;

import org.example.java9.collectionsAPiUpdate.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OrElseThrowDemo {

    static List<Employee> empList = Arrays.asList(new Employee(104, "Bob Williams"),
            new Employee(101, "Johny Hallidays"),
            new Employee(103, "Alan Marsh"));

    public static void main(String[] args) {
        for (int id = 101; id <= 105; id++) {
            int localId = id;
            Optional<Employee> findEmpById = empList.stream().filter(employee -> employee.getEmpId() == localId).findFirst();

            try {
                System.out.print(findEmpById.orElseThrow()+ "\n");
            }catch (NoSuchElementException e) {
               System.out.print("Employee with Id: "  + id+ " not found!!" + "\n");
            }

        }
    }
}
*/
