package org.example.algortihme.interview.designpaterns.observer;

/**
 * ConcreteObserver class
 */
public class SMSUsers implements Observer {
    private final Subject subject;
    private String description;
    private final String userInfo;

    public SMSUsers(Subject subject, String userInfo) {
        if (subject == null){
            throw new IllegalArgumentException("subject is null");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }
    @Override
    public void update(final String description) {
        this.description = description;
        display();
    }

    @Override
    public void subcribe() {
    System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + "...");
    this.subject.registerObserver(this);
    System.out.println("Subcribed successfully");
    }

    @Override
    public void unsubcribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + "...");
        this.subject.removeObserver(this);
        System.out.println("Unsubscribed successfully");

    }

    public void display(){
        System.out.println("["+ userInfo +"]" + description);
    }
}
