package org.example.functionalprogrammingjava8.collections;

import java.util.ArrayList;

public class RemovingElementTest {
    public static void main(String[] args) {

        //a Predicate<String> is used to remove all
        //elements beginning with “S” from the collection
        ArrayList<String> list = new ArrayList<>();
        list.add("Supper");
        list.add("Random");
        list.add("Silly");
        list.add("Strings");

        list.removeIf(s -> s.charAt(0) == 'S');
        list.forEach(x -> System.out.println(x));
    }
}
