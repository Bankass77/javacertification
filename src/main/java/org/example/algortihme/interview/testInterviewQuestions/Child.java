package org.example.algortihme.interview.testInterviewQuestions;

public class Child  extends Parent {
     Child (){
         //super();  permet d'appler le constructeur de la classe Parent
         System.out.println("Child constructor");
     }

    public static void main(String[] args) {
        Child child = new Child();
         System.out.println(child);
    }
}
