package org.example.algortihme.interview.designpaterns.proxy;

/**
 * Proxy class
 */
public class Proxy implements Subject {
    private final RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
