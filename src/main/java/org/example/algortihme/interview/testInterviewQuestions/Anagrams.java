package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {
	/*
	 * How do you check if the given two strings below are anagrams or not? String
	 * s1="home";String s2="mohe";
	 */
	String s1="home";
	String s2="mohe";
        char [] arr1= s1.toCharArray();
        char [] arr2= s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
	boolean result= Arrays.equals(arr1, arr2);
	System.out.println(result);
	
    }

}
