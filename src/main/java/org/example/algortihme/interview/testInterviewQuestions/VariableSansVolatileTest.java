package org.example.algortihme.interview.testInterviewQuestions;

public class VariableSansVolatileTest {
    /*
     * "Quand utilisez-vous les variables volatile ? Lorsqu'une variable membre est accédée par plusieurs threads et que l'on veut que la valeur d'un champ volatile soit visible par tous les lecteurs (notamment les autres threads) après qu'une opération d'écriture sur cette variable soit terminée."
     * Explication : En Java, une variable déclarée avec le mot-clé volatile
     * garantit que toute modification apportée à cette variable par un thread est
     * immédiatement visible par tous les autres threads. Cela signifie qu'un thread
     * qui lit la valeur d'une variable volatile voit toujours la version la plus
     * récente de cette variable, même si un autre thread vient juste de la
     * modifier. Les variables volatile sont utilisées dans les situations où
     * plusieurs threads doivent accéder à une même variable et où il est crucial
     * que chaque thread voit la dernière valeur mise à jour. Sans le mot-clé
     * volatile, les threads peuvent utiliser une copie locale de la variable en
     * cache, ce qui peut entraîner des incohérences dans les données partagées. En
     * résumé, on utilise une variable volatile lorsque plusieurs threads partagent
     * une variable et que l'on souhaite s'assurer que chaque modification de cette
     * variable est immédiatement visible par tous les threads.
     */

    public static void main(String[] args) {

	Task task = new Task();
	Worker worker = new Worker(task);
	worker.start();
	task.doWork();
    }
}
