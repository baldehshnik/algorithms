package shuttle;

import org.jetbrains.annotations.NotNull;

public class PrimitivesShuttleSort {

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

    public int[] sorted(int @NotNull [] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        sort(newArray);

        return newArray;
    }

    public double[] sorted(double @NotNull [] array) {
        double[] newArray = new double[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        sort(newArray);

        return newArray;
    }
}