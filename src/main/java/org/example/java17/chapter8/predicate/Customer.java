package org.example.java17.chapter8.predicate;

enum Education {ELEMENTARY, HIGHSCHOOL, BACHELORS, MASTERS, PHD}

public class Customer {
    String gender;
    String state;
    int age;
    Education ed;

    public Customer(final String gender, final String state, final int age, final Education ed) {
        this.gender = gender;
        this.state = state;
        this.age = age;
        this.ed = ed;
    }

    @Override
    public String toString() {
        return age + " year old " + gender + " from " + state + " with " + ed;
    }
}
