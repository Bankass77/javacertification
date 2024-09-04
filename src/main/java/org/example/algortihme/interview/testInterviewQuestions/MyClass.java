package org.example.algortihme.interview.testInterviewQuestions;

/**
 * Ordre d'appel des constructeurs, et utilisation de this dans le constructeur de la classe
 */
public class MyClass {

    // Constructeur sans paramètre
    MyClass() {
        this(10); // Permet d'aller le constructeur avec paramètre (MyClass(int x)) de la class MyClass
        System.out.println("MyClass Constructor with no parameters");
    }

    //Constructeur avec un paramètre
    MyClass(int x) {
        System.out.println("MyClass Constructor with parameters :" + x);
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.toString());
    }
}
