package bubble;

/**
 * The class is used to implement bubble sort algorithm for primitive arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class PrimitivesBubbleSort {

    /**
     * Implements bubble sort and sorts integer numbers array.
     * This method sorts the given array and return nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(int[] array) {
        if (array == null) {
            return;
        }

        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length; i++) {
            swapped = false;
            for (int j = 1; j < length - i; j++) {
                int temp = array[j - 1];
                if (temp > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    /**
     * Implements bubble sort and sorts double numbers array (double[]).
     * This method sorts the given array and return nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(double[] array) {
        if (array == null) {
            return;
        }

        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length; i++) {
            swapped = false;
            for (int j = 1; j < length - i; j++) {
                double temp = array[j - 1];
                if (temp > array[j]) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    /**
     * Implements bubble sort and sorts integer numbers array (int[]).
     *
     * @param array - array that should be sorted
     * @return - new array in the sorted order
     * */
    public int[] sorted(int[] array) {
        if (array == null) {
            return null;
        }

        int[] arrayCopy = new int[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        sort(arrayCopy);

        return arrayCopy;
    }

    /**
     * Implements bubble sort and sorts double numbers array (int[]).
     *
     * @param array - array that should be sorted
     * @return - new array in the sorted order
     * */
    public double[] sorted(double[] array) {
        if (array == null) {
            return null;
        }

        double[] arrayCopy = new double[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, array.length);
        sort(arrayCopy);

        return arrayCopy;
    }
}