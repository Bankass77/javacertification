package org.example.algortihme.interview.designpaterns.strategy;

/**
 * This class CapTextFormatter format a text to upperCase
 */
public class CapTextFormatter implements TextFormatter {
    /**
     * Format the text to UpperCase
     *
     * @param text the text to format to UpperCase
     */
    @Override
    public void format(final String text) {
        System.out.println("CapTextFormatter: " + text.toUpperCase());
    }
}
