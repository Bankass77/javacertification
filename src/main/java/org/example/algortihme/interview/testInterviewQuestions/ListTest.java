package org.example.algortihme.interview.testInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
	/*
	 * What will be the contents of a list after a given operation and why?
	 */
	final List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.remove(2);// doit retourner [1,2] la raison est qu'il y a 2 operations remove dans une
		       // list: remove(int index) et remove(Object obj)

	System.out.println(list);

	// Pour supprimer l'élément 2 de la liste, il faut écrire ce qui suit :
	System.out.println(list.remove(Integer.valueOf(2)));


    }

}
