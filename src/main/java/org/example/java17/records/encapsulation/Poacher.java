package org.example.java17.records.encapsulation;

public class Poacher {

    // Vu que les champs ont comme moficateur package access level, donc on pourra utiliser la classe Crane dans le même package pour changer ces valeurs et créer des données invalident
    public void badActor() {
        var mother = new Crane(5, "Cathy");
        //mother.numbereggs= -100;
    }
}
