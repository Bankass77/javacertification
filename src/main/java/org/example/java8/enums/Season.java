package org.example.java8.enums;

public enum Season {
    WINTER("Low") {
        public String getHours() {

            return "10am-3pm";
        }
    },
    SPRING("Medium") {
        public String getHours() {

            return "9am-5pm";
        }
    },
    SUMMER("High") {
        public String getHours() {

            return "10am-3pm";
        }
    },
    FALL("Medium") {
        public String getHours() {

            return "10am-3pm";
        }
    };

    private final String expectedVisitors;    // doit être déclarer private et final la variable d'instance

    Season(final String expectedVisitors) {   // implicite private le constructeur
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(this.expectedVisitors);
    }

}
