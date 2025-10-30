package org.example.java17.chapter7.polymorphisme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.example.lambda.Animal;

public class UtilisationReferenceInterfaceExemple {

    public void sortAndPrintZooAnmals(List<String> animals) {
        Collections.sort(animals);

        for (String a : animals) {
            System.out.println(a);
        }
    }


    public static void main(String[] args) {
        UtilisationReferenceInterfaceExemple utilisationReferenceInterfaceExemple = new UtilisationReferenceInterfaceExemple();
        utilisationReferenceInterfaceExemple.sortAndPrintZooAnmals(Arrays.asList(new Animal("vertebre", true, false).toString(),
                new Animal("lezarre", true, false).toString()));
    }
}
