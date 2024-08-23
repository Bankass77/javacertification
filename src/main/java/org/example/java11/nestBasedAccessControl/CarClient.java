package org.example.java11.nestBasedAccessControl;

public class CarClient {
    public static void main(String[] args) {
        // Créer une instance de la classe externe Car
        Car car = new Car("Electric engine");

        // Utiliser l'instance de Car pour créer une instance de la classe interne Engine, en appellant new sur l'instance.
        Car.Engine engine = car.new Engine();

        // Appeler les méthodes de la classe interne
        engine.setEngine();
        String engineType = engine.getEngine();
        System.out.println(engineType);
    }

    /*public static void main(String[] args) {
        // Créer une instance de la classe externe Car
        Car car = new Car("diesel");

        // Créer une instance de la classe interne static Engine
        Car.Engine engine = new Car.Engine();

        // Appeler les méthodes de la classe interne
        engine.setEngine(car.getCartType());
        String engineType = engine.getEngine();

        // Afficher le type de moteur
        System.out.println("Engine type: " + engineType);
    }*/
}
