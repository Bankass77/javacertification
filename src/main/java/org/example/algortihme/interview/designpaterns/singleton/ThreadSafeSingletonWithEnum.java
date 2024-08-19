package org.example.algortihme.interview.designpaterns.singleton;

public enum ThreadSafeSingletonWithEnum {
    SINGLETON_INSTANCE;
    public void display(){
        System.out.println("Thread-safe singleton display");
    }

    public static void main(String[] args) {
       ThreadSafeSingletonWithEnum.SINGLETON_INSTANCE.display();
    }
}
