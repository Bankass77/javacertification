package org.example.algortihme.interview.designpaterns.strategy;

/**
 * TextEditor class hold a reference of TextFormatter interface.
 */
public class TextEditor {
    private final TextFormatter textFormatter;

    /**
     * TextEditor Constructor with one parameter
     * @param textFormatter instance of TextFormater
     */
    public TextEditor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    /**
     * Format a text and publish it.
     * @param text the text to format into lowerCase or UpperCase.
     */
    public void publishText(String text) {
        textFormatter.format(text);
    }
}
