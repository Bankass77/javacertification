package org.example.algortihme.interview.designpaterns.observer;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {

    private final List<Observer> observers;
    private String description;
    private final String subjectDescription;

    public CommentaryObject(List<Observer> observers, String subjectDescription) {
        this.observers = observers;
        this.subjectDescription = subjectDescription;
    }

    @Override
    public void setDescription(final String description) {
        this.description = description;
        notifyObservers();

    }

    @Override
    public void registerObserver(final Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(description);
        }

    }

    @Override
    public String subjectDetails() {
        return subjectDescription;
    }
}
