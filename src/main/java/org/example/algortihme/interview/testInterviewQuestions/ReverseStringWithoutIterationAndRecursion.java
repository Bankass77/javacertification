package org.example.algortihme.interview.testInterviewQuestions;

public class ReverseStringWithoutIterationAndRecursion {

    public static void main(String[] args) {
	
	String reverseToString = "Java Programming";
	
	String reverseString = new StringBuilder(reverseToString).reverse().toString();
	System.out.println(reverseString);

    }

}
