package binary;

import org.jetbrains.annotations.NotNull;

/**
 * The class implements binary search for int[] and double[] arrays
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class PrimitivesBinarySearch {

    /**
     * This method implements binary search for an int[] array
     *
     * @param array - sorted int[] array of elements
     * @param element - search element
     * */
    public int search(int @NotNull [] array, int element) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int averageIndex = (startIndex + endIndex) / 2;
            if (element == array[averageIndex]) {
                return averageIndex;
            }

            if (element < array[averageIndex]) {
                endIndex = averageIndex - 1;
            } else {
                startIndex = averageIndex + 1;
            }
        }

        return -1;
    }

    /**
     * This method implements binary search for a double[] array
     *
     * @param array - sorted double[] array of elements
     * @param element - search element
     * */
    public int search(double @NotNull [] array, double element) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int averageIndex = (startIndex + endIndex) / 2;
            if (element == array[averageIndex]) {
                return averageIndex;
            }

            if (element < array[averageIndex]) {
                endIndex = averageIndex - 1;
            } else {
                startIndex = averageIndex + 1;
            }
        }

        return -1;
    }
}