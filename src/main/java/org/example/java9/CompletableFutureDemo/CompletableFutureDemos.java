package org.example.java9.CompletableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Classe démontrant l'utilisation de CompletableFuture avec des délais et des valeurs par défaut en cas de timeout.
 */
public class CompletableFutureDemos {

    static Logger logger = Logger.getLogger(CompletableFutureDemos.class.getName());

    public static void main(String[] args) {

        completedOnTime();
        orTimeOut();
        delayedExecutor();
    }

    //Implementation de la méthode completeOnTime()

    /**
     * Cette méthode permet de spécifier une valeur par défaut que le CompletableFuture renverra si la tâche n'est pas terminée dans un délai spécifié. Au lieu
     * de lever une exception, la future sera complétée avec cette valeur par défaut.
     */
    private static void completedOnTime() {

        int value1 = 20;
        int value2 = 30;

        //La méthode supplyAsync() est utilisée pour exécuter une tâche asynchrone qui renvoie un résultat.
        // Elle accepte un Supplier qui fournit le résultat de la tâche.
        CompletableFuture.supplyAsync(() -> {

            try {
                // Simuler une tâche longue de 5 secondes
                TimeUnit.SECONDS.sleep(5);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            return value1 + value2;

            // Si la tâche n'est pas terminée dans les 2 secondes, compléter avec la valeur 10
        }).completeOnTimeout(10, 2, TimeUnit.SECONDS).thenAccept(result -> {
            logger.info("Result from CompleteOnTime ==>" + " " + result);
        });

        // Attendre 10 secondes pour s'assurer que le programme ne se termine pas avant l'exécution de la tâche asynchrone
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Implementation de la méthode orTimeOut()
    //Cette méthode permet de spécifier un délai après lequel
    // le CompletableFuture se complétera automatiquement avec une exception TimeoutException
    // si la tâche n'est pas terminée.
    private static void orTimeOut() {
        int value3 = 60;
        int value4 = 30;

        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            return value3 + value4;
        });

        completableFuture.orTimeout(1, TimeUnit.SECONDS).whenComplete((result, exception) -> {
            logger.info("Result from OrTimeOut ==>"+ " " + result);

            if(exception != null) {
                exception.printStackTrace();
                logger.severe("Job not completed on time");
            }
        });

        // Attendre 10 secondes pour s'assurer que le programme ne se termine pas avant l'exécution de la tâche asynchrone
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    //implementation of delayedExecutor()
    private static void delayedExecutor() {

        int value1 = 100;
        int value2 = 200;
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> value1 + value2, CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS))
                .thenAccept(result -> {
                    logger.info("Result from delayedExecutor ==>" + " " + result);
                });

        // Attendre 10 secondes pour s'assurer que le programme ne se termine pas avant l'exécution de la tâche asynchrone
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}
