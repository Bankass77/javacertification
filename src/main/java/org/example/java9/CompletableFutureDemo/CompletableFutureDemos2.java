package org.example.java9.CompletableFutureDemo;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class CompletableFutureDemos2 {

    static Logger logger = Logger.getLogger(CompletableFutureDemos2.class.getName());

    public static void main(String[] args) {

        // Création et exécution d'une tâche asynchrone ave la méthode runAsync, qui ne retourne le résultat de la tâche exécutée.
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

            logger.info("Tâche executée dans un thread séparé.");
        });

        // Appel de Completion Stages: Permet de définir des actions à exécuter lorsque la tâche est terminée (par exemple, thenApply, thenAccept, thenRun).
        future.thenAccept(System.out::println);

        // Création et exécution d'une tâche asynchrone ave la méthode sypplyAsync, qui retourne un résultat de la tâche exécutée.
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {

            return 42;
        });

        // Transformation du Resultat
        CompletableFuture<String> transformedIntegerCompletableFuture = integerCompletableFuture.thenApply(value -> "Transformed: " + value);
        transformedIntegerCompletableFuture.thenAccept(System.out::println);

        //Combinaison de Futures
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 50);
        CompletableFuture<Integer> combineFutures = future1.thenCombine(future2,
                Integer::sum);  //equivaut à écrire : CompletableFuture<Integer> combineFutures = future1.thenCombine(future2, (result1, result2) -> result1+ result2)
        combineFutures.thenAccept(System.out::println);

        // Attente de plusieurs futures
        CompletableFuture <String> transformedIntegerCompletableFuture1 = CompletableFuture.supplyAsync(() -> "Tâche 1");
        CompletableFuture<String> transformedIntegerCompletableFuture2 = CompletableFuture.supplyAsync(()-> "Tâche 2");

        CompletableFuture<Void> allOf= CompletableFuture.allOf(transformedIntegerCompletableFuture1, transformedIntegerCompletableFuture2);
        allOf.thenRun(()->{
            try {
                String result = transformedIntegerCompletableFuture1.get();
                String result2= transformedIntegerCompletableFuture2.get();
                logger.info("Resultats:" +result + " " + result2);
            }catch(Exception e) {
                e.printStackTrace();
            }
        });
        //Gestion des exceptions
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync( ()->{
            if(true) throw new RuntimeException("Exception thrown");
            return 34;
        });

        completableFuture.exceptionally(ex ->{
          logger.info("Exception capturée");
          ex.printStackTrace();
          return -1;
        }).thenAccept(result->logger.info("Result: "+result));

    }
}
