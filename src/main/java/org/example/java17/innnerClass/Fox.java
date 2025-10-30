package org.example.java17.innnerClass;

// classe d'instance interne private
public class Fox {

    private class Den {

    }

    public void goHome(){
        new Den();   // compile
    }
    public static  void visitFriend(){
      //  new Den(); // ne compile pas du fait que le constructeur Den () classe non- static est appélée dans une méthode d'instance static
    }

    public class Squirrel{
        public void visitFox(){
            new Den();   // ne compile pas ce n'est pas une méthode d'instance de Fox, et Den() n'est visible pour la classe Squirrel
        }
    }
}
