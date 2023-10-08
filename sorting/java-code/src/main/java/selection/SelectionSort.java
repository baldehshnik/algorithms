package selection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort<T extends Comparable<T>> {

    public void sort(T[] array) {
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

    public void sort(List<T> list) {
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

    public T[] sorted(T[] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }

    public List<T> sorted(List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }
}