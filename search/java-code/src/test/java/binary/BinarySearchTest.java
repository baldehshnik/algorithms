package binary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch<Integer> binarySearch;
    private BinarySearch<String> stringBinarySearch;
    private BinarySearch<Double> doubleBinarySearch;

    @BeforeEach
    public void setUp() {
        binarySearch = new BinarySearch<>();
        stringBinarySearch = new BinarySearch<>();
        doubleBinarySearch = new BinarySearch<>();
    }

    @Test
    public void testSearchElementFoundInIntegerArray() {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(2, binarySearch.search(intArray, 3));
        assertEquals(7, binarySearch.search(intArray, 8));
    }

    @Test
    public void testSearchElementNotFoundInIntegerArray() {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(-1, binarySearch.search(intArray, 11));
        assertEquals(-1, binarySearch.search(intArray, 0));
    }

    @Test
    public void testSearchElementFoundInStringArray() {
        String[] strArray = { "apple", "banana", "cherry", "date", "fig", "grape" };
        assertEquals(1, stringBinarySearch.search(strArray, "banana"));
        assertEquals(4, stringBinarySearch.search(strArray, "fig"));
    }

    @Test
    public void testSearchElementNotFoundInStringArray() {
        String[] strArray = { "apple", "banana", "cherry", "date", "fig", "grape" };
        assertEquals(-1, stringBinarySearch.search(strArray, "kiwi"));
        assertEquals(-1, stringBinarySearch.search(strArray, "pear"));
    }

    @Test
    public void testSearchEmptyArray() {
        Integer[] emptyArray = {};
        assertEquals(-1, binarySearch.search(emptyArray, 5));
    }

    @Test
    public void testSearchSingleElementArray() {
        Integer[] singleElementArray = { 42 };
        assertEquals(0, binarySearch.search(singleElementArray, 42));
    }

    @Test
    public void testSearchElementAtStartOfArray() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        assertEquals(0, binarySearch.search(intArray, 1));
    }

    @Test
    public void testSearchElementAtEndOfArray() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        assertEquals(4, binarySearch.search(intArray, 5));
    }

    @Test
    public void testSearchElementInLargeArray() {
        Integer[] largeArray = new Integer[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArray[i] = i * 2;
        }

        assertEquals(500000, binarySearch.search(largeArray, 1000000));
    }

    @Test
    public void testSearchElementFoundInIntegerList() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(2, binarySearch.search(intList, 3));
        assertEquals(7, binarySearch.search(intList, 8));
    }

    @Test
    public void testSearchElementNotFoundInIntegerList() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(-1, binarySearch.search(intList, 11));
        assertEquals(-1, binarySearch.search(intList, 0));
    }

    @Test
    public void testSearchElementFoundInStringList() {
        List<String> strList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape"));
        assertEquals(1, stringBinarySearch.search(strList, "banana"));
        assertEquals(4, stringBinarySearch.search(strList, "fig"));
    }

    @Test
    public void testSearchElementNotFoundInStringList() {
        List<String> strList = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape"));
        assertEquals(-1, stringBinarySearch.search(strList, "kiwi"));
        assertEquals(-1, stringBinarySearch.search(strList, "pear"));
    }

    @Test
    public void testSearchEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        assertEquals(-1, binarySearch.search(emptyList, 5));
    }

    @Test
    public void testSearchSingleElementList() {
        List<Integer> singleElementList = new ArrayList<>(List.of(42));
        assertEquals(0, binarySearch.search(singleElementList, 42));
    }

    @Test
    public void testSearchElementAtStartOfList() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(0, binarySearch.search(intList, 1));
    }

    @Test
    public void testSearchElementAtEndOfList() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(4, binarySearch.search(intList, 5));
    }

    @Test
    public void testSearchElementInLargeList() {
        List<Integer> largeList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            largeList.add(i * 2);
        }
        assertEquals(500000, binarySearch.search(largeList, 1000000));
    }

    @Test
    public void testSearchElementFoundInDoubleList() {
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0);
        assertEquals(2, doubleBinarySearch.search(doubleList, 3.3));
        assertEquals(7, doubleBinarySearch.search(doubleList, 8.8));
    }

    @Test
    public void testSearchElementNotFoundInDoubleList() {
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0);
        assertEquals(-1, doubleBinarySearch.search(doubleList, 11.0));
        assertEquals(-1, doubleBinarySearch.search(doubleList, 0.0));
    }

    @Test
    public void testSearchElementAtStartOfDoubleList() {
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        assertEquals(0, doubleBinarySearch.search(doubleList, 1.1));
    }

    @Test
    public void testSearchElementAtEndOfDoubleList() {
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        assertEquals(4, doubleBinarySearch.search(doubleList, 5.5));
    }

    @Test
    public void testSearchElementInLargeDoubleList() {
        List<Double> largeDoubleList = Arrays.asList(new Double[1000000]);
        for (int i = 0; i < 1000000; i++) {
            largeDoubleList.set(i, i * 0.5);
        }
        assertEquals(300, doubleBinarySearch.search(largeDoubleList, 150.0));
    }
}