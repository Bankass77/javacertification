package org.example.java12.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTeeingDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "John", 500),
                new Employee(102, "François", 2000),
                new Employee(103, "Amadou", 1000));
        HashMap<String, Double> empSummary = employeeList.stream().collect(Collectors.teeing(Collectors.averagingDouble(Employee::getEmpSalary), Collectors.counting(), (e1, e2) -> {
            HashMap<String, Double> map = new HashMap<>();
            map.put("Total Number of Employees", e2.doubleValue());
            map.put("Average Salary of employees", e1.doubleValue());
            return map;
        }));
        for (Map.Entry<String, Double> entry : empSummary.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "Value : " + entry.getValue().intValue());
        }
    }
}
