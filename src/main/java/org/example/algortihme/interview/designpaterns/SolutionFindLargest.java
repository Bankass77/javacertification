package org.example.algortihme.interview.designpaterns;

/**
 * Implémentez la méthode Algorithm.findLargest(int[] numbers)
 * afin qu’elle retourne le plus grand nombre dans numbers.
 */
public class SolutionFindLargest {

    public static void main(String[] args) {

        SolutionFindLargest solutionFindLargest = new SolutionFindLargest();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] array=  { 1, 4, 9, 12, 98, -10, 10 };
        System.out.println(solutionFindLargest.largest(arr));
        System.out.println(solutionFindLargest.largest(array));
    }
    private int largest( int [] numbers){

        if(numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("Le tableau ne doit pas être vide !");
        }
        int largest = numbers[0];
        for( int num: numbers){
            if(num > largest){
                largest = num;
            }
        }
        return largest;
    }

}
