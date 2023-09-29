package bubble;

import bubble.entity.TestEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void testSortArrayWithPositiveIntegers() {
        Integer[] array = {5, 2, 9, 1, 5};
        Integer[] expected = {1, 2, 5, 5, 9};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithNegativeIntegers() {
        Integer[] array = {-5, -2, -9, -1, -5};
        Integer[] expected = {-9, -5, -5, -2, -1};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithZeroes() {
        Integer[] array = {0, 0, 0, 0, 0};
        Integer[] expected = {0, 0, 0, 0, 0};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithDuplicates() {
        Integer[] array = {5, 2, 9, 1, 5, 2, 9};
        Integer[] expected = {1, 2, 2, 5, 5, 9, 9};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithMixedSigns() {
        Integer[] array = {-5, 2, -9, 1, 0};
        Integer[] expected = {-9, -5, 0, 1, 2};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithSingleElement() {
        Integer[] array = {42};
        Integer[] expected = {42};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortEmptyArray() {
        Integer[] array = {};
        Integer[] expected = {};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithMaxIntegerValue() {
        Integer[] array = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE};
        Integer[] expected = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        new BubbleSort<Integer>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithAllZeroes() {
        Double[] array = {0.0, 0.0, 0.0, 0.0, 0.0};
        Double[] expected = {0.0, 0.0, 0.0, 0.0, 0.0};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithPositiveAndNegativeInfinity() {
        Double[] array = {Double.POSITIVE_INFINITY, 0.0, Double.NEGATIVE_INFINITY};
        Double[] expected = {Double.NEGATIVE_INFINITY, 0.0, Double.POSITIVE_INFINITY};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithNaN() {
        Double[] array = {Double.NaN, 1.0, 2.0, 3.0};
        Double[] expected = {1.0, 2.0, 3.0, Double.NaN};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithPositiveAndNegativeZero() {
        Double[] array = {0.0, -0.0, 1.0, -1.0};
        Double[] expected = {-1.0, -0.0, 0.0, 1.0};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithLargeValues() {
        Double[] array = {1e100, 2e100, 1e-100, 2e-100};
        Double[] expected = {1e-100, 2e-100, 1e100, 2e100};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithRandomValues() {
        Double[] array = {3.14, 2.71, 1.618, 2.0, 3.0, 1.0, 4.0, 5.0};
        Double[] expected = {1.0, 1.618, 2.0, 2.71, 3.0, 3.14, 4.0, 5.0};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithDuplicateValues() {
        Double[] array = {2.0, 1.0, 2.0, 1.0, 2.0};
        Double[] expected = {1.0, 1.0, 2.0, 2.0, 2.0};
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithLargeNumberOfElements() {
        Double[] array = new Double[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 1000;
        }
        Double[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        new BubbleSort<Double>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithPositiveLongs() {
        Long[] array = {500L, 200L, 900L, 100L, 500L};
        Long[] expected = {100L, 200L, 500L, 500L, 900L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithNegativeLongs() {
        Long[] array = {-5L, -2L, -9L, -1L, -5L};
        Long[] expected = {-9L, -5L, -5L, -2L, -1L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithMixedSigns_LongType() {
        Long[] array = {-5L, 2L, -9L, 1L, 0L};
        Long[] expected = {-9L, -5L, 0L, 1L, 2L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithSingleElement_LongType() {
        Long[] array = {42L};
        Long[] expected = {42L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithAllZeroes_LongType() {
        Long[] array = {0L, 0L, 0L, 0L, 0L};
        Long[] expected = {0L, 0L, 0L, 0L, 0L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithMaxLongValue() {
        Long[] array = {Long.MAX_VALUE, 0L, Long.MIN_VALUE};
        Long[] expected = {Long.MIN_VALUE, 0L, Long.MAX_VALUE};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithLargeValues_LongType() {
        Long[] array = {1_000_000_000_000L, 1_000L, 1_000_000_000L, 1L};
        Long[] expected = {1L, 1_000L, 1_000_000_000L, 1_000_000_000_000L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithDuplicateValues_LongType() {
        Long[] array = {5L, 2L, 5L, 2L, 5L};
        Long[] expected = {2L, 2L, 5L, 5L, 5L};
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortArrayWithLargeNumberOfElements_LongType() {
        Long[] array = new Long[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (long) (Math.random() * 1000);
        }
        Long[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected);
        new BubbleSort<Long>().sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortListWithPositiveIntegers() {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 5);
        List<Integer> expected = Arrays.asList(1, 2, 5, 5, 9);
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithNegativeIntegers() {
        List<Integer> list = Arrays.asList(-5, -2, -9, -1, -5);
        List<Integer> expected = Arrays.asList(-9, -5, -5, -2, -1);
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithMixedSigns_IntegerType() {
        List<Integer> list = Arrays.asList(-5, 2, -9, 1, 0);
        List<Integer> expected = Arrays.asList(-9, -5, 0, 1, 2);
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithDuplicates_IntegerType() {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 5, 2, 9);
        List<Integer> expected = Arrays.asList(1, 2, 2, 5, 5, 9, 9);
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithSingleElement_IntegerType() {
        List<Integer> list = Collections.singletonList(42);
        List<Integer> expected = Collections.singletonList(42);
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortEmptyList_IntegerType() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithMaxAndMinDoubleValues() {
        List<Integer> list = Arrays.asList(Integer.MAX_VALUE, 0, Integer.MIN_VALUE);
        List<Integer> expected = Arrays.asList(Integer.MIN_VALUE, 0, Integer.MAX_VALUE);
        new BubbleSort<Integer>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithPositiveDoubles() {
        List<Double> list = Arrays.asList(3.14, 2.71, 1.618, 2.0, 3.0);
        List<Double> expected = Arrays.asList(1.618, 2.0, 2.71, 3.0, 3.14);
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithNegativeDoubles() {
        List<Double> list = Arrays.asList(-3.14, -2.71, -1.618, -2.0, -3.0);
        List<Double> expected = Arrays.asList(-3.14, -3.0, -2.71, -2.0, -1.618);
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithMixedSigns() {
        List<Double> list = Arrays.asList(-3.14, 2.71, -1.618, 2.0, 0.0);
        List<Double> expected = Arrays.asList(-3.14, -1.618, 0.0, 2.0, 2.71);
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithDuplicates() {
        List<Double> list = Arrays.asList(3.14, 2.71, 1.618, 2.0, 3.0, 2.0, 1.618);
        List<Double> expected = Arrays.asList(1.618, 1.618, 2.0, 2.0, 2.71, 3.0, 3.14);
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithSingleElement() {
        List<Double> list = Collections.singletonList(42.0);
        List<Double> expected = Collections.singletonList(42.0);
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortEmptyList() {
        List<Double> list = new ArrayList<>();
        List<Double> expected = new ArrayList<>();
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithNaN() {
        List<Double> list = Arrays.asList(Double.NaN, 1.0, 2.0, 3.0);
        List<Double> expected = Arrays.asList(1.0, 2.0, 3.0, Double.NaN);
        new BubbleSort<Double>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortedWithPositiveIntegers() {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 5);
        List<Integer> expected = Arrays.asList(1, 2, 5, 5, 9);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithNegativeIntegers() {
        List<Integer> list = Arrays.asList(-5, -2, -9, -1, -5);
        List<Integer> expected = Arrays.asList(-9, -5, -5, -2, -1);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithMixedSigns_IntegerType() {
        List<Integer> list = Arrays.asList(-5, 2, -9, 1, 0);
        List<Integer> expected = Arrays.asList(-9, -5, 0, 1, 2);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithDuplicates_IntegerType() {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 5, 2, 9);
        List<Integer> expected = Arrays.asList(1, 2, 2, 5, 5, 9, 9);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithPositiveDoubles() {
        List<Double> list = Arrays.asList(3.14, 2.71, 1.618, 2.0, 3.0);
        List<Double> expected = Arrays.asList(1.618, 2.0, 2.71, 3.0, 3.14);
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        List<Double> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithNegativeDoubles() {
        List<Double> list = Arrays.asList(-3.14, -2.71, -1.618, -2.0, -3.0);
        List<Double> expected = Arrays.asList(-3.14, -3.0, -2.71, -2.0, -1.618);
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        List<Double> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithMixedSigns() {
        List<Double> list = Arrays.asList(-3.14, 2.71, -1.618, 2.0, 0.0);
        List<Double> expected = Arrays.asList(-3.14, -1.618, 0.0, 2.0, 2.71);
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        List<Double> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedWithDuplicates() {
        List<Double> list = Arrays.asList(3.14, 2.71, 1.618, 2.0, 3.0, 2.0, 1.618);
        List<Double> expected = Arrays.asList(1.618, 1.618, 2.0, 2.0, 2.71, 3.0, 3.14);
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        List<Double> result = bubbleSort.sorted(list);
        assertEquals(expected, result);
    }

    @Test
    public void testSortedArrayWithMixedSigns_IntegerType() {
        Integer[] array = {-5, 2, -9, 1, 0};
        Integer[] expected = {-9, -5, 0, 1, 2};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] result = bubbleSort.sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedArrayWithDuplicates_IntegerType() {
        Integer[] array = {5, 2, 9, 1, 5, 2, 9};
        Integer[] expected = {1, 2, 2, 5, 5, 9, 9};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] result = bubbleSort.sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedArrayWithMixedSigns_DoubleType() {
        Double[] array = {-3.14, 2.71, -1.618, 2.0, 0.0};
        Double[] expected = {-3.14, -1.618, 0.0, 2.0, 2.71};
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        Double[] result = bubbleSort.sorted(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortedArrayWithDuplicates_DoubleType() {
        Double[] array = {3.14, 2.71, 1.618, 2.0, 3.0, 2.0, 1.618};
        Double[] expected = {1.618, 1.618, 2.0, 2.0, 2.71, 3.0, 3.14};
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        Double[] result = bubbleSort.sorted(array);
        assertArrayEquals(expected, result);
    }




    @Test
    public void testSortWithNullList() {
        List<TestEntity> list = null;
        new BubbleSort<TestEntity>().sort(list);
        Assertions.assertNull(list);
    }

    @Test
    public void testSortWithEmptyList() {
        List<TestEntity> list = new ArrayList<>();
        List<TestEntity> expected = new ArrayList<>();
        new BubbleSort<TestEntity>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortWithSingleEntity() {
        List<TestEntity> list = Collections.singletonList(new TestEntity("Alice", 30));
        List<TestEntity> expected = Collections.singletonList(new TestEntity("Alice", 30));
        new BubbleSort<TestEntity>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortWithEntitiesSortedByAge() {
        List<TestEntity> list = Arrays.asList(
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 35)
        );
        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 35)
        );
        new BubbleSort<TestEntity>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortWithEntitiesReversedByAge() {
        List<TestEntity> list = Arrays.asList(
                new TestEntity("Charlie", 35),
                new TestEntity("Bob", 30),
                new TestEntity("Alice", 25)
        );
        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 35)
        );
        new BubbleSort<TestEntity>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortWithEntitiesUnsortedByAge() {
        List<TestEntity> list = Arrays.asList(
                new TestEntity("Charlie", 35),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        );
        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 35)
        );
        new BubbleSort<TestEntity>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortWithEntitiesHavingSameAge() {
        List<TestEntity> list = Arrays.asList(
                new TestEntity("Alice", 30),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 30)
        );
        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Alice", 30),
                new TestEntity("Bob", 30),
                new TestEntity("Charlie", 30)
        );
        new BubbleSort<TestEntity>().sort(list);
        assertEquals(expected, list);
    }

    @Test
    public void testSortWithLargeNumberOfEntities() {
        List<TestEntity> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            String name = "Person" + i;
            int age = random.nextInt(100);
            list.add(new TestEntity(name, age));
        }

        List<TestEntity> expected = new ArrayList<>(list);
        expected.sort(TestEntity::compareTo);

        new BubbleSort<TestEntity>().sort(list);

        assertEquals(expected, list);
    }

    @Test
    public void testSortedArrayWithLargeNumberOfEntities() {
        TestEntity[] array = new TestEntity[1000];
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            String name = "Person" + i;
            int age = random.nextInt(100);
            array[i] = new TestEntity(name, age);
        }

        TestEntity[] expected = Arrays.copyOf(array, array.length);
        Arrays.sort(expected, TestEntity::compareTo);

        TestEntity[] result = new BubbleSort<TestEntity>().sorted(array);

        assertArrayEquals(expected, result);
    }
}