package org.example.algortihme.interview.testInterviewQuestions;

/**
 * La méthode sumRange devrait retourner la somme des entiers compris entre 10 et 100 inclusifs contenus
 * dans le tableau passé en paramètre.
 * int[] ints = {1, 20, 3, 10, -2, 100};
 * int result = Solution.sunRange(ints);
 * System.out.println("result : "+result);
 * System.out.println("expected result : 130");
 */
public class SumRange {

    public static void main(String[] args) {
        int[] ints = { 1, 4, 9, 12, 98, -10, 10 };
        int[] ints2 = {1, 20, 3, 10, -2, 100};
        int[] ints3 = { 30, 4, 9, 12, 98, -10, 10 };
        System.out.println(sumRange(ints));
        System.out.println(sumRange(ints2));
        System.out.println(sumRange(ints3));

    }

    static int sumRange(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
                int n = arr[i];
            if(n>=10 &&  n <=100) {
                sum += n;
            }
        }
        return sum;
    }

}
