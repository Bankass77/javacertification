package org.example.algortihme.interview.datastructures;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();
        //Using add() : add element at the end of array deque
        animals.add("dog");
        System.out.println("Array deque with add (): " + animals);

        //Using addFirst()
        animals.addFirst("Cat");
        System.out.println("Array deque with addFirst: " + animals);

        //Using addlast()
        animals.addLast("Horse");
        System.out.println("Array deque with addLast: " + animals);

        //Using peek()
       String firstElement= animals.peek();
       System.out.println("Array deque après peek: "+ firstElement);

       //Using peekFirst()
        String peekFirst = animals.peekFirst();
        System.out.println("Array deque peekFirst: "+ peekFirst);
        //Using peekLast()
        String peekLast = animals.peekLast();
        System.out.println("Array deque peekLast: "+ peekLast);

        // Remove elements using the remove(), removeFirst(), removeLast() method
        //Using remove
        String element = animals.remove();
        System.out.println("Array deque remove: "+ element);

        //Using removeFirst()
        String removeFirst = animals.removeFirst();
        System.out.println("Array deque removeFirst: "+ removeFirst);

        String removeLast = animals.removeLast();
        System.out.println("Array deque removeLast: "+ removeLast);

        //Remove elements using the poll(), pollFirst() and pollLast() method
        ArrayDeque<String> animals1 = new ArrayDeque<>();
        animals1.add("dog");
        animals1.add("cat");
        animals1.add("horse");
        animals1.add("mouse");
        System.out.println("Array deque with add (): " + animals1);
        String animals2 = animals1.poll();
        System.out.println("Array deque with poll: " + animals2);
        String pollFirst = animals1.pollFirst();
        System.out.println("Array deque pollFirst: "+ pollFirst);
        String pollLast = animals1.pollLast();
        System.out.println("Array deque pollLast: "+ pollLast);

        //Remove Element: using the clear() method
        //using clear()
        animals1.clear();
        System.out.println("Array deque with clear(): " + animals1);

        //Iterating the ArrayDeque

        ArrayDeque<String> animals3 = new ArrayDeque<>();
        animals3.add("dog");
        animals3.add("cat");
        animals3.add("horse");
        animals3.add("mouse");

        Iterator<String> iterator = animals3.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal+ ",");
            //System.out.println(",");
        }

        //ArrayDeque as a Stack
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("dog");
        stack.push("cat");
        stack.push("horse");
        stack.push("mouse");
        //Access element from top of stack
        String stackElement = stack.peek();
        System.out.println("Array deque peek(): " + stackElement);
        //Remove element from of stack
        String removeElement= stack.pop();
        System.out.println("Array deque pop(): " + removeElement);
    }
}
