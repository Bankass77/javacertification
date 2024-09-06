package org.example.algortihme.interview.datastructures.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BacktrackingStringDemo3 {


    public static void dfs (String str, String perm, List<String> res){

        // Condition d'arrêt : lorsque tous les caractères de str sont utilisés
        if( str.isEmpty()){
            res.add(perm); // Ajouter la permutation complète à la liste des résultats
        }

        // Parcourir chaque caractère dans la chaîne
        for( int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);// Prendre le caractère courant

            //Rétirer le caractère courant de la chaîne
            String temp= str.substring(0, i) + str.substring(i + 1);

            // Appel récursif avec le caractère courant ajouté à la permutation
            dfs(temp, perm + ch, res);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        List<String> res = new ArrayList<>();
        dfs(str, "", res);
       for(String  s: res){
           System.out.println(s);
       }
    }
}
