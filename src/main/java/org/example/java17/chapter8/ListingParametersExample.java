package org.example.java17.chapter8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListingParametersExample {

    public static void main(String[] args) {

        Predicate<String> p= x -> true;
        Predicate<String> p2= (var x) -> true;
        Predicate<String> p3= (String x)-> true;

        //(var x, y) -> "Hello"; // ne compile pas , car le type y n'a pas été spécifié, donc il faut éliminet le var  de x ou l'ajouter à y
       // (var x, Integer y) -> true; // ne compile pas , par ce x et y ne sont pas du même type, il faut utiliser le var
        //(String x, var y, Integer z)-> true // ne compile pas , mélange de type
       // (Integer x, y) -> "goodbye"; // ne compile pas car le type y n'a pas été spécifié, donc il faut éliminet le Integer   de x ou l'ajouter à y

    }

    public void whatAmI(){
        consume((var x)-> System.out.println(x), 123);
    }

    public void consume(Consumer<Integer> c, int num){
        c.accept(num);
    }


    public void counts(List<Integer> list){
        list.sort((var x, var y)-> x.compareTo(y));
    }


    // on peut aussi ajouter le modificateur final ou une annotation

    public void counts2(List<Integer> list){
        list.sort((final var x,@Deprecated var y)-> x.compareTo(y));
    }
}
