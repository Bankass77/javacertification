package org.example.algortihme.interview.testInterviewQuestions;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> t = new TreeMap<Integer,Integer>();
        t.put(3, 3);
        t.put(2, 1);
        t.put(1, 2);
        System.out.println(t.values());
    }
}
