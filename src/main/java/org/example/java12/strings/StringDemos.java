package org.example.java12.strings;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringDemos {

    public static void main(String[] args) {
        indentDemo();
        transformDemo();
        describeConstableDemo();
        resolveConstDescDemo();
    }

    private static void resolveConstDescDemo() {
        String course = "Java12";
        String result= course.resolveConstantDesc(MethodHandles.lookup());
        System.out.println("Utilisation de la méthode resolveConstantDesc==>"+ result);
    }

    private static void describeConstableDemo() {
        String course = "Java12";
        Optional<String> data= course.describeConstable();
        System.out.println("Utilisation de la méthode describeConstable==>"+ data.get());
    }

    private static void transformDemo() {
        System.out.println("Using transform() ==>");
        String str="Java9,Java10";
        List<String> stringList = str.transform(str1->{
            return Arrays.asList(str1.split(","));
        });
        System.out.println("Original String ==>" + str);
        System.out.println("Transformed String ==>");
        stringList.forEach(str2 -> System.out.println(str2));
    }

    private static void indentDemo() {
    }
}
