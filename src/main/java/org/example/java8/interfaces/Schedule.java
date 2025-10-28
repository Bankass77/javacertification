package org.example.java8.interfaces;

public interface Schedule {
    default void wakeUp() {
        checkTime(7);
        haveBreakfast();
        workOut();
    }

    private void haveBreakfast() {
        checkTime(9);
    }

    static void workOut() {
        checkTime(18);
    }

    private static void checkTime(int hour) {  // le fait de déclarer la méthode, évite de l'exposer hors de l'interface
        if (hour > 17) {
            System.out.println("You're late.");
        } else {
            System.out.println("You have " + (17 - hour) + " hours left " + "to make the apointment");
        }
    }
}
