package org.example.algortihme.ProblemsOnArray;

public class ArrayDemo {

    int[] x = new int[10];

    float[][] y = new float[2][5];

    double[][][] z = new double[2][5][5];

    //initialize the arrays
    static int[] x1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

    static float[][] y2 = { { 1.0F, 2.0F, 3.0F }, { 4.0F, 5.0F, 6.0F }, { 7.0F, 8.0F, 9.0F } };

    static double[][][] z2 = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 7, 8, 9 }, { 10, 11, 12 } }, { { 13, 14, 15 }, { 16, 17, 18 } },
            { { 19, 20, 21 }, { 22, 23, 24 } }, { { 25, 26, 27 }, { 28, 29, 30 } } };

    private static int size;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    // ou une déclaration
/*static int[] x1 = new int []{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    static float[][] y2 = new float[][] { { 1.0F, 2.0F, 3.0F }, { 4.0F, 5.0F, 6.0F }, { 7.0F, 8.0F, 9.0F } };
    static double[][][] z2 = new double[][][] { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 7, 8, 9 }, { 10, 11, 12 } }, { { 13, 14, 15 }, { 16, 17, 18 } },
            { { 19, 20, 21 }, { 22, 23, 24 } }, { { 25, 26, 27 }, { 28, 29, 30 } } };*/
    public static void main(String[] args) {

        if(args.length != 2) {
            System.out.println("Usage: java array1 row colume");
        } else {
            System.out.println("Hello " + args[0] + " " + args[1] + "!");
        }

        for(int i = 0; i < x1.length; i++) {
            int data = x1[i];
            System.out.println("x1 at index " + i + "= " + data + "\n");

        }

        System.out.println("=====================Tableau à 2D===================");
        for(int i = 0; i < y2.length; i++) {
            for(int j = 0; j < y2[i].length; j++) {
                float data = y2[i][j];
                System.out.println("y2 at index i=" + i + " and index j=" + j + "  est égale à : " + data + "\n");
            }
        }

        System.out.println("=====================Tableau à 3D===================");

        for(int i = 0; i < z2.length; i++) {
            for(int j = 0; j < z2[i].length; j++) {
                for(int k = 0; k < z2[i][j].length; k++) {
                    double data = z2[i][j][k];
                    System.out.println("y2 at index i=" + i + " and index j=" + " " + j + "and index k =" + k + "  est égale à : " + data + "\n");
                }
            }
        }

        System.out.println("=====================call of delete_element_by_index method on x1 ===================");
        delete_element_by_index(4, x1);

        for(int i = 0; i < x1.length; i++) {
            int data = x1[i];
            System.out.println("x1 at index " + i + "= " + data + "\n");

        }

        System.out.println("=====================call of get method on x1 ===================");

        System.out.println(getElementByIndex(5));

        System.out.println("=====================call of addElementByIndex method on x1 ===================");

        System.out.println(addElementByIndex(7, x1, 45));

        for(int i = 0; i < x1.length; i++) {
            int data = x1[i];
            System.out.println("x1 at index " + i + "= " + data + "\n");

        }

        System.out.println("=====================call of removeByElement method on x1 ===================");
            removeByElement(x1, 8) ;

        for(int i = 0; i < x1.length; i++) {
            int data = x1[i];
            System.out.println("x1 at index " + i + "= " + data + "\n");

        }
    }

    // Delete by index: on a besoin de 2 entre: inde, et tableau

    /**
     * @param index
     *         spécifié dans le tableau
     * @param array
     *         tableau avec des entiers
     */
    public static void delete_element_by_index(int index, int[] array) {

        int size = array.length;
        for(int i = index; i < size - 1; i++) {

            array[i] = array[i + 1];
        }

    }

    //Get element at an Index

    /**
     * @param index
     *         spécifié dans le tableau
     * @return la valeur du tableau à l'index spécifié donné.
     */
    public static int getElementByIndex(int index) {
        rangeCheck(index);
        return x1[index];
    }

    /**
     * @param index
     *         spécifié dans le tableau
     */
    private static void rangeCheck(int index) {
        size = x1.length;
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    //Add or insert an element in Array

    /**
     * @param index
     *         position of element in array
     * @param array
     *         of elements
     * @param value
     *         to insert at index position
     * @return true if the value inserted at index in array
     */
    public static boolean addElementByIndex(int index, int[] array, int value) {

        rangeCheck(index);
        for(int i = 0; i < array.length - 1; i++) {
            array[index] = value;
        }
        return true;
    }

    // Remove by Element

    public static void removeByElement(int[] array, int value) {
        size = array.length;
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] == value) {
                delete_element_by_index(array[i], array);

            }

        }
    }

}
