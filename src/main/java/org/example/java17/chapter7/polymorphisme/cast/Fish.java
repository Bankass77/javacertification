package org.example.java17.chapter7.polymorphisme.cast;

public class Fish {
    public static void main(String[] args) {

        Fish fish= new Fish();
        //Bird bird =(Bird) fish ; // ne compile pas  car Fish et Bird n'ont aucune relation de type
    }
}
