package org.example.algortihme.interview.designpaterns.observer;

import java.util.ArrayList;

/**
 * Client code
 */
public class TestOberver {
    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Soccer Match [2024AUG24]");

        Observer observer = new SMSUsers(subject, "Adam Warner [New York]");
        observer.subcribe();

        System.out.println();

        Observer observer1 = new SMSUsers(subject, "Tim Ronney [London]");
        observer1.subcribe();

        CommentaryObject commentaryObject = (CommentaryObject) subject;
        commentaryObject.setDescription(" Welcome to live Soccer match");
        commentaryObject.setDescription(" Current score 0-0");

        System.out.println();

        observer1.unsubcribe();

        System.out.println();

        commentaryObject.setDescription(" It's a goal!!");
        commentaryObject.setDescription(" Current score 1-0");

        Observer observer2 = new SMSUsers(subject, "Marrie [Paris]");
        observer2.subcribe();

        System.out.println();

        commentaryObject.setDescription(" It's another goal!!");
        commentaryObject.setDescription(" Half-time score 2-0");
    }
}
