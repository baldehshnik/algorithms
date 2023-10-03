package binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimitivesBinarySearchTest {

    @Test
    public void testSearchElementFoundInArray() {
        assertEquals(2, new PrimitivesBinarySearch().search(new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 5));
        assertEquals(6, new PrimitivesBinarySearch().search(new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 13));
    }

    @Test
    public void testSearchElementNotFoundInArray() {
        assertEquals(-1, new PrimitivesBinarySearch().search(
                new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 4
        ));
        assertEquals(-1, new PrimitivesBinarySearch().search(
                new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 8
        ));
    }

    @Test
    public void testSearchEmptyArray() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new int[] {}, 5));
    }

    @Test
    public void testSearchSingleElementArray() {
        assertEquals(0, new PrimitivesBinarySearch().search(new int[] { 9 }, 9));
    }

    @Test
    public void testSearchElementSmallerThanAll() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 0));
    }

    @Test
    public void testSearchElementLargerThanAll() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 20));
    }

    @Test
    public void testSearchElementAtStartOfArray() {
        assertEquals(0, new PrimitivesBinarySearch().search(new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 1));
    }

    @Test
    public void testSearchElementAtEndOfArray() {
        assertEquals(7, new PrimitivesBinarySearch().search(new int[] { 1, 3, 5, 7, 9, 11, 13, 15 }, 15));
    }

    @Test
    public void testSearchElementInLargeSortedArray() {
        int[] largeArray = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArray[i] = i;
        }

        assertEquals(999999, new PrimitivesBinarySearch().search(largeArray, 999999));
    }

    @Test
    public void testSearchElementInUnsortedArray() {
        int[] unsortedArray = new int[] { 7, 2, 9, 1, 5, 3 };
        assertEquals(-1, new PrimitivesBinarySearch().search(unsortedArray, 6));
    }

    @Test
    public void testSearchElementInDescendingOrderArray() {
        int[] descendingArray = new int[] { 20, 15, 10, 5, 0 };
        assertEquals(2, new PrimitivesBinarySearch().search(descendingArray, 10));
    }

    @Test
    public void testSearchElementFoundInDoubleArray() {
        assertEquals(1, new PrimitivesBinarySearch().search(new double[] { 1.0, 3.0, 3.7, 5.2, 6.8, 8.0, 9.3 }, 3));
        assertEquals(5, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9.3 }, 8));
    }

    @Test
    public void testSearchElementNotFoundInDoubleArray() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9.3 }, 4));
        assertEquals(-1, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9.3 }, 7));
    }

    @Test
    public void testSearchEmptyDoubleArray() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new double[] {}, 5));
    }

    @Test
    public void testSearchSingleElementDoubleArray() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new double[] { 4.2 }, 4));
    }

    @Test
    public void testSearchElementSmallerThanAllDoubleElements() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9.3 }, 0));
    }

    @Test
    public void testSearchElementLargerThanAllDoubleElements() {
        assertEquals(-1, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9.3 }, 10));
    }

    @Test
    public void testSearchElementAtStartOfDoubleArray() {
        assertEquals(0, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9.3 }, 1));
    }

    @Test
    public void testSearchElementAtEndOfDoubleArray() {
        assertEquals(6, new PrimitivesBinarySearch().search(new double[] { 1.0, 2.5, 3.7, 5.2, 6.8, 8.0, 9 }, 9));
    }

    @Test
    public void testSearchElementInLargeDoubleArray() {
        double[] largeArray = new double[1000000];
        for (int i = 0; i < 1000000; i++) {
            largeArray[i] = i * 0.5;
        }
        assertEquals(300, new PrimitivesBinarySearch().search(largeArray, 150.0));
    }
}
