package org.example.algortihme.interview.testInterviewQuestions;

public class Worker2 extends Thread{
    private Task2 task2;

    public Worker2(Task2 task2) {
	this.task2 = task2;
    }
    @Override
    public void run() {
	while (!task2.isDone()) {
	    // Boucle en attente de la fin du travail
	}
	System.out.println("Le travail est terminé, le thread se termine.");
    }

}
