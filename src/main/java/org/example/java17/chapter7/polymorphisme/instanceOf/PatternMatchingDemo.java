package org.example.java17.chapter7.polymorphisme.instanceOf;

public class PatternMatchingDemo {
    public static void main(String[] args) {
        Object object = "Hello, java 17";
        if(object instanceof String str){
            System.out.println(str.length());
        }
    }

}
