/*
package org.example.java17.chapter8;

import java.util.Comparator;
import java.util.function.Predicate;

public class LocalVariableInsideLambdaBodyExample {


    public static void main(String[] args) {
        final Comparator<Integer> tComparator = (a, b) -> {
            int c = 0;
            return 5;
        };

        Predicate<Integer> p1= a -> returnSame(a);  // peût être récrit en :

        Predicate<Integer> p2= this::returnSame;
    }


    // 3 erreurs: ligne 22  (a été rédéclaré), 23 (b a été rédclaré), 26 ( le point-virgule qu'il faut ajouté)

  */
/*  public void variables(int a){

        int b= 1;
        Predicate<Integer> p1= a ->{
            int b = 0;
            int c= 0;
            return b==c;
        }
    }*//*




}
*/
