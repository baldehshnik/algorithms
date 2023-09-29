package bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(List<T> list) {
        if (list == null) {
            return;
        }

        int length = list.size();
        boolean swapped;
        for (int i = 0; i < length; i++) {
            swapped = false;
            for (int j = 1; j < length - i; j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, j - 1, j);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public void sort(T[] array) {
        if (array == null) {
            return;
        }

        int length = array.length;
        boolean swapped;
        for (int i = 0; i < length; i++) {
            swapped = false;
            for (int j = 1; j < length - i; j++) {
                T temp = array[j - 1];
                if (temp.compareTo(array[j]) > 0) {
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public List<T> sorted(List<T> list) {
        if (list == null) {
            return null;
        }

        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }

    public T[] sorted(T[] array) {
        if (array == null) {
            return null;
        }

        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }
}
