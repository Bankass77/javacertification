package org.example.algortihme.interview.testInterviewQuestions;import org.example.java9.StreamApiUpdate.TakeWhileDemo;

public class Worker extends Thread {
    private Task task;

    public Worker(Task task) {
	this.task = task;
    }
    @Override
    public void run() {
	while (!task.isDone()) {
	    // Boucle en attente de la fin du travail
	}
	System.out.println("Le travail est terminé, le thread se termine.");
    }

}
