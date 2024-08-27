package org.example.algortihme.interview.designpaterns.singleton;

public class SingletonUsingSynchronized {
    private static SingletonUsingSynchronized instance;
    private SingletonUsingSynchronized() {}

    //Synchronized getInstance()
    public synchronized static SingletonUsingSynchronized getInstance() {
        if (instance == null){
            //If instance is null, initialize
            instance = new SingletonUsingSynchronized();
        }
        return instance;
    }
}
