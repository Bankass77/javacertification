package org.example.algortihme.interview.designpaterns.singleton;

public class SingletonWithDoubleLocking {
    private static  SingletonWithDoubleLocking instance;
    private SingletonWithDoubleLocking() {}

    public static  SingletonWithDoubleLocking getInstance() {
        if (instance == null) {
            // Synchronized block code
            synchronized (SingletonWithDoubleLocking.instance){
                if (instance == null) {
                    //Initialize only if instance is null
                    instance = new SingletonWithDoubleLocking();
                }
            }
        }
        return instance;
    }
}
