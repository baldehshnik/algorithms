package selection;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The class is used to implement selection sort algorithm for collections and not primitive arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class SelectionSort<T extends Comparable<T>> {

    /**
     * Implements selection sort and sorts array of <T> type.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(T @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            T minValue = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (minValue.compareTo(array[j]) > 0) {
                    minValue = array[j];
                    minId = j;
                }
            }

            array[minId] = array[i];
            array[i] = minValue;
        }
    }

    /**
     * Implements selection sort and sorts list of <T> type.
     * This method sorts the given list and returns nothing.
     *
     * @param list - list that should be sorted
     * */
    public void sort(@NotNull List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            T minValue = list.get(i);
            int minId = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (minValue.compareTo(list.get(j)) > 0) {
                    minValue = list.get(j);
                    minId = j;
                }
            }

            Collections.swap(list, minId, i);
        }
    }

    /**
     * Uses selection sort {@link SelectionSort#sort(Comparable[])} to sort an array copy of <T> type and returns him.
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
     * Uses selection sort {@link SelectionSort#sort(List)} to sort a list copy of <T> type and returns him.
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