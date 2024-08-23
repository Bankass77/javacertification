package org.example.algortihme.interview.designpaterns.proxy;

/**
 * RealSubject class
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println(" call Request method ");
    }
}
