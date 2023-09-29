package bubble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimitivesBubbleSortTest {

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] expected = {};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithDuplicateValues() {
        int[] array = {3, 2, 1, 2, 3};
        int[] expected = {1, 2, 2, 3, 3};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithNegativeValues() {
        int[] array = {-3, 2, -1, 0, 3};
        int[] expected = {-3, -1, 0, 2, 3};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithOneElement() {
        int[] array = {42};
        int[] expected = {42};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testLargeArray() {
        int[] array = {5, 2, 9, 1, 5, 3, 8, 4, 7, 6};
        int[] expected = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testAllEqualElements() {
        int[] array = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithMaxIntValue() {
        int[] array = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE};
        int[] expected = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithNullValues() {
        int[] array = null;
        int[] expected = null;
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortedFunctionWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithArrayWithDuplicateValues() {
        int[] array = {3, 2, 1, 2, 3};
        int[] expected = {1, 2, 2, 3, 3};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithArrayWithNegativeValues() {
        int[] array = {-3, 2, -1, 0, 3};
        int[] expected = {-3, -1, 0, 2, 3};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithArrayWithOneElement() {
        int[] array = {42};
        int[] expected = {42};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithLargeArray() {
        int[] array = {5, 2, 9, 1, 5, 3, 8, 4, 7, 6};
        int[] expected = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithAllEqualElements() {
        int[] array = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithArrayWithMaxIntValue() {
        int[] array = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE};
        int[] expected = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedFunctionWithNullValues() {
        int[] array = null;
        int[] expected = null;
        int[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortDoubleArrayWithEmptyArray() {
        double[] array = {};
        double[] expected = {};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithAlreadySortedArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithReverseSortedArray() {
        double[] array = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithArrayWithDuplicateValues() {
        double[] array = {3.0, 2.0, 1.0, 2.0, 3.0};
        double[] expected = {1.0, 2.0, 2.0, 3.0, 3.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithArrayWithNegativeValues() {
        double[] array = {-3.0, 2.0, -1.0, 0.0, 3.0};
        double[] expected = {-3.0, -1.0, 0.0, 2.0, 3.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithArrayWithOneElement() {
        double[] array = {42.0};
        double[] expected = {42.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithLargeArray() {
        double[] array = {5.0, 2.0, 9.0, 1.0, 5.0, 3.0, 8.0, 4.0, 7.0, 6.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithAllEqualElements() {
        double[] array = {0.0, 0.0, 0.0, 0.0, 0.0};
        double[] expected = {0.0, 0.0, 0.0, 0.0, 0.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithNullArray() {
        double[] array = null;
        double[] expected = null;
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.0);
    }

    @Test
    public void testSortDoubleArrayWithNumbersAfterDecimalPoint() {
        double[] array = {3.14, 2.71, 1.618, 2.0, 3.0};
        double[] expected = {1.618, 2.0, 2.71, 3.0, 3.14};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.001);
    }

    @Test
    public void testSortDoubleArrayWithNegativeNumbersAfterDecimalPoint() {
        double[] array = {-3.14, -2.71, -1.618, -2.0, -3.0};
        double[] expected = {-3.14, -3.0, -2.71, -2.0, -1.618};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.001);
    }

    @Test
    public void testSortDoubleArrayWithMixedNumbers() {
        double[] array = {3.14, -2.71, 1.618, -2.0, 0.0};
        double[] expected = {-2.71, -2.0, 0.0, 1.618, 3.14};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.001);
    }

    @Test
    public void testSortDoubleArrayWithLargeNumbers() {
        double[] array = {10000.0, 1000000.0, 100.0, 10000000.0, 1000.0};
        double[] expected = {100.0, 1000.0, 10000.0, 1000000.0, 10000000.0};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.001);
    }

    @Test
    public void testSortDoubleArrayWithMixedSignificantDigits() {
        double[] array = {3.14159, 2.71828, 1.61803398875};
        double[] expected = {1.61803398875, 2.71828, 3.14159};
        new PrimitivesBubbleSort().sort(array);
        assertArrayEquals(expected, array, 0.00001);
    }

    @Test
    public void testSortedFunctionWithNumbersAfterDecimalPoint() {
        double[] array = {3.14, 2.71, 1.618, 2.0, 3.0};
        double[] expected = {1.618, 2.0, 2.71, 3.0, 3.14};
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001); // Specify a small delta for double comparison
    }

    @Test
    public void testSortedFunctionWithNegativeNumbersAfterDecimalPoint() {
        double[] array = {-3.14, -2.71, -1.618, -2.0, -3.0};
        double[] expected = {-3.14, -3.0, -2.71, -2.0, -1.618}; // Correctly sorted order
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testSortedFunctionWithMixedNumbers() {
        double[] array = {3.14, -2.71, 1.618, -2.0, 0.0};
        double[] expected = {-2.71, -2.0, 0.0, 1.618, 3.14};
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testSortedFunctionWithLargeNumbers() {
        double[] array = {10000.0, 1000000.0, 100.0, 10000000.0, 1000.0};
        double[] expected = {100.0, 1000.0, 10000.0, 1000000.0, 10000000.0};
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testSortedFunctionWithMixedSignificantDigits() {
        double[] array = {3.14159, 2.71828, 1.61803398875};
        double[] expected = {1.61803398875, 2.71828, 3.14159};
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.00001); // Specify a small delta for double comparison
    }

    @Test
    public void testSortedFunctionWithEmptyArrayAndPrimitives() {
        double[] array = {};
        double[] expected = {};
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testSortedFunctionWithNullArray() {
        double[] array = null;
        double[] expected = null;
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001);
    }

    @Test
    public void testSortedFunctionWithSingleElementArrayAndPrimitives() {
        double[] array = {42.0};
        double[] expected = {42.0};
        double[] result = new PrimitivesBubbleSort().sorted(array);
        assertArrayEquals(expected, result, 0.001);
    }
}