package org.example.java17.chapter8;

public class MethodInstanceReferenceExample {

    public static void main(String[] args) {

        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        System.out.println(methodRef.beginingCheck("A"));  // false

        StringStart lambda = s -> s.startsWith(s);
        System.out.println("Lambda: " + lambda.beginingCheck("A"));


        var str2 = "";
        StringChecker methodRef2 = str2:: isEmpty;
        System.out.println(methodRef2.check());

        StringChecker lambda2= () -> str2.isEmpty();
        System.out.println("Lambda2: " + lambda2.check());

        StringChecker lambda3 = ()-> str2.startsWith("Zoo");

        // Toutes les expressions lambda ne peuvent pas être converties en réference de Méthode
       // StringChecker methodReference= str2::startsWith;  // Ne compile pas
        //StringChecker methodReference2= str2::startsWith("Zoo");  // // Ne compile pas
    }
}
