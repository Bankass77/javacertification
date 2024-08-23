package org.example.algortihme.interview.testInterviewQuestions;

public class Task2 {
    /*
     * En ajoutant le mot-clé volatile à la variable done, nous garantissons 
     * que toutes les modifications apportées à cette variable dans un thread 
     * seront immédiatement visibles par tous les autres threads. 
     * Le thread Worker verra la mise à jour de done à true dès qu'elle se produira dans le thread qui exécute doWork().
     *  Ainsi, le thread Worker pourra sortir de la boucle et terminer proprement.
     */
    private volatile boolean done = false;
    
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
