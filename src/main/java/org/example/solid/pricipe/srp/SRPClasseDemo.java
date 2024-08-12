package org.example.solid.pricipe.srp;

public class SRPClasseDemo {

    public static void main(String[] args) {
System.out.println("-----Vehicule----------");
        Vehicule vehicule = new Vehicule();
                 vehicule.move();
                 vehicule.stop();

        System.out.println("-----Engine----------");

                Engine engine = new Engine();
                engine.move();
                engine.stop();
                engine.start();

        System.out.println("-----VehiculeComputer----------");
                VehiculeComputer vehiculeComputer = new VehiculeComputer();
                    vehiculeComputer.move();
                    vehiculeComputer.stop();
                    vehiculeComputer.lightsOff();
                    vehiculeComputer.lightsOn();

    }

}
