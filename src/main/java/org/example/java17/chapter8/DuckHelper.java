package org.example.java17.chapter8;

public class DuckHelper {

    public static void teacher(String name, LearnToSpeak trainer) {
        trainer.speak(name);
    }

    public static void makeSound(String sound) {

        LearnToSpeak learnToSpeak = s -> System.out.println(s);  // remplacer par
        LearnToSpeak learn = System.out::println;
        DuckHelper.teacher(sound, learnToSpeak);
    }
}
