package org.example.algortihme.interview.designpaterns.strategy;

/**
 * This class LowerTextFormatter format a text to lowercase.
 */
public class LowerTextFormatter implements TextFormatter {

    /**
     * Format a text to lowerCase
     *
     * @param text the text to format to lowerCase
     */
    @Override
    public void format(final String text) {
        System.out.println("LowerTextFormatter: " + text.toLowerCase());
    }
}
