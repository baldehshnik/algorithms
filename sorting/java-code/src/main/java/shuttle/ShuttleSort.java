package shuttle;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The class is used to implement shuttle sort algorithm for collections and not primitive arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class ShuttleSort<T extends Comparable<T>> {

    /**
     * Implements shuttle sort and sorts array of <T> type.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(T @NotNull [] array) {
        boolean swapped = false;
        int start = -1;
        int end = array.length - 1;

        do {
            start++;
            for (int i = start; i < end; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
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
                if (array[i - 1].compareTo(array[i]) > 0) {
                    T temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /**
     * Implements shuttle sort and sorts list of <T> type.
     * This method sorts the given list and returns nothing.
     *
     * @param list - list that should be sorted
     * */
    public void sort(@NotNull List<T> list) {
        boolean swapped = false;
        int start = -1;
        int end = list.size() - 1;

        do {
            start++;
            for (int i = start; i < end; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            end--;
            swapped = false;
            for (int i = end; i > start; i--) {
                if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                    T temp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /**
     * Uses shuttle sort {@link ShuttleSort#sort(Comparable[])} to sort an array copy of <T> type and returns him.
     *
     * @param array - array a copy of which should be sorted
     * @return - new array in the sorted order
     * */
    public T[] sorted(T @NotNull [] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }

    /**
     * Uses shuttle sort {@link ShuttleSort#sort(List)} to sort a list copy of <T> type and returns him.
     *
     * @param list - list a copy of which should be sorted
     * @return - new list in the sorted order
     * */
    public List<T> sorted(@NotNull List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }
}