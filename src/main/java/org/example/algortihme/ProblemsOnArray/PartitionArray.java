package org.example.algortihme.ProblemsOnArray;

public class PartitionArray {

    /**
     * @param array
     * @param low
     * @param high
     * @return
     */
    private int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low - 1;
        int j = high + 1;

        while(true) {
            do {
                i++;
            } while(array[i] < pivot);

            do {
                j--;
            } while(array[j] > pivot);

            if(i >= j) {
                return j;
            }
            swap(i, j, array);
        }
    }

    private void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 4, 2, 7, 1, 10 };
        int low = 0;
        int high = array.length - 1;
        PartitionArray partitionArray = new PartitionArray();
        int partitionIndex = partitionArray.partition(array, low, high);
        System.out.println("Array after partitioning:");
        partitionArray.printArray(array);

        System.out.println("Partition index: " + partitionIndex);
    }
}
