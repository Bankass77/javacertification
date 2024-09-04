package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Arrays;
import java.util.Objects;

public class Permutation {

   private String sort(String str){
        if( str.isEmpty()){
            return  null;
        }
        char [] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

   public boolean permutation(String s, String t){
       if(s.length() != t.length()){
           return false;
       }

       return Objects.equals(sort(s), sort(t));
   }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(permutation.permutation("dog", "god"));

    }
}
