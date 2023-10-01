package insertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimitivesInsertionSortTest {

    @Test
    public void testSortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        new PrimitivesInsertionSort().sort(sortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testReverseSortedArray() {
        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        new PrimitivesInsertionSort().sort(reverseSortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, reverseSortedArray);
    }

    @Test
    public void testDuplicateValuesArray() {
        int[] duplicateArray = {3, 1, 4, 1, 5, 2};
        new PrimitivesInsertionSort().sort(duplicateArray);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5}, duplicateArray);
    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        new PrimitivesInsertionSort().sort(emptyArray);
        assertArrayEquals(new int[]{}, emptyArray);
    }

    @Test
    public void testSingleElementArray() {
        int[] singleElementArray = {42};
        new PrimitivesInsertionSort().sort(singleElementArray);
        assertArrayEquals(new int[]{42}, singleElementArray);
    }

    @Test
    public void testLargeRandomArray() {
        int[] largeRandomArray = {5, 2, 9, 1, 5, 7, 8, 3, 6, 4};
        new PrimitivesInsertionSort().sort(largeRandomArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9}, largeRandomArray);
    }

    @Test
    public void testAllNegativeValuesArray() {
        int[] negativeArray = {-5, -2, -9, -1, -3, -7, -8, -4, -6};
        new PrimitivesInsertionSort().sort(negativeArray);
        assertArrayEquals(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1}, negativeArray);
    }

    @Test
    public void testAllPositiveValuesArray() {
        int[] positiveArray = {5, 2, 9, 1, 3, 7, 8, 4, 6};
        new PrimitivesInsertionSort().sort(positiveArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, positiveArray);
    }

    @Test
    public void testMixedValuesArray() {
        int[] mixedArray = {5, -2, 9, -1, 3, -7, 8, -4, 6};
        new PrimitivesInsertionSort().sort(mixedArray);
        assertArrayEquals(new int[]{-7, -4, -2, -1, 3, 5, 6, 8, 9}, mixedArray);
    }

    @Test
    public void testIdenticalValuesArray() {
        int[] identicalArray = {3, 3, 3, 3, 3};
        new PrimitivesInsertionSort().sort(identicalArray);
        assertArrayEquals(new int[]{3, 3, 3, 3, 3}, identicalArray);
    }

    @Test
    public void testSortDoubleArray() {
        double[] sortedDoubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        new PrimitivesInsertionSort().sort(sortedDoubleArray);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedDoubleArray, 0.0001);
    }

    @Test
    public void testSortReverseSortedDoubleArray() {
        double[] reverseSortedDoubleArray = {5.0, 4.0, 3.0, 2.0, 1.0};
        new PrimitivesInsertionSort().sort(reverseSortedDoubleArray);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, reverseSortedDoubleArray, 0.0001);
    }

    @Test
    public void testSrtDuplicateDoubleValuesArray() {
        double[] duplicateDoubleArray = {3.0, 1.0, 4.0, 1.0, 5.0, 2.0};
        new PrimitivesInsertionSort().sort(duplicateDoubleArray);
        assertArrayEquals(new double[]{1.0, 1.0, 2.0, 3.0, 4.0, 5.0}, duplicateDoubleArray, 0.0001);
    }

    @Test
    public void testSortEmptyDoubleArray() {
        double[] emptyDoubleArray = {};
        new PrimitivesInsertionSort().sort(emptyDoubleArray);
        assertArrayEquals(new double[]{}, emptyDoubleArray, 0.0001);
    }

    @Test
    public void testSortSingleElementDoubleArray() {
        double[] singleElementDoubleArray = {42.0};
        new PrimitivesInsertionSort().sort(singleElementDoubleArray);
        assertArrayEquals(new double[]{42.0}, singleElementDoubleArray, 0.0001);
    }

    @Test
    public void testLargeRandomDoubleArray() {
        double[] largeRandomDoubleArray = {5.0, 2.0, 9.0, 1.0, 5.0, 7.0, 8.0, 3.0, 6.0, 4.0};
        new PrimitivesInsertionSort().sort(largeRandomDoubleArray);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 7.0, 8.0, 9.0}, largeRandomDoubleArray, 0.0001);
    }

    @Test
    public void testMixedDoubleValuesArray() {
        double[] mixedDoubleArray = {5.0, -2.0, 9.0, -1.0, 3.0, -7.0, 8.0, -4.0, 6.0};
        new PrimitivesInsertionSort().sort(mixedDoubleArray);
        assertArrayEquals(new double[]{-7.0, -4.0, -2.0, -1.0, 3.0, 5.0, 6.0, 8.0, 9.0}, mixedDoubleArray, 0.0001);
    }

    @Test
    public void testIdenticalDoubleValuesArray() {
        double[] identicalDoubleArray = {3.0, 3.0, 3.0, 3.0, 3.0};
        new PrimitivesInsertionSort().sort(identicalDoubleArray);
        assertArrayEquals(new double[]{3.0, 3.0, 3.0, 3.0, 3.0}, identicalDoubleArray, 0.0001);
    }

    @Test
    public void testDoubleArrayWithNumbersAfterDecimalPoint() {
        double[] doubleArray = {3.14, 2.71, 1.0, 0.5, 2.0};
        new PrimitivesInsertionSort().sort(doubleArray);
        assertArrayEquals(new double[]{0.5, 1.0, 2.0, 2.71, 3.14}, doubleArray, 0.0001);
    }

    @Test
    public void testDoubleArrayWithNegativeNumbersAfterDecimalPoint() {
        double[] negativeDoubleArray = {-3.14, -2.71, -1.0, -0.5, -2.0};
        new PrimitivesInsertionSort().sort(negativeDoubleArray);
        assertArrayEquals(new double[]{-3.14, -2.71, -2.0, -1.0, -0.5}, negativeDoubleArray, 0.0001);
    }

    @Test
    public void testDoubleArrayWithMixedNumbersAfterDecimalPoint() {
        double[] mixedDoubleArray = {3.14, -2.71, 1.0, -0.5, 2.0};
        new PrimitivesInsertionSort().sort(mixedDoubleArray);
        assertArrayEquals(new double[]{-2.71, -0.5, 1.0, 2.0, 3.14}, mixedDoubleArray, 0.0001);
    }

    @Test
    public void testDoubleArrayWithIdenticalNumbersAfterDecimalPoint() {
        double[] identicalDoubleArray = {1.12345, 1.12345, 1.12345, 1.12345};
        new PrimitivesInsertionSort().sort(identicalDoubleArray);
        assertArrayEquals(new double[]{1.12345, 1.12345, 1.12345, 1.12345}, identicalDoubleArray, 0.0001);
    }

    @Test
    public void testSortedIntArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testReverseSortedIntArray() {
        int[] originalArray = {5, 4, 3, 2, 1};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testDuplicateValuesIntArray() {
        int[] originalArray = {3, 1, 4, 1, 5, 2};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testEmptyIntArray() {
        int[] originalArray = {};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testSingleElementIntArray() {
        int[] originalArray = {42};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{42}, result);
    }

    @Test
    public void testUnsortedIntArray() {
        int[] originalArray = {9, 3, 7, 1, 6};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{1, 3, 6, 7, 9}, result);
    }

    @Test
    public void testLargeIntArray() {
        int[] originalArray = {1000, 500, 10000, 250, 100, 100000};
        int[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new int[]{100, 250, 500, 1000, 10000, 100000}, result);
    }

    @Test
    public void testSortedDoubleArray() {
        double[] originalArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, result, 0.0001);
    }

    @Test
    public void testReverseSortedDoubleArray() {
        double[] originalArray = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, result, 0.0001);
    }

    @Test
    public void testDuplicateDoubleValuesArray() {
        double[] originalArray = {3.0, 1.0, 4.0, 1.0, 5.0, 2.0};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{1.0, 1.0, 2.0, 3.0, 4.0, 5.0}, result, 0.0001);
    }

    @Test
    public void testEmptyDoubleArray() {
        double[] originalArray = {};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{}, result, 0.0001);
    }

    @Test
    public void testSingleElementDoubleArray() {
        double[] originalArray = {42.0};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{42.0}, result, 0.0001);
    }

    @Test
    public void testUnsortedDoubleArray() {
        double[] originalArray = {9.8, 3.14, 7.0, 1.1, 6.25};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{1.1, 3.14, 6.25, 7.0, 9.8}, result, 0.0001);
    }

    @Test
    public void testLargeDoubleArray() {
        double[] originalArray = {1000.0, 500.0, 10000.0, 250.0, 100.0, 100000.0};
        double[] result = new PrimitivesInsertionSort().sorted(originalArray);
        assertArrayEquals(new double[]{100.0, 250.0, 500.0, 1000.0, 10000.0, 100000.0}, result, 0.0001);
    }
}
