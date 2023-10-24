package merge;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort<T extends Comparable<T>> {

    public void sort(T @NotNull [] array) {
        if (array.length <= 1) return;

        int arrayPartSize = array.length / 2;
        T[] firstPartOfArray = Arrays.copyOfRange(array, 0, arrayPartSize);
        T[] secondPartOfArray = Arrays.copyOfRange(array, arrayPartSize, array.length);

        sort(firstPartOfArray);
        sort(secondPartOfArray);
        merge(array, firstPartOfArray, secondPartOfArray);
    }

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

    public T[] sorted(T  @NotNull [] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        sort(newArray);

        return newArray;
    }

    public List<T> sorted(@NotNull List<T> list) {
        List<T> newList = new ArrayList<>(list);
        sort(newList);

        return newList;
    }

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