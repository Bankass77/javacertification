package org.example.java17.chapter7.polymorphisme;

public class EmperorPenguin extends  Penguin{
    public  int getHeight(){    // la méthode getHeigh() a été overridé dans la sous classe, ce qui signifie que tous les appels ont été ramplcé au moment du runtime
        return  8;
    }

    // Pour faire appel à la methode getHeight de la super classe Parent Penguin pour afficher 3, sinon on affiche 8

    @Override
    public void printInfo() {
        System.out.println(super.getHeight());
    }

    public static void main(String[] args) {
        new EmperorPenguin().printInfo();
    }
}
