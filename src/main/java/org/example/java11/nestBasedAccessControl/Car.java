package org.example.java11.nestBasedAccessControl;

public class Car {

    private String cartType;

    public Car(String cartType) {
        this.cartType = cartType;
    }

    class Engine {

        String engineType;

        void setEngine() {
            if (cartType.equals("diesel")) {
                this.engineType = "customized";
            } else {
                this.engineType = "standard";
            }
        }

        String getEngine() {
            return this.engineType;
        }
    }
}
