package org.example.java17.chapter8.consumers;

import java.util.List;
import java.util.function.Consumer;

/**
 * An apartment building contains two-bedroom and three-
 * bedroom apartments of various sizes. Using the Consumer
 * interface, compute the total square footage of all the rooms in the
 * building.
 */
public class LongProblemBuildingExample {
    public static void main(String[] args) {

        List<Object> building= List.of(
        new TwoBR(new Room(100), new Room(150)) ,

        new ThreeBR(new Room(90), new Room(120), new Room(110)));

        final int [] total = {0};
        Consumer<Object> pipeline= o->{
            if (o instanceof  TwoBR twoBR){
                total[0] += twoBR.room.size + twoBR.room2.size;
            } else if ( o instanceof ThreeBR  threeBR ) {
                total[0]+= threeBR.room.size+ threeBR.room2.size+ threeBR.room3.size;
            }

        };

        building.forEach(pipeline);
        System.out.println("Total de surface est: " + total[0]);
         
    }
}
