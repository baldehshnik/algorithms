package selection;

import org.jetbrains.annotations.NotNull;

/**
 * The class is used to implement selection sort algorithm for int[] and double[] arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class PrimitivesSelectionSort {

    /**
     * Implements selection sort and sorts int[] array.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(int @NotNull  [] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minId = j;
                }
            }

            array[minId] = array[i];
            array[i] = minValue;
        }
    }

    /**
     * Implements selection sort and sorts double[] array.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(double @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            double minValue = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minId = j;
                }
            }

            array[minId] = array[i];
            array[i] = minValue;
        }
    }

    /**
     * Uses selection sort {@link PrimitivesSelectionSort#sort(int[])} to sort an int[] array.
     * This method sorts the given array and returns new int[] array.
     *
     * @param array - array a copy of which should be sorted
     * */
    public int[] sorted(int @NotNull [] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        sort(newArray);

        return newArray;
    }

    /**
     * Uses selection sort {@link PrimitivesSelectionSort#sort(double[])} to sort a double[] array.
     * This method sorts the given array and returns new double[] array.
     *
     * @param array - array a copy of which should be sorted
     * */
    public double[] sorted(double @NotNull [] array) {
        double[] newArray = new double[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        sort(newArray);

        return newArray;
    }
}