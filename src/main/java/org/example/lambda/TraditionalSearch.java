package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        // list of animals
        animals.add(new Animal("Fish", false,true));
        animals.add(new Animal("Dog", true,true));
        animals.add(new Animal("Cat", true,false));
        animals.add(new Animal("Kangaroo", true,false));
        animals.add(new Animal("Rabbit", true,false));
        animals.add(new Animal("turtle", false,true));
        //
        print(animals, Animal::canSwim);
        print(animals, animal -> !animal.canSwim());

       // var invalid = (Animal a) ->a.canHop(); // Ne compile pas
    }

    // pass class that does check
    private static void print(List<Animal> animals, CheckTrait checker) {

        for( Animal animal: animals){

            if(checker.test(animal)){
                System.out.println(animal + " ");
            }

        }
        System.out.println();
    }

}
