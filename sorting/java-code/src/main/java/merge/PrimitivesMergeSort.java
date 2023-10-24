package merge;

import org.jetbrains.annotations.NotNull;

public class PrimitivesMergeSort {

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

    public int[] sorted(int @NotNull [] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        sort(newArray);

        return newArray;
    }

    public double[] sorted(double @NotNull [] array) {
        double[] newArray = new double[array.length];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        sort(newArray);

        return newArray;
    }

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