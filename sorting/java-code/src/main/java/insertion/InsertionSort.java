package insertion;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The class is used to implement insertion sort algorithm for collections and not primitive arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class InsertionSort<T extends Comparable<T>> {

    /**
     * Implements insertion sort and sorts list of <T> type.
     * This method sorts the given list and returns nothing.
     *
     * @param list - list that should be sorted
     * */
    public void sort(@NotNull List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                T temp = list.get(i);
                int index = i;
                for (int j = 0; j <= i; j++) {
                    if (list.get(j).compareTo(temp) > 0) {
                        index = j;
                        break;
                    }
                }

                for (int j = index; j <= i; j++) {
                    Collections.swap(list, j, i);
                }
            }
        }
    }

    /**
     * Implements insertion sort and sorts array of <T> type.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(@NotNull T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].compareTo(array[i]) > 0) {
                T temp = array[i];
                int index = i;
                for (int j = 0; j <= i; j++) {
                    if (array[j].compareTo(temp) > 0) {
                        index = j;
                        break;
                    }
                }

                for (int j = index; j <= i; j++) {
                    T current = array[j];
                    array[j] = temp;
                    temp = current;
                }
            }
        }
    }

    /**
     * Uses insertion sort {@link InsertionSort#sort(List)} to sort a list copy of <T> type and returns him.
     *
     * @param list - list a copy of which should be sorted
     * @return - new list in the sorted order
     * */
    public List<T> sorted(@NotNull List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }

    /**
     * Uses insertion sort {@link InsertionSort#sort(Comparable[])} to sort an array copy of <T> type and returns him.
     *
     * @param array - array a copy of which should be sorted
     * @return - new array in the sorted order
     * */
    public T[] sorted(@NotNull T[] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }
}
