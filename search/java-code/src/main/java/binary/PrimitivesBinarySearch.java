package binary;

import org.jetbrains.annotations.NotNull;

public class PrimitivesBinarySearch {

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