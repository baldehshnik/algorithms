package shuttle;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuttleSort<T extends Comparable<T>> {

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

    public T[] sorted(T @NotNull [] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }

    public List<T> sorted(@NotNull List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }
}