package insertion;

import org.jetbrains.annotations.NotNull;

public class PrimitivesInsertionSort {

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
