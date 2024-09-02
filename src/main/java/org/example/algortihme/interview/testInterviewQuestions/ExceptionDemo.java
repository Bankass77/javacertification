package org.example.algortihme.interview.testInterviewQuestions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionDemo {
    public void readFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            lines.stream()
                    .forEach(System.out::println);
        }
        catch (Exception e) {
            System.out.println("Exception occurred.");
        }
       /* catch (IOException e) {
            System.out.println("IOException occurred.");
        }*/
    }
}
