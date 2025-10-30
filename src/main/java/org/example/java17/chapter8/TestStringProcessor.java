package org.example.java17.chapter8;

public class TestStringProcessor {

    public static void main(String[] args) {
        NamedStringProcessor namedStringProcessor = new NamedStringProcessor();
        StringProcessor anonSP = new StringProcessor() {
            @Override
            public String process(final String x) {
                return x.toUpperCase();
            }
        };

        System.out.println(namedStringProcessor.process("hello"));
        System.out.println(anonSP.process("hello"));

        StringProcessor toLowerCase= new StringProcessor() {
            @Override
            public String process(final String x) {
                return x.toLowerCase();
            }
        };

        StringProcessor toUpperCase = new StringProcessor() {
            @Override
            public String process(final String x) {
                return x.toUpperCase();
            }
        };

        String s = toLowerCase.process("FUNCTIONALINTERFACES");
        System.out.println(s);

        System.out.println("Lower case : "+ StringProcessor.isLowerCase(s));
        System.out.println("Upper case :" + StringProcessor.isUpperCase(s));

        String t = toUpperCase.process(s);
        System.out.println("\n "+ t);
        System.out.println("Lower case : "+ StringProcessor.isLowerCase(t));
        System.out.println("Upper case :" + StringProcessor.isUpperCase(t));

    }




}
