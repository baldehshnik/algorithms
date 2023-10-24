package merge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimitivesMergeSortTest {

    @Test
    public void testIntSortWithUnsortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIntSortWithSortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIntSortWithEmptyArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {};
        int[] expected = {};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIntSortWithArrayOfSizeOne() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {42};
        int[] expected = {42};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIntSortWithLargeArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {5, 3, 1, 4, 2, 9, 7, 6, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testIntSortWithDuplicateValues() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {3, 2, 3, 1, 2, 1};
        int[] expected = {1, 1, 2, 2, 3, 3};
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testDoubleSortWithUnsortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {5.5, 3.3, 1.1, 4.4, 2.2};
        double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
        sorter.sort(input);
        assertArrayEquals(expected, input, 0.001);
    }

    @Test
    public void testDoubleSortWithSortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
        sorter.sort(input);
        assertArrayEquals(expected, input, 0.001);
    }

    @Test
    public void testDoubleSortWithEmptyArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {};
        double[] expected = {};
        sorter.sort(input);
        assertArrayEquals(expected, input, 0.001);
    }

    @Test
    public void testDoubleSortWithArrayOfSizeOne() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {3.14};
        double[] expected = {3.14};
        sorter.sort(input);
        assertArrayEquals(expected, input, 0.001);
    }

    @Test
    public void testDoubleSortWithLargeArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {5.5, 3.3, 1.1, 4.4, 2.2, 9.9, 7.7, 6.6, 8.8};
        double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        sorter.sort(input);
        assertArrayEquals(expected, input, 0.001);
    }

    @Test
    public void testDoubleSortWithDuplicateValues() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {3.3, 2.2, 3.3, 1.1, 2.2, 1.1};
        double[] expected = {1.1, 1.1, 2.2, 2.2, 3.3, 3.3};
        sorter.sort(input);
        assertArrayEquals(expected, input, 0.001);
    }

    @Test
    public void testIntSortedWithUnsortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = sorter.sorted(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntSortedWithSortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = sorter.sorted(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntSortedWithEmptyArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {};
        int[] expected = {};
        int[] result = sorter.sorted(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntSortedWithArrayOfSizeOne() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {42};
        int[] expected = {42};
        int[] result = sorter.sorted(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntSortedWithLargeArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {5, 3, 1, 4, 2, 9, 7, 6, 8};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = sorter.sorted(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testIntSortedWithDuplicateValues() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        int[] input = {3, 2, 3, 1, 2, 1};
        int[] expected = {1, 1, 2, 2, 3, 3};
        int[] result = sorter.sorted(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDoubleSortedWithUnsortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {5.5, 3.3, 1.1, 4.4, 2.2};
        double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] result = sorter.sorted(input);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testDoubleSortedWithSortedArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] result = sorter.sorted(input);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testDoubleSortedWithEmptyArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {};
        double[] expected = {};
        double[] result = sorter.sorted(input);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testDoubleSortedWithArrayOfSizeOne() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {3.14};
        double[] expected = {3.14};
        double[] result = sorter.sorted(input);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testDoubleSortedWithLargeArray() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {5.5, 3.3, 1.1, 4.4, 2.2, 9.9, 7.7, 6.6, 8.8};
        double[] expected = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        double[] result = sorter.sorted(input);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testDoubleSortedWithDuplicateValues() {
        PrimitivesMergeSort sorter = new PrimitivesMergeSort();
        double[] input = {3.3, 2.2, 3.3, 1.1, 2.2, 1.1};
        double[] expected = {1.1, 1.1, 2.2, 2.2, 3.3, 3.3};
        double[] result = sorter.sorted(input);
        assertArrayEquals(expected, result, 0.001);
    }
}