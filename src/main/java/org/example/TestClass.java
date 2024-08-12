package org.example;

import org.example.InterfaceFunctionel.Sprint;
import org.example.lambda.Tiger;

public class TestClass {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        var $num= (Integer)null;
        System.out.println($num);

       // float value = 102.0; // ne compile pas, car un double a été affecté à un float.
        //System.out.println(value);

        Sprint  sprint=  new Tiger();
        sprint.print(8);

        Sprint sprint1= new Sprint() {

            @Override
            public void print(int speed) {
                System.out.println(speed);
            }
        };

        sprint1.print(78);


        // peut être remplacer par lambda:
        Sprint sprint2= speed -> System.out.println(speed);
    }

}
