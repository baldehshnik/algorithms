package selection;

import entity.TestEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {

    @Test
    public void testSortIntegerArray() {
        Integer[] array = {5, 2, 9, 1, 7};
        Integer[] expectedArray = {1, 2, 5, 7, 9};
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortStringArray() {
        String[] array = {"apple", "banana", "cherry", "date", "fig"};
        String[] expectedArray = {"apple", "banana", "cherry", "date", "fig"};
        SelectionSort<String> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortDoubleArray() {
        Double[] array = {3.5, 1.2, 4.9, 2.1, 5.7};
        Double[] expectedArray = {1.2, 2.1, 3.5, 4.9, 5.7};
        SelectionSort<Double> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortEmptyArray() {
        String[] array = {};
        String[] expectedArray = {};
        SelectionSort<String> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortAlreadySortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] expectedArray = {1, 2, 3, 4, 5};
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortArrayWithDuplicateElements() {
        Integer[] array = {5, 2, 9, 2, 7, 2};
        Integer[] expectedArray = {2, 2, 2, 5, 7, 9};
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortArrayWithNegativeElements() {
        Integer[] array = {5, -2, 9, -1, 7};
        Integer[] expectedArray = {-2, -1, 5, 7, 9};
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortIntegerList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        List<Integer> expectedList = Arrays.asList(1, 2, 5, 7, 9);
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortStringList() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        List<String> expectedList = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        SelectionSort<String> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortDoubleList() {
        List<Double> list = new ArrayList<>(Arrays.asList(3.5, 1.2, 4.9, 2.1, 5.7));
        List<Double> expectedList = Arrays.asList(1.2, 2.1, 3.5, 4.9, 5.7);
        SelectionSort<Double> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortEmptyList() {
        List<String> list = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        SelectionSort<String> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortListWithDuplicateElements() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 2, 7, 2));
        List<Integer> expectedList = Arrays.asList(2, 2, 2, 5, 7, 9);
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortListWithNegativeElements() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, -2, 9, -1, 7));
        List<Integer> expectedList = Arrays.asList(-2, -1, 5, 7, 9);
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortListAlreadySorted() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5);
        SelectionSort<Integer> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortedIntegerArray() {
        Integer[] array = {5, 2, 9, 1, 7};
        Integer[] expectedArray = {1, 2, 5, 7, 9};
        SelectionSort<Integer> sorter = new SelectionSort<>();

        Integer[] sortedArray = sorter.sorted(array);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedStringArray() {
        String[] array = {"apple", "banana", "cherry", "date", "fig"};
        String[] expectedArray = {"apple", "banana", "cherry", "date", "fig"};
        SelectionSort<String> sorter = new SelectionSort<>();

        String[] sortedArray = sorter.sorted(array);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedDoubleArray() {
        Double[] array = {3.5, 1.2, 4.9, 2.1, 5.7};
        Double[] expectedArray = {1.2, 2.1, 3.5, 4.9, 5.7};
        SelectionSort<Double> sorter = new SelectionSort<>();

        Double[] sortedArray = sorter.sorted(array);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedIntegerList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        List<Integer> expectedList = Arrays.asList(1, 2, 5, 7, 9);
        SelectionSort<Integer> sorter = new SelectionSort<>();

        List<Integer> sortedList = sorter.sorted(list);

        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortedStringList() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        List<String> expectedList = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        SelectionSort<String> sorter = new SelectionSort<>();

        List<String> sortedList = sorter.sorted(list);

        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortedDoubleList() {
        List<Double> list = new ArrayList<>(Arrays.asList(3.5, 1.2, 4.9, 2.1, 5.7));
        List<Double> expectedList = Arrays.asList(1.2, 2.1, 3.5, 4.9, 5.7);
        SelectionSort<Double> sorter = new SelectionSort<>();

        List<Double> sortedList = sorter.sorted(list);

        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortedEmptyList() {
        List<String> list = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();
        SelectionSort<String> sorter = new SelectionSort<>();

        List<String> sortedList = sorter.sorted(list);

        assertEquals(expectedList, sortedList);
    }

    @Test
    public void testSortWithTestEntityArray() {
        TestEntity[] array = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 20)
        };

        TestEntity[] expectedArray = {
                new TestEntity("Charlie", 20),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };

        SelectionSort<TestEntity> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortWithTestEntityList() {
        List<TestEntity> list = new ArrayList<>(Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("David", 28),
                new TestEntity("Frank", 25)
        ));
        List<TestEntity> expectedList = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Frank", 25),
                new TestEntity("David", 28)
        );
        SelectionSort<TestEntity> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortWithTestEntityArrayAndDuplicates() {
        TestEntity[] array = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 20),
                new TestEntity("Bob", 30)
        };
        TestEntity[] expectedArray = {
                new TestEntity("Charlie", 20),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Bob", 30)
        };
        SelectionSort<TestEntity> sorter = new SelectionSort<>();

        sorter.sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortWithTestEntityListAndEmptyList() {
        List<TestEntity> list = new ArrayList<>();
        List<TestEntity> expectedList = new ArrayList<>();
        SelectionSort<TestEntity> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }

    @Test
    public void testSortWithTestEntityListAndSingleElement() {
        List<TestEntity> list = new ArrayList<>(List.of(new TestEntity("Alice", 25)));
        List<TestEntity> expectedList = List.of(new TestEntity("Alice", 25));
        SelectionSort<TestEntity> sorter = new SelectionSort<>();

        sorter.sort(list);

        assertEquals(expectedList, list);
    }
}