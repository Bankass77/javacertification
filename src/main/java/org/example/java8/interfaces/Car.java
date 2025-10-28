package org.example.java8.interfaces;

public class Car  implements Searchable {

    private String name;
    private String color;

    @Override
    public boolean test(final Car car) {
        return false;
    }


    public static void main(String[] args) {
        Searchable searchable = car -> car.test(car);
        System.out.println(searchable);

    }
}
