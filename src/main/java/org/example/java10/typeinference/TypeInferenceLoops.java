package org.example.java10.typeinference;

public class TypeInferenceLoops {

    public static void main(String[] args) {
        System.out.println("------Using the var keyword in loops:traditionnalLoop------");
        traditionnalLoop();
        System.out.println("------Using the var keyword in loops:enhancedLoop------");
        enhancedLoop();
        
    }

    private static void enhancedLoop() {
      
        for(int i = 0; i <=10; i++) {
            System.out.println(i);
        }
        
    }

    private static void traditionnalLoop() {
       var intArray= new int [] {34,54,12,54};
       
       for(int i : intArray) {
        System.out.println(i);
    }
        
    }

}
