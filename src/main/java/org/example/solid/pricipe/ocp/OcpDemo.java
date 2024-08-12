package org.example.solid.pricipe.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcpDemo {

    public static void main(String[] args) {
        List<Vehicule> vehicules = Arrays.asList(new Car(), new Truck());

        //vehicules.get(0).move(); Il  n'est pas possible d'appeler la méthode move ici. Afin de pour appeler cette méthode, il faut ajouter la méthode dans l'interface Vehicule.
        vehicules.get(0).move();
        vehicules.get(1).move();
    }

}
