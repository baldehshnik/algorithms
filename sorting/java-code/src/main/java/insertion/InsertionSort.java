package insertion;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertionSort<T extends Comparable<T>> {

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

    public List<T> sorted(@NotNull List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }

    public T[] sorted(@NotNull T[] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }
}
