package org.example.java10.typeinference;

public class TypeInferencePolymorphism {

    public static void main(String[] args) {
        var p1= new Person();
        var p2= new SalesPerson();
        p1 = p2;
        //p2 = p1;  // La référence de la sous classe ne peut pas pointer vers la super classe.
    }

}
