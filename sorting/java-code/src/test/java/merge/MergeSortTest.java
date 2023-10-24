package merge;

import entity.TestEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {

    @Test
    public void testIntegerSort() {
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] input = {5, 3, 1, 4, 2};
        Integer[] expected = {1, 2, 3, 4, 5};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testStringSort() {
        MergeSort<String> sorter = new MergeSort<>();
        String[] input = {"apple", "banana", "cherry", "date", "fig"};
        String[] expected = {"apple", "banana", "cherry", "date", "fig"};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testDoubleSort() {
        MergeSort<Double> sorter = new MergeSort<>();
        Double[] input = {5.5, 3.3, 1.1, 4.4, 2.2};
        Double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testCharacterSort() {
        MergeSort<Character> sorter = new MergeSort<>();
        Character[] input = {'e', 'a', 'c', 'd', 'b'};
        Character[] expected = {'a', 'b', 'c', 'd', 'e'};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testBooleanSort() {
        MergeSort<Boolean> sorter = new MergeSort<>();
        Boolean[] input = {true, false, true, true, false};
        Boolean[] expected = {false, false, true, true, true};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIntegerListSort() {
        MergeSort<Integer> sorter = new MergeSort<>();
        List<Integer> input = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        sorter.sort(input);
        assertEquals(expected, input);
    }

    @Test
    public void testStringListSort() {
        MergeSort<String> sorter = new MergeSort<>();
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> expected = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        sorter.sort(input);
        assertEquals(expected, input);
    }

    @Test
    public void testDoubleListSort() {
        MergeSort<Double> sorter = new MergeSort<>();
        List<Double> input = Arrays.asList(5.5, 3.3, 1.1, 4.4, 2.2);
        List<Double> expected = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        sorter.sort(input);
        assertEquals(expected, input);
    }

    @Test
    public void testCharacterListSort() {
        MergeSort<Character> sorter = new MergeSort<>();
        List<Character> input = Arrays.asList('e', 'a', 'c', 'd', 'b');
        List<Character> expected = Arrays.asList('a', 'b', 'c', 'd', 'e');
        sorter.sort(input);
        assertEquals(expected, input);
    }

    @Test
    public void testBooleanListSort() {
        MergeSort<Boolean> sorter = new MergeSort<>();
        List<Boolean> input = Arrays.asList(true, false, true, true, false);
        List<Boolean> expected = Arrays.asList(false, false, true, true, true);
        sorter.sort(input);
        assertEquals(expected, input);
    }

    @Test
    public void testIntegerArraySorted() {
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] input = {5, 3, 1, 4, 2};
        Integer[] result = sorter.sorted(input);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDoubleArraySorted() {
        MergeSort<Double> sorter = new MergeSort<>();
        Double[] input = {5.5, 3.3, 1.1, 4.4, 2.2};
        Double[] result = sorter.sorted(input);
        Double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testStringArraySorted() {
        MergeSort<String> sorter = new MergeSort<>();
        String[] input = {"apple", "banana", "cherry", "date", "fig"};
        String[] result = sorter.sorted(input);
        String[] expected = {"apple", "banana", "cherry", "date", "fig"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntegerArraySortedWithDuplicates() {
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] input = {5, 3, 1, 4, 5, 2, 4, 4};
        Integer[] result = sorter.sorted(input);
        Integer[] expected = {1, 2, 3, 4, 4, 4, 5, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDoubleArraySortedWithDuplicates() {
        MergeSort<Double> sorter = new MergeSort<>();
        Double[] input = {5.5, 3.3, 1.1, 5.5, 4.4, 2.2, 4.4, 4.4};
        Double[] result = sorter.sorted(input);
        Double[] expected = {1.1, 2.2, 3.3, 4.4, 4.4, 4.4, 5.5, 5.5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testStringArraySortedWithDuplicates() {
        MergeSort<String> sorter = new MergeSort<>();
        String[] input = {"apple", "banana", "banana", "cherry", "date", "fig", "banana", "fig"};
        String[] result = sorter.sorted(input);
        String[] expected = {"apple", "banana", "banana", "banana", "cherry", "date", "fig", "fig"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntegerListSorted() {
        MergeSort<Integer> sorter = new MergeSort<>();
        List<Integer> input = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> result = sorter.sorted(input);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testDoubleListSorted() {
        MergeSort<Double> sorter = new MergeSort<>();
        List<Double> input = Arrays.asList(5.5, 3.3, 1.1, 4.4, 2.2);
        List<Double> result = sorter.sorted(input);
        List<Double> expected = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        assertEquals(expected, result);
    }

    @Test
    public void testStringListSorted() {
        MergeSort<String> sorter = new MergeSort<>();
        List<String> input = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> result = sorter.sorted(input);
        List<String> expected = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        assertEquals(expected, result);
    }

    @Test
    public void testIntegerListSortedWithDuplicates() {
        MergeSort<Integer> sorter = new MergeSort<>();
        List<Integer> input = Arrays.asList(5, 3, 1, 4, 5, 2, 4, 4);
        List<Integer> result = sorter.sorted(input);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testDoubleListSortedWithDuplicates() {
        MergeSort<Double> sorter = new MergeSort<>();
        List<Double> input = Arrays.asList(5.5, 3.3, 1.1, 5.5, 4.4, 2.2, 4.4, 4.4);
        List<Double> result = sorter.sorted(input);
        List<Double> expected = Arrays.asList(1.1, 2.2, 3.3, 4.4, 4.4, 4.4, 5.5, 5.5);
        assertEquals(expected, result);
    }

    @Test
    public void testStringListSortedWithDuplicates() {
        MergeSort<String> sorter = new MergeSort<>();
        List<String> input = Arrays.asList("apple", "banana", "banana", "cherry", "date", "fig", "banana", "fig");
        List<String> result = sorter.sorted(input);
        List<String> expected = Arrays.asList("apple", "banana", "banana", "banana", "cherry", "date", "fig", "fig");
        assertEquals(expected, result);
    }

    @Test
    public void testEntityArraySort() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] input = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 20)
        };
        TestEntity[] expected = {
                new TestEntity("Charlie", 20),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEntityListSort() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] entities = {
                new TestEntity("David", 28),
                new TestEntity("Eve", 25),
                new TestEntity("Frank", 33)
        };
        TestEntity[] expected = {
                new TestEntity("Eve", 25),
                new TestEntity("David", 28),
                new TestEntity("Frank", 33)
        };
        sorter.sort(entities);
        assertArrayEquals(expected, entities);
    }

    @Test
    public void testEntityArraySorted() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] input = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 20)
        };
        TestEntity[] result = sorter.sorted(input);
        TestEntity[] expected = {
                new TestEntity("Charlie", 20),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };
        assertArrayEquals(expected, result);
    }

    @Test
    public void testEntityListSorted() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] entities = {
                new TestEntity("David", 28),
                new TestEntity("Eve", 25),
                new TestEntity("Frank", 33)
        };
        List<TestEntity> result = sorter.sorted(Arrays.asList(entities));
        TestEntity[] expected = {
                new TestEntity("Eve", 25),
                new TestEntity("David", 28),
                new TestEntity("Frank", 33)
        };
        assertArrayEquals(expected, result.toArray());
    }

    @Test
    public void testEntityArraySortWithDuplicates() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] input = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Alice", 20),
                new TestEntity("Charlie", 20)
        };
        TestEntity[] expected = {
                new TestEntity("Charlie", 20),
                new TestEntity("Alice", 20),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEntityListSortWithDuplicates() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] entities = {
                new TestEntity("David", 28),
                new TestEntity("Eve", 25),
                new TestEntity("David", 33),
                new TestEntity("Frank", 25)
        };
        TestEntity[] expected = {
                new TestEntity("Frank", 25),
                new TestEntity("Eve", 25),
                new TestEntity("David", 28),
                new TestEntity("David", 33)
        };
        sorter.sort(entities);
        assertArrayEquals(expected, entities);
    }

    @Test
    public void testEntityArraySortedWithEmptyArray() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        TestEntity[] input = new TestEntity[0];
        TestEntity[] result = sorter.sorted(input);
        assertArrayEquals(new TestEntity[0], result);
    }

    @Test
    public void testEntityListSortedWithEmptyList() {
        MergeSort<TestEntity> sorter = new MergeSort<>();
        List<TestEntity> entities = new ArrayList<>();
        List<TestEntity> result = sorter.sorted(entities);
        assertEquals(Collections.emptyList(), result);
    }
}