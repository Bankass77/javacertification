package org.example.java17.chapter8;

public class MethodeInstanceOnParameter {

    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo"));  // false


        StringTwoParameterChecker methodRef2 = String::startsWith;
        StringTwoParameterChecker lamba2 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef2.check("Zoo", "A"));
        System.out.println(lamba2.check("Zoo", "A"));

    }
}
