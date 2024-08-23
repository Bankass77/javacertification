package org.example.java11.var;

import java.util.Arrays;
import java.util.List;

import lombok.NonNull;

public class UseOfVar {
    public static void main(String[] args) {
        //Utilisation du mot clé var avec l'interface consummer
        List<Integer> integerList= Arrays.asList(10,3,54,12,54,12);
        System.out.println("Element dans la liste ==>");
        integerList.forEach( (var var) -> System.out.println(var + " "));

        //utilisation du mot clé var avec une interface fonctionnelle définie par l'utilisateur
        Calculation calculation = (var list) -> list.stream().mapToInt(Integer::intValue).sum();
        double sum=  calculation.calculateSum(integerList);
        System.out.println("\nAddition des éléments dans la liste ==>" + sum);

       //int result = (@NonNull var value1,  @NonNull var value2) -> value1*value2;  est possible depuis java 11
    }
}
