package org.example.java11.nestBasedAccessControl;

public class Car {

    private String cartType;

    public Car(String cartType) {
        this.cartType = cartType;
    }

    /*  public String getCartType() {
          return cartType;
      }
  */
    class Engine {

        String engineType;

        class SteeringWheel {
        }
        void setEngine() {
            if (cartType.equals("diesel") || cartType.equals("Electric")) {
                this.engineType = "customized";
            } else {
                this.engineType = "standard";
            }
        }

        String getEngine() {
            return this.engineType;
        }
    }


    // Classe interne déclarée comme static
    /*static class Engine {

        String engineType;

        // Besoin de passer une référence à cartType en paramètre
        void setEngine(String cartType) {
            if (cartType.equals("diesel")) {
                this.engineType = "customized";
            } else {
                this.engineType = "standard";
            }
        }

        String getEngine() {
            return this.engineType;
        }
    }*/
}
