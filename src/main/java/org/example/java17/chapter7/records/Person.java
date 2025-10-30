package org.example.java17.chapter7.records;

public record Person (String name, int age){
 public Person {

     //la normalisation du name
     name = name.trim();

     if(name == null || name.isBlank()){
         name = "Inconnu";
         throw  new IllegalArgumentException("Le nom ne pas être vide");


     }
     if(age <=0){
         age= 18;
         throw  new IllegalArgumentException("L'âge ne peut être négatif");
     }
 }
}
