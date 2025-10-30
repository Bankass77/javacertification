package org.example.java17.chapter8.predicate;

import java.util.function.Predicate;

public class PredicateHelper {

    public  static  <X> void result(Predicate<X> p, X arg){

        if (p.test(arg)){
            System.out.println("The Predicate is true for " + arg);
        }else {
            System.out.println("The Predicate is false for " + arg);
        }
    }
}
