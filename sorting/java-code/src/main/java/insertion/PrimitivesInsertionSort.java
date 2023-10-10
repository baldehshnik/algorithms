package insertion;

import org.jetbrains.annotations.NotNull;

/**
 * The class is used to implement insertion sort algorithm for int[] and double[] arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class PrimitivesInsertionSort {

    /**
     * Implements insertion sort and sorts int[] array.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(int @NotNull [] array) {
        for (int i = 1; i < array.length; i++) {
            int index = i;
            while (index > 0) {
                if (array[index - 1] > array[index]) {
                    int temp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = temp;
                } else {
                    break;
                }

                index--;
            }
        }
    }

    /**
     * Implements insertion sort and sorts double[] array.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(double @NotNull [] array) {
        for (int i = 1; i < array.length; i++) {
            int index = i;
            while (index > 0) {
                if (array[index - 1] > array[index]) {
                    double temp = array[index - 1];
                    array[index - 1] = array[index];
                    array[index] = temp;
                } else {
                    break;
                }

                index--;
            }
        }
    }

    /**
     * Uses insertion sort {@link PrimitivesInsertionSort#sort(int[])} to sort an int[] array.
     * This method sorts the given array and returns new int[] array.
     *
     * @param array - array a copy of which should be sorted
     * */
    public int[] sorted(int @NotNull [] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        sort(newArray);

        return newArray;
    }

    /**
     * Uses insertion sort {@link PrimitivesInsertionSort#sort(double[])} to sort a double[] array.
     * This method sorts the given array and returns new double[] array.
     *
     * @param array - array a copy of which should be sorted
     * */
    public double[] sorted(double @NotNull [] array) {
        double[] newArray = new double[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        sort(newArray);

        return newArray;
    }
}
