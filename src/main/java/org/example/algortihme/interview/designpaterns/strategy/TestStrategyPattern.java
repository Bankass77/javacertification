package org.example.algortihme.interview.designpaterns.strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        TextFormatter textFormatter = new CapTextFormatter();
        TextEditor textEditor = new TextEditor(textFormatter);
        textEditor.publishText("Testing text in caps formatter");

        textFormatter = new LowerTextFormatter();
        textEditor = new TextEditor(textFormatter);
        textEditor.publishText("Testing text in lower formatter");
    }
}
