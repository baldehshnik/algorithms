package merge;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The class is used to implement the merge sort algorithm for collections and not primitive arrays.
 *
 * @author Shcherba Vladislav
 * @version 1.0
 * */
public class MergeSort<T extends Comparable<T>> {

    /**
     * Implements merge sort and sorts array of <T> type.
     * This method uses the merge function {@link MergeSort#merge(Comparable[], Comparable[], Comparable[])} to merge two separated arrays.
     * This method sorts the given array and returns nothing.
     *
     * @param array - array that should be sorted
     * */
    public void sort(T @NotNull [] array) {
        if (array.length <= 1) return;

        int arrayPartSize = array.length / 2;
        T[] firstPartOfArray = Arrays.copyOfRange(array, 0, arrayPartSize);
        T[] secondPartOfArray = Arrays.copyOfRange(array, arrayPartSize, array.length);

        sort(firstPartOfArray);
        sort(secondPartOfArray);
        merge(array, firstPartOfArray, secondPartOfArray);
    }

    /**
     * Implements merge sort and sorts list of <T> type.
     * This method uses the merge function {@link MergeSort#merge(List, Comparable[], Comparable[])} to merge two separated arrays.
     * This method sorts the given list and returns nothing.
     *
     * @param list - list that should be sorted
     *
     * @throws ClassCastException when can't create array of list type
     * */
    @SuppressWarnings("unchecked")
    public void sort(@NotNull List<T> list) throws ClassCastException {
        if (list.size() <= 1) return;

        int listSize = list.size();
        int listPartSize = listSize / 2;
        Class<?> clazz = list.get(0).getClass();

        T[] firstPartOfList = (T[]) Array.newInstance(clazz, listPartSize);
        list.subList(0, listPartSize).toArray(firstPartOfList);

        System.out.println(Arrays.toString(firstPartOfList));

        T[] secondPartOfList = (T[]) Array.newInstance(clazz, listSize - listPartSize);
        list.subList(listPartSize, listSize).toArray(secondPartOfList);

        System.out.println(Arrays.toString(secondPartOfList));

        sort(firstPartOfList);
        sort(secondPartOfList);
        merge(list, firstPartOfList, secondPartOfList);
    }

    /**
     * Uses merge sort {@link MergeSort#merge(Comparable[], Comparable[], Comparable[])} to sort an array copy of <T> type and returns him.
     *
     * @param array - array a copy of which should be sorted
     * @return - new array in the sorted order
     * */
    public T[] sorted(T  @NotNull [] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }

    /**
     * Uses merge sort {@link MergeSort#merge(List, Comparable[], Comparable[])} to sort a list copy of <T> type and returns him.
     *
     * @param list - list a copy of which should be sorted
     * @return - new list in the sorted order
     *
     * @throws ClassCastException because uses {@link MergeSort#sort(List)} function
     * */
    public List<T> sorted(@NotNull List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }

    /**
     * Merges the given two arrays in the given destination array in the sorted order.
     *
     * @param destination - array that should contain the given arrays in the sorted order and in the right place
     * @param array1 - array that should be merged with array2 variable
     * @param array2 - array that should be merged with array1 variable
     * */
    private void merge(T @NotNull [] destination, T @NotNull [] array1, T @NotNull [] array2) {
        int index1 = 0, index2 = 0;
        int maxLength = array1.length + array2.length;

        for (int i = 0; i < maxLength; i++) {
            if (index1 == array1.length) {
                destination[i] = array2[index2];
                index2++;
            } else if (index2 == array2.length) {
                destination[i] = array1[index1];
                index1++;
            } else if (array2[index2].compareTo(array1[index1]) > 0) {
                destination[i] = array1[index1];
                index1++;
            } else {
                destination[i] = array2[index2];
                index2++;
            }
        }
    }

    /**
     * Merges the given two arrays in the given destination list in the sorted order.
     *
     * @param destination - list that should contain the given arrays in the sorted order and in the right place
     * @param array1 - array that should be merged with array2 variable
     * @param array2 - array that should be merged with array1 variable
     * */
    private void merge(@NotNull List<T> destination, T @NotNull [] array1, T @NotNull [] array2) {
        int index1 = 0, index2 = 0;
        int maxLength = array1.length + array2.length;

        for (int i = 0; i < maxLength; i++) {
            if (index1 == array1.length) {
                destination.set(i, array2[index2]);
                index2++;
            } else if (index2 == array2.length) {
                destination.set(i, array1[index1]);
                index1++;
            } else if (array2[index2].compareTo(array1[index1]) > 0) {
                destination.set(i, array1[index1]);
                index1++;
            } else {
                destination.set(i, array2[index2]);
                index2++;
            }
        }
    }
}