package org.example.java8.interfaces;

public interface ZooRenovation {

    public String projectName();

    abstract String status();

    default void printStatus() {
        System.out.println("The " + projectName() + "project" + status());  // projectName() et status() ont le même modificateurs( abstract et public et peuvent êter appélé par la methode déclarée avec default printSattus()
    }
}
