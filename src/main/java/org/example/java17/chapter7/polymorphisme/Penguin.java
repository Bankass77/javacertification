package org.example.java17.chapter7.polymorphisme;

public class Penguin {

    public int getHeight(){
        return 3;
    }

    public void printInfo(){
        System.out.println(this.getHeight());

       // System.out.println(super.getHeight());  // Ne compile pas, appel de la classe parent de Penguin avec le mot-clé super, et sa classe parent est Object.
    }
}
