package binary;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/**
 * The class implements binary search for comparable generic type
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class BinarySearch<T extends Comparable<T>> {

    /**
     * This method implements binary search for a list with generic type
     *
     * @param list - sorted list of elements
     * @param element - search element
     * */
    public int search(@NotNull List<T> list, @NotNull T element) {
        int startIndex = 0;
        int endIndex = list.size() - 1;

        while (startIndex <= endIndex) {
            int averageIndex = startIndex + (endIndex - startIndex) / 2;
            if (element.compareTo(list.get(averageIndex)) == 0) {
                return averageIndex;
            }

            if (element.compareTo(list.get(averageIndex)) < 0) {
                endIndex = averageIndex - 1;
            } else {
                startIndex = averageIndex + 1;
            }
        }

        return -1;
    }

    /**
     * This method implements binary search for an array with generic type
     *
     * @param array - sorted array of elements
     * @param element - search element
     * */
    public int search(@NotNull T[] array, @NotNull T element) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int averageIndex = startIndex + (endIndex - startIndex) / 2;
            if (element.compareTo(array[averageIndex]) == 0) {
                return averageIndex;
            }

            if (element.compareTo(array[averageIndex]) < 0) {
                endIndex = averageIndex - 1;
            } else {
                startIndex = averageIndex + 1;
            }
        }

        return -1;
    }
}