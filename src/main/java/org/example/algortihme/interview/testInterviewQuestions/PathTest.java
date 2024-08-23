package org.example.algortihme.interview.testInterviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathTest {

    public static void main(String[] args) {
	/*
	 * What is the problem with this code?
	 * final Path path = Paths.get(...);
	 * Files.lines(path).forEach(System.out::println);
	 */
	final Path path = Paths.get("../javacertification/README.md");

	// Files.lines(path) retourne toujours un Stream, qu'il faut toujours fermer
	// dans un try with resources
	// Le bloc try-with-resources est utilisé pour garantir que le flux est fermé
	// après l'exécution du bloc. Cela permet d'éviter les fuites de ressources.
	try (final Stream<String> stream = Files.lines(path)) {

	    stream.forEach(System.out::println);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
