package merge;

import org.jetbrains.annotations.NotNull;

/**
 * The class is used to implement merge sort algorithm for int[] and double[] arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class PrimitivesMergeSort {

    /**
     * Implements merge sort and sorts int[] array.
     * This method uses the merge function {@link PrimitivesMergeSort#merge(int[], int[], int[])} to merge two separated arrays.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(int @NotNull [] array) {
        if (array.length <= 1) return;

        int arrayPartSize = array.length / 2;
        int[] firstPartOfArray = new int[arrayPartSize];
        System.arraycopy(array, 0, firstPartOfArray, 0, arrayPartSize);

        int[] secondPartOfArray = new int[array.length - arrayPartSize];
        System.arraycopy(array, arrayPartSize, secondPartOfArray, 0, array.length - arrayPartSize);

        sort(firstPartOfArray);
        sort(secondPartOfArray);

        merge(array, firstPartOfArray, secondPartOfArray);
    }

    /**
     * Implements merge sort and sorts double[] array.
     * This method uses the merge function {@link PrimitivesMergeSort#merge(double[], double[], double[])} to merge two separated arrays.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(double @NotNull [] array) {
        if (array.length <= 1) return;

        int firstArrayPartSize = array.length / 2;
        double[] firstPartOfArray = new double[firstArrayPartSize];
        System.arraycopy(array, 0, firstPartOfArray, 0, firstPartOfArray.length);

        int secondArrayPartSize = array.length - firstArrayPartSize;
        double[] secondPartOfArray = new double[secondArrayPartSize];
        System.arraycopy(array, firstArrayPartSize, secondPartOfArray, 0, secondArrayPartSize);

        sort(firstPartOfArray);
        sort(secondPartOfArray);
        merge(array, firstPartOfArray, secondPartOfArray);
    }

    /**
     * Uses merge sort {@link PrimitivesMergeSort#sort(int[])} to sort an int[] array.
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
     * Uses merge sort {@link PrimitivesMergeSort#sort(double[])} to sort a double[] array.
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

    /**
     * Merges the given two int[] arrays in the given int[] destination array in the sorted order.
     *
     * @param destination - the int[] array that should contain the given arrays in the sorted order and in the right place
     * @param array1 - the int[] array that should be merged with array2 variable
     * @param array2 - the int[] array that should be merged with array1 variable
     * */
    private void merge(int @NotNull [] destination, int @NotNull [] array1, int @NotNull [] array2) {
        int index1 = 0, index2 = 0;
        int maxLength = array1.length + array2.length;

        for (int i = 0; i < maxLength; i++) {
            if (index1 == array1.length) {
                destination[i] = array2[index2];
                index2++;
            } else if (index2 == array2.length) {
                destination[i] = array1[index1];
                index1++;
            } else if (array1[index1] < array2[index2]) {
                destination[i] = array1[index1];
                index1++;
            } else {
                destination[i] = array2[index2];
                index2++;
            }
        }
    }

    /**
     * Merges the given two double[] arrays in the given double[] destination array in the sorted order.
     *
     * @param destination - the double[] array that should contain the given arrays in the sorted order and in the right place
     * @param array1 - the double[] array that should be merged with array2 variable
     * @param array2 - the double[] array that should be merged with array1 variable
     * */
    private void merge(double @NotNull [] destination, double @NotNull [] array1, double @NotNull [] array2) {
        int index1 = 0, index2 = 0;
        int maxLength = array1.length + array2.length;

        for (int i = 0; i < maxLength; i++) {
            if (index1 == array1.length) {
                destination[i] = array2[index2];
                index2++;
            } else if (index2 == array2.length) {
                destination[i] = array1[index1];
                index1++;
            } else if (array1[index1] < array2[index2]) {
                destination[i] = array1[index1];
                index1++;
            } else {
                destination[i] = array2[index2];
                index2++;
            }
        }
    }
}