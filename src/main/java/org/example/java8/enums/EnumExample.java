package org.example.java8.enums;

public class EnumExample {

    public static void main(String[] args) {
        var season = Season.SUMMER;

        System.out.println(season);  // SUMMER

        System.out.println(season == Season.SUMMER); // true


        // valueOf()
        var season2 = Season.valueOf("SUMMER");  // SUMMER
        System.out.println(season2);
        //var season3 = Season.valueOf("summer"); // IllegalArgumentException par ce que dans la déclaration de Season on SUMMER et non summer
        //System.out.println(season3);
        // methode: values(), name(), ordinal()  fourni par enum

        for (Season season1 : Season.values()) {

            System.out.println(season1.name() + " " + season1.ordinal());
        }

        //if (Season.SUMMER==2){} // ne compile pas puisqu'on ne peut pas comparer un int  directement avec la valeur du type de l'enum


        // switch statement/expressions

        switch (season) {

            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            case WINTER:
                System.out.println("Get out the sled!");
                break;

            default:
                System.out.println("Is it summer yet?");

        };


        var summer = Season.WINTER;
        String message = switch (summer) {
            case SUMMER -> "Time for the pool!";
            case WINTER -> "Get out the sled!";
            default -> "Is it summer yet?";
        };
        System.out.println(message);


        // appel de la méthode présente dans l'enum

        Season.FALL.printExpectedVisitors();

    }
}
