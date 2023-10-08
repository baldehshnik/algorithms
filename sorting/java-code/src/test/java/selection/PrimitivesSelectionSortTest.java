package selection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimitivesSelectionSortTest {

    @Test
    public void testSortEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortAlreadySortedArray() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortReverseSortedArray() {
        int[] inputArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortRandomOrderArray() {
        int[] inputArray = {3, 1, 4, 2, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortArrayWithDuplicates() {
        int[] inputArray = {3, 1, 4, 2, 5, 1};
        int[] expectedArray = {1, 1, 2, 3, 4, 5};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortArrayWithNegativeNumbers() {
        int[] inputArray = {3, -1, 4, -2, 5};
        int[] expectedArray = {-2, -1, 3, 4, 5};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testSortEmptyDoubleArray() {
        double[] inputArray = {};
        double[] expectedArray = {};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray, 0.0);
    }

    @Test
    public void testSortAlreadySortedDoubleArray() {
        double[] inputArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray, 0.0);
    }

    @Test
    public void testSortReverseSortedDoubleArray() {
        double[] inputArray = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray, 0.0);
    }

    @Test
    public void testSortRandomOrderDoubleArray() {
        double[] inputArray = {3.5, 1.2, 4.9, 2.1, 5.7};
        double[] expectedArray = {1.2, 2.1, 3.5, 4.9, 5.7};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithDuplicates() {
        double[] inputArray = {3.3, 1.1, 4.4, 2.2, 1.1};
        double[] expectedArray = {1.1, 1.1, 2.2, 3.3, 4.4};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithNegativeNumbers() {
        double[] inputArray = {3.5, -1.2, 4.9, -2.1, 5.7};
        double[] expectedArray = {-2.1, -1.2, 3.5, 4.9, 5.7};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        sorter.sort(inputArray);

        assertArrayEquals(expectedArray, inputArray, 0.0);
    }

    @Test
    public void testSortedArrayWithPositiveIntegers() {
        int[] inputArray = {5, 2, 9, 1, 7};
        int[] expectedArray = {1, 2, 5, 7, 9};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        int[] sortedArray = sorter.sorted(inputArray);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedArrayWithNegativeIntegers() {
        int[] inputArray = {-5, -2, -9, -1, -7};
        int[] expectedArray = {-9, -7, -5, -2, -1};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        int[] sortedArray = sorter.sorted(inputArray);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedArrayWithDuplicates() {
        int[] inputArray = {3, 1, 4, 2, 1};
        int[] expectedArray = {1, 1, 2, 3, 4};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        int[] sortedArray = sorter.sorted(inputArray);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedDoubleArrayWithPositiveDoubles() {
        double[] inputArray = {5.5, 2.2, 9.9, 1.1, 7.7};
        double[] expectedArray = {1.1, 2.2, 5.5, 7.7, 9.9};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        double[] sortedArray = sorter.sorted(inputArray);

        assertArrayEquals(expectedArray, sortedArray, 0.0);
    }

    @Test
    public void testSortedDoubleArrayWithNegativeDoubles() {
        double[] inputArray = {-5.5, -2.2, -9.9, -1.1, -7.7};
        double[] expectedArray = {-9.9, -7.7, -5.5, -2.2, -1.1};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        double[] sortedArray = sorter.sorted(inputArray);

        assertArrayEquals(expectedArray, sortedArray, 0.0);
    }

    @Test
    public void testSortedDoubleArrayWithDuplicates() {
        double[] inputArray = {3.3, 1.1, 4.4, 2.2, 1.1};
        double[] expectedArray = {1.1, 1.1, 2.2, 3.3, 4.4};
        PrimitivesSelectionSort sorter = new PrimitivesSelectionSort();

        double[] sortedArray = sorter.sorted(inputArray);

        assertArrayEquals(expectedArray, sortedArray, 0.0);
    }
}