package org.example.algortihme.interview.designpaterns.observer;

/**
 * Subject class
 */
public interface Subject {
    /**
     * This method is used to subscribe observers, we can say register the observers so that if there is a change
     * in the state of the subject, all these observers should get notified
     *
     * @param observer defines an updating interface for objects that should be notified of changes in a subject.
     */
    public void registerObserver(Observer observer);

    /**
     * @param observer defines an updating interface for objects that should be notified of changes in a subject.
     */
    public void removeObserver(Observer observer);

    /**
     * this method notifies the registered observers when there is a change in the state of the subject
     */
    public void notifyObservers();

    /**
     * This method, its job is to return the details of the subject
     * @return subject details
     */
    public String subjectDetails();
}
