package shuttle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrimitivesShuttleSortTest {

    @Test
    public void testSortWithEmptyArray() {
        int[] array = {};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSortWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortWithUnsortedArray() {
        int[] array = {3, 1, 5, 2, 4};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortWithArrayContainingDuplicates() {
        int[] array = {3, 1, 5, 2, 4, 1, 2};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortDoubleWithEmptyArray() {
        double[] array = {};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new double[]{}, array, 0.0);
    }

    @Test
    public void testSortDoubleWithSortedArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, array, 0.0);
    }

    @Test
    public void testSortDoubleWithReverseSortedArray() {
        double[] array = {5.0, 4.0, 3.0, 2.0, 1.0};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, array, 0.0);
    }

    @Test
    public void testSortDoubleWithUnsortedArray() {
        double[] array = {3.5, 1.0, 5.0, 2.2, 4.8};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new double[]{1.0, 2.2, 3.5, 4.8, 5.0}, array, 0.0);
    }

    @Test
    public void testSortDoubleWithArrayContainingDuplicates() {
        double[] array = {3.5, 1.0, 5.0, 2.2, 4.8, 1.0, 2.2};
        new PrimitivesShuttleSort().sort(array);
        assertArrayEquals(new double[]{1.0, 1.0, 2.2, 2.2, 3.5, 4.8, 5.0}, array, 0.0);
    }

    @Test
    public void testSortedIntWithEmptyArray() {
        int[] array = {};
        int[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new int[]{}, sortedArray);
    }

    @Test
    public void testSortedIntWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testSortedIntWithReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testSortedIntWithUnsortedArray() {
        int[] array = {3, 1, 5, 2, 4};
        int[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testSortedIntWithArrayContainingDuplicates() {
        int[] array = {3, 1, 5, 2, 4, 1, 2};
        int[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testSortedDoubleWithEmptyArray() {
        double[] array = {};
        double[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new double[]{}, sortedArray, 0.0);
    }

    @Test
    public void testSortedDoubleWithSortedArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedArray, 0.0);
    }

    @Test
    public void testSortedDoubleWithReverseSortedArray() {
        double[] array = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedArray, 0.0);
    }

    @Test
    public void testSortedDoubleWithUnsortedArray() {
        double[] array = {3.5, 1.0, 5.0, 2.2, 4.8};
        double[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new double[]{1.0, 2.2, 3.5, 4.8, 5.0}, sortedArray, 0.0);
    }

    @Test
    public void testSortedDoubleWithArrayContainingDuplicates() {
        double[] array = {3.5, 1.0, 5.0, 2.2, 4.8, 1.0, 2.2};
        double[] sortedArray = new PrimitivesShuttleSort().sorted(array);
        assertArrayEquals(new double[]{1.0, 1.0, 2.2, 2.2, 3.5, 4.8, 5.0}, sortedArray, 0.0);
    }
}
