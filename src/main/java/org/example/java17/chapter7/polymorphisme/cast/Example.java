package org.example.java17.chapter7.polymorphisme.cast;

import org.example.java17.chapter7.polymorphisme.Lemur;
import org.example.java17.chapter7.polymorphisme.Primate;

public class Example {

    Lemur lemur = new Lemur();

    Primate primate = lemur; // cast implicit vers le supertype

    Lemur lemur2= (Lemur) primate;  // cast explicite vers le sous type

   // Lemur lemur3= primate;  // Ne compile pas sans cast explicite  , ClassCastException
}
