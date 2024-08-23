package org.example.algortihme.interview.designpaterns.proxy;

public class ClientProxy {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new Proxy(realSubject);
        subject.request();
    }
}
