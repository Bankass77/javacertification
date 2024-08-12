package org.example.lambda;

import java.security.PrivilegedAction;

public class ValidLambda {

    public static void main(String[] args) {
        CheckTrait checkTrait = (animal) -> animal.canHop();
        System.out.println(checkTrait);
        CheckTrait checkTrait1 = (Animal animal) -> { return  animal.canSwim();};
        System.out.println(checkTrait1);
        CheckTrait checkTrait2 = (Animal animal) -> { return  animal.canHop();};
        System.out.println(checkTrait2);
        CheckTrait checkTrait3 = animal -> animal.canSwim();
        System.out.println(checkTrait3);


    }
}
