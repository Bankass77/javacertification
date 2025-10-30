package org.example.java17.chapter7.polymorphisme;

public class Lemur extends Primate implements HasTail {
    @Override
    public boolean istailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.istailStriped());

        Primate primate = lemur;

        System.out.println(primate.hasHair());


        HasTail hasTail1 = new Lemur();
        // System.out.println(hasTail1.age);  // ne compile
        //hasTail1  a directemeent acces seuelement à la méthode define avec l'interface HasTail; cepenedant, il n'a pas connaissance de la variable age qui fait parti de l'objet

        Primate primate1 = new Lemur();
        //System.out.println(primate1.isTailStriped()); // ne compile pas : la référence primate a accès directement seulement à la méthode defini dans la classe Primate, et il n'a pas un accès directe à la méthode isTailStriped () de l'inteface

        Object lemurObject= lemur;  // On reaffecté lemur à java.lang.Object puis que tous les objets héritent de lui
    }
}
