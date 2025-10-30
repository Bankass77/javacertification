package org.example.java17.chapter8;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        EmptyStringCreator methodRef= String:: new;
        EmptyStringCreator lambda= ()-> new String();

        var myString= methodRef.create();
        System.out.println(myString.equals("Snake")); // false

        StringCopier methodRefStringCopier= String::new;
        StringCopier lambdaStringCopier= x-> new String(x);

        var myStringStringCopier = methodRefStringCopier.copy("Zebra");
        System.out.println(myStringStringCopier.equals("Zebra"));  // true



    }
}
