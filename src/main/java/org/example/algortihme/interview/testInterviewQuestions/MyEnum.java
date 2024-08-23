package org.example.algortihme.interview.testInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import lombok.Synchronized;

public enum MyEnum {
    INSTANCE;

    // la list myList n'est pas thread-safe, un thread peut modifier myList en
    // ajoutant un élément tandis qu'un autre thread peut la parcourrir , cela peut
    // entraîner
    // des ConcurrentModificationException ou d'autres incohérences.
    List<String> myList = new ArrayList<String>();

    public void addItem(String item) {
	myList.add(item);
    }

    public List<String> getItems() {
	return myList;
    }

    // Il y a plusieurs façons de rendre les champs d'une enum thread-safe :
    // Utiliser des collections thread-safe : Vous pouvez utiliser une collection
    // thread-safe, comme CopyOnWriteArrayList ou Collections.synchronizedList, pour
    // éviter les problèmes de concurrence.java

    private List<String> myList2 = new CopyOnWriteArrayList<>();
    private List<String> newList = Collections.synchronizedList(myList2);

//Synchronisation manuelle : Vous pouvez synchroniser manuellement les méthodes qui accèdent aux champs mutables.

    public synchronized void addItem2(String item) {
	myList.add(item);
    }

    public synchronized List<String> getItems2() {
	return new ArrayList<>(myList);
    }

    // Rendre le champ final:
    // Rendre un champ final garantit qu'il ne
    // sera pas modifié après sa construction, mais cela n'assure pas la thread
    // safety pour les objets mutables.Vous devrez
    // toujours synchroniser l'accès si l'objet est partagé entre threads.

}
