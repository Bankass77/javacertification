package org.example.algortihme.ProblemsOnArray;

import java.util.ArrayList;
import java.util.List;

public class SmallElements {

    public static void main(String[] args) {

        int[] array = {3,4,9,6,1};
        List<Integer> result = cout_smaller_elements(array);
        System.out.println(result);
    }


    private static List<Integer> cout_smaller_elements(int [] array){


              List<Integer> result = new ArrayList<>();
           for (int i = 0; i < array.length; i++) {
               int count = 0;
              for (int j = i+1; j < array.length; j++) {
                  if (array[j] < array[i]) {
                      count++;
                      result.add(count);
                  }
              }
           }
        return result;
    }

}
