package org.example.algortihme.interview.designpaterns.singleton;

public class SingletonWithStaicField {
    private final static SingletonWithStaicField INSTANCE = new SingletonWithStaicField();
    private SingletonWithStaicField() {}
    public static SingletonWithStaicField getInstance() {
        return  INSTANCE;
    }
    public void display(){
        System.out.println("Displaying SingletonWithStaicField");
    }
}
