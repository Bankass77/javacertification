package org.example.algortihme.interview.testInterviewQuestions;

/*
 * Imaginons un scénario où nous avons un programme qui utilise plusieurs threads pour vérifier 
 * si un certain travail est terminé. Nous avons une variable `done` qui indique si le travail est 
 * terminé ou non. Les threads vérifieront la valeur de done et continueront à tourner en boucle 
 * tant que `done` est false.
 * 
 * Task sans volatile
 */
public class Task {
    /*
     * Il est possible que le thread Worker ne voit jamais que la variable done est
     * mise à jour par doWork() dans un autre thread. Le thread Worker peut
     * continuer à tourner en boucle indéfiniment, car la valeur de done pourrait
     * être mise en cache par le thread et ne jamais être rechargée.
     */
    private boolean done = false;

    public void doWork() {
	System.out.println("Travail en cours...");
	try {
	    Thread.sleep(3000);// simule un travail prenant 3 secondes
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	}
	done = true; // travail terminé
	System.out.println("Travail terminé!");
    }

    public boolean isDone() {
	return done;

    }

}
