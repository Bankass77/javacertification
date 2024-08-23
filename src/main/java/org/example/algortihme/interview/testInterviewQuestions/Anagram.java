package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
	String s1 = "SAVE";
	String s2 = "VASE";
	String s3= "hello";
	boolean isAnagram = isAcronym( s1, s2);
	boolean isAnagram2= isAcronym(s3, s2);
	System.out.println(isAnagram + " s1 and s2 are acronym ");
	System.out.println(isAnagram2 + " s3 and s2 are not acronym ");
	System.out.println("-----isAcronymMoreBetter---------");
	System.out.println(isAcronymMoreBetter(s1, s2));
	System.out.println(isAcronymMoreBetter(s3, s2));
    }

    public static boolean isAcronym(String s1, String s2) {

	if (s1.length() != s2.length()) {
	    return false;
	}

	// Calculer le nombre de caractère de s1
	HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
	for (int i = 0; i < s1.length(); i++) {
	    if (charCounts.containsKey(s1.charAt(i))) {
		charCounts.put(s1.charAt(i), charCounts.get(s1.charAt(i)) + 1);

	    } else {
		charCounts.put(s1.charAt(i), 1);
	    }

	}

	// Comparer le compte du nombre de caractère avec s2
	for (int i = 0; i < s2.length(); i++) {
	    if (charCounts.containsKey(s2.charAt(i))) {
		charCounts.put(s2.charAt(i), charCounts.get(s2.charAt(i)) - 1);
	    } else {
		return false;
	    }

	}
	// On vérifie si tous les caractères/lettres matchent
	for (int count : charCounts.values()) {
	    if (count != 0) {
		return false;
	    }

	}
	return true;
    }
    
    //Voici une façon de mettre en œuvre une meilleure solution, en comparant des chaînes triées :
    
    private static boolean isAcronymMoreBetter(String s1, String s2) {
	char [] s1Chars = s1.toCharArray();
	char [] s2chars= s2.toCharArray();
	Arrays.sort(s1Chars);
	Arrays.sort(s2chars);
	return Arrays.equals(s1Chars, s2chars);
    }
}
