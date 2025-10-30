package org.example.java17.chapter8.supplier;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GenerateWordsSentence {

    public static void main(String[] args) {

        Supplier<String> supplier= new Supplier<String>() {

            private  static  String [] words= "To be or not to be".split(" ");
            int index = 0;
            @Override
            public String get() {

                if (index < words.length) {
                    return words[index++]; // renvoi mot puis avance
                }
                return  null;  // plus de mots
            }
        };

        // On stocke les mots dans une ArrayList
        List<String> list= new ArrayList<>();

        while (true){
            String word= supplier.get();
            if (word == null){
                break;
            }
            list.add(word);
        }

        System.out.println(list);
    }
}
