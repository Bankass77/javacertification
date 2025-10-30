/*
package org.example.java17.chapter8;

import java.util.function.Consumer;

public class Crow2 {

    private String color;

    public void caw(String name) {
        name = "Caty";
        color = "Black";
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says"  // ne compile pas car name n'est final ou effectivement final
                        + volume + " that she is " + color);  // ne compile pas car volume  n'est final ou effectivement final

        volume= "softly";
    }
}
*/
