package org.example.algortihme.interview.testInterviewQuestions;

import java.io.IOException;
import java.io.Reader;

/**
 * This class defines a stream printer
 */
public class StreamPrinter {
    /**
     * Reads from the given reader and prints to stdout.
     */
    void print(Reader reader) throws IOException {
        // Use try-with-resources to ensure the reader is closed properly
        try (reader) {
            int code;
            while ((code = reader.read()) != -1) {
                System.out.print((char) code);
            }
        } catch (IOException e) {
            // Handle exception or rethrow it
            throw new IOException("An error occurred while reading from the reader.", e);
        }
    }
}
