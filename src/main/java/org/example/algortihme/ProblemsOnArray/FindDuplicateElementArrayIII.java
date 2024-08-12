package org.example.algortihme.ProblemsOnArray;

/*
 • Approach 3: Using XOR.
 • We can also solve this problem by taking xor of all array elements with numbers 1 to n-1.
  Since the same elements will cancel each other as a^a = 0, 0^0 = 0 and a^0 = a,
  we will be left with the duplicate element.
 */
public class FindDuplicateElementArrayIII {


     public  static int findDuplicate(int[] nums) {
         int xor = 0;

         // prend le xor de tous les éléments du tableau
         for(int value: nums){
             xor = xor ^ value; // xor ^=value

         }
         // prend le xor de tous les éléments du tableau de 1 à nums.lenght-1
         for( int i = 1; i<= nums.length-1; i++) {
             xor = xor ^ i;
         }
         return xor;
     }

    public static void main(String[] args) {
        int [] nums =  { 1, 2, 3, 4, 2 };

        System.out.println("L'élement en doublon est: "+findDuplicate(nums));
    }
}
