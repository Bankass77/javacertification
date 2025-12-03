package org.example.functionalprogrammingjava8.comparator;

public class Student {
    String name;
    Integer id;
    double gpa;

    public Student(final String name, final Integer id, final double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + gpa;
    }
}
