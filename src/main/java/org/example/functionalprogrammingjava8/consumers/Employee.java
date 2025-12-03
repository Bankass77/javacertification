package org.example.functionalprogrammingjava8.consumers;

public class Employee {
    String name;
    double baseSalary;
    double bonus;
    double multiplier;

    public Employee(final String name, final double baseSalary, final double multiplier, final double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.multiplier = multiplier;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return name + ": base salary=" + baseSalary + " bonus = " + bonus;
    }
}
