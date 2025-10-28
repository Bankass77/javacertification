package org.example.algortihme;

public class TriSortSolution {

    public void selectSort(int [] arr){
        for( int i =0; i < arr.length; i ++){  // boucle imbriquée O (n2)
            int mindIdx= i;
            for(int j = i+1; j <arr.length; i++){
                if(arr[j] < arr [mindIdx]){

                    mindIdx= j;
                }
            }
            // échanger les élements
            int temp= arr[mindIdx];
            arr[mindIdx]= arr[i];
            arr[i]= temp;
        }
    }
}
