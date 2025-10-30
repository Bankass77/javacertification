package org.example.java17.chapter7.polymorphisme.instanceOf;

public class CapyBara extends Rodent {

    public static void main(String[] args) {

        Rodent rodent = new Rodent();
       // var capyBara= (CapyBara)rodent;  // Casting 'rodent' to 'CapyBara' will produce 'ClassCastException' for any non-null value, on pourra le remplacé par

        if (rodent instanceof  CapyBara c ){
             // Do stuff
        }
    }
}
