package shuttle;

import org.jetbrains.annotations.NotNull;

/**
 * The class is used to implement shuttle sort algorithm for int[] and double[] arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class PrimitivesShuttleSort {

    /**
     * Implements shuttle sort and sorts int[] array.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(int @NotNull [] array) {
        boolean swapped = false;
        int start = -1;
        int end = array.length - 1;

        do {
            start++;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            end--;
            swapped = false;
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /**
     * Implements shuttle sort and sorts double[] array.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(double @NotNull [] array) {
        boolean swapped = false;
        int start = -1;
        int end = array.length - 1;

        do {
            start++;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            end--;
            swapped = false;
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    double temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /**
     * Uses shuttle sort {@link PrimitivesShuttleSort#sort(int[])} to sort an int[] array.
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
     * Uses shuttle sort {@link PrimitivesShuttleSort#sort(double[])} to sort a double[] array.
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