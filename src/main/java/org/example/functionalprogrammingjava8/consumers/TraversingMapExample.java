package org.example.functionalprogrammingjava8.consumers;

import java.util.TreeMap;

public class TraversingMapExample {
    public static void main(String[] args) {
        TreeMap<String, Double> employeeSalaries = new TreeMap<>();
        employeeSalaries.put("Joe Smith ", 100000.0);
        employeeSalaries.put("Maggie Jones", 110000.0);
        employeeSalaries.put("Larry Rodriguez", 1050000.0);

        employeeSalaries.forEach((x, y) -> System.out.println(x + " makes $" + y + " annually."));
    }
}
