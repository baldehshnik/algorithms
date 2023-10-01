package insertion;

import entity.TestEntity;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testSortIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);
        sorter.sort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());
    }

    @Test
    public void testSortAlreadySortedIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        sorter.sort(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, list.toArray());
    }

    @Test
    public void testSortSingleElementIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Collections.singletonList(42);
        sorter.sort(list);
        assertArrayEquals(new Integer[]{42}, list.toArray());
    }

    @Test
    public void testSortDuplicateIntegerValuesList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 2);
        sorter.sort(list);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 4, 5}, list.toArray());
    }

    @Test
    public void testSortEmptyIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Collections.emptyList();
        sorter.sort(list);
        assertArrayEquals(new Integer[]{}, list.toArray());
    }

    @Test
    public void testSortDoubleList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Arrays.asList(5.0, 3.0, 1.0, 4.0, 2.0);
        sorter.sort(list);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, list.toArray());
    }

    @Test
    public void testSortAlreadySortedDoubleList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        sorter.sort(list);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, list.toArray());
    }

    @Test
    public void testSortSingleElementDoubleList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Collections.singletonList(42.0);
        sorter.sort(list);
        assertArrayEquals(new Double[]{42.0}, list.toArray());
    }

    @Test
    public void testSortDuplicateDoubleValuesList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Arrays.asList(3.0, 1.0, 4.0, 1.0, 5.0, 2.0);
        sorter.sort(list);
        assertArrayEquals(new Double[]{1.0, 1.0, 2.0, 3.0, 4.0, 5.0}, list.toArray());
    }

    @Test
    public void testSortEmptyDoubleList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Collections.emptyList();
        sorter.sort(list);
        assertArrayEquals(new Double[]{}, list.toArray());
    }

    @Test
    public void testSortIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {5, 3, 1, 4, 2};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortAlreadySortedIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {1, 2, 3, 4, 5};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortSingleElementIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {42};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{42}, array);
    }

    @Test
    public void testSortDuplicateIntegerValuesArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {3, 1, 4, 1, 5, 2};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortEmptyIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    public void testSortDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {5.0, 3.0, 1.0, 4.0, 2.0};
        sorter.sort(array);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, array);
    }

    @Test
    public void testSortAlreadySortedDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        sorter.sort(array);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, array);
    }

    @Test
    public void testSortSingleElementDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {42.0};
        sorter.sort(array);
        assertArrayEquals(new Double[]{42.0}, array);
    }

    @Test
    public void testSortDuplicateDoubleValuesArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {3.0, 1.0, 4.0, 1.0, 5.0, 2.0};
        sorter.sort(array);
        assertArrayEquals(new Double[]{1.0, 1.0, 2.0, 3.0, 4.0, 5.0}, array);
    }

    @Test
    public void testSortEmptyDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {};
        sorter.sort(array);
        assertArrayEquals(new Double[]{}, array);
    }

    @Test
    public void testSortDoubleArrayWithDecimalValues() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {5.123, 3.456, 1.789, 4.345, 2.678};
        sorter.sort(array);
        assertArrayEquals(new Double[]{1.789, 2.678, 3.456, 4.345, 5.123}, array);
    }

    @Test
    public void testSortAlreadySortedDoubleArrayWithDecimalValues() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {1.123, 2.234, 3.345, 4.456, 5.567};
        sorter.sort(array);
        assertArrayEquals(new Double[]{1.123, 2.234, 3.345, 4.456, 5.567}, array);
    }

    @Test
    public void testSortSingleElementDoubleArrayWithDecimalValues() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {42.678};
        sorter.sort(array);
        assertArrayEquals(new Double[]{42.678}, array);
    }

    @Test
    public void testSortDuplicateDoubleValuesArrayWithDecimalValues() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {3.145, 1.234, 4.789, 1.234, 5.678, 2.789};
        sorter.sort(array);
        assertArrayEquals(new Double[]{1.234, 1.234, 2.789, 3.145, 4.789, 5.678}, array);
    }

    @Test
    public void testSortEmptyDoubleArrayWithDecimalValues() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {};
        sorter.sort(array);
        assertArrayEquals(new Double[]{}, array);
    }

    @Test
    public void testSortedSortIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> sortedList = sorter.sorted(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedList.toArray());
    }

    @Test
    public void testSortedSortDoubleList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Arrays.asList(5.0, 3.0, 1.0, 4.0, 2.0);
        List<Double> sortedList = sorter.sorted(list);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedList.toArray());
    }

    @Test
    public void testSortedSortAlreadySortedIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sortedList = sorter.sorted(list);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedList.toArray());
    }

    @Test
    public void testSortedSortAlreadySortedDoubleList() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        List<Double> sortedList = sorter.sorted(list);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedList.toArray());
    }

    @Test
    public void testSortedSortEmptyIntegerList() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        List<Integer> list = Collections.emptyList();
        List<Integer> sortedList = sorter.sorted(list);
        assertArrayEquals(new Integer[]{}, sortedList.toArray());
    }

    @Test
    public void testSortedSortIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {5, 3, 1, 4, 2};
        Integer[] sortedArray = sorter.sorted(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testSortedSortDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {5.0, 3.0, 1.0, 4.0, 2.0};
        Double[] sortedArray = sorter.sorted(array);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedArray);
    }

    @Test
    public void testSortedSortAlreadySortedIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] sortedArray = sorter.sorted(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sortedArray);
    }

    @Test
    public void testSortedSortAlreadySortedDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        Double[] sortedArray = sorter.sorted(array);
        assertArrayEquals(new Double[]{1.0, 2.0, 3.0, 4.0, 5.0}, sortedArray);
    }

    @Test
    public void testSortedSortEmptyIntegerArray() {
        InsertionSort<Integer> sorter = new InsertionSort<>();
        Integer[] array = {};
        Integer[] sortedArray = sorter.sorted(array);
        assertArrayEquals(new Integer[]{}, sortedArray);
    }

    @Test
    public void testSortedSortEmptyDoubleArray() {
        InsertionSort<Double> sorter = new InsertionSort<>();
        Double[] array = {};
        Double[] sortedArray = sorter.sorted(array);
        assertArrayEquals(new Double[]{}, sortedArray);
    }

    @Test
    public void testSortTestEntityList() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 20);
        TestEntity entity4 = new TestEntity("David", 25);

        List<TestEntity> list = Arrays.asList(entity1, entity2, entity3, entity4);
        List<TestEntity> expectedList = Arrays.asList(entity3, entity1, entity4, entity2);

        new InsertionSort<TestEntity>().sort(list);

        assertArrayEquals(expectedList.toArray(), list.toArray());
    }

    @Test
    public void testSortTestEntityListWithEqualAges() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 25);
        TestEntity entity4 = new TestEntity("David", 30);

        List<TestEntity> list = Arrays.asList(entity1, entity2, entity3, entity4);
        List<TestEntity> expectedList = Arrays.asList(entity1, entity3, entity2, entity4);

        new InsertionSort<TestEntity>().sort(list);

        assertArrayEquals(expectedList.toArray(), list.toArray());
    }

    @Test
    public void testSortTestEntityListWithSingleElement() {
        TestEntity entity = new TestEntity("Alice", 25);

        List<TestEntity> list = Collections.singletonList(entity);
        List<TestEntity> expectedList = Collections.singletonList(entity);

        new InsertionSort<TestEntity>().sort(list);

        assertArrayEquals(expectedList.toArray(), list.toArray());
    }

    @Test
    public void testSortTestEntityListWithEmptyList() {
        List<TestEntity> list = Collections.emptyList();
        List<TestEntity> expectedList = Collections.emptyList();

        new InsertionSort<TestEntity>().sort(list);

        assertArrayEquals(expectedList.toArray(), list.toArray());
    }

    @Test
    public void testSortTestEntityArray() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 20);
        TestEntity entity4 = new TestEntity("David", 25);

        TestEntity[] array = {entity1, entity2, entity3, entity4};
        TestEntity[] expectedArray = {entity3, entity1, entity4, entity2};

        new InsertionSort<TestEntity>().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortTestEntityArrayWithEqualAges() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 25);
        TestEntity entity4 = new TestEntity("David", 30);

        TestEntity[] array = {entity1, entity2, entity3, entity4};
        TestEntity[] expectedArray = {entity1, entity3, entity2, entity4};

        new InsertionSort<TestEntity>().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortTestEntityArrayWithSingleElement() {
        TestEntity entity = new TestEntity("Alice", 25);

        TestEntity[] array = {entity};
        TestEntity[] expectedArray = {entity};

        new InsertionSort<TestEntity>().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortTestEntityArrayWithEmptyArray() {
        TestEntity[] array = {};
        TestEntity[] expectedArray = {};

        new InsertionSort<TestEntity>().sort(array);

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testSortedSortTestEntityList() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 20);
        TestEntity entity4 = new TestEntity("David", 25);

        List<TestEntity> list = Arrays.asList(entity1, entity2, entity3, entity4);
        List<TestEntity> expectedList = Arrays.asList(entity3, entity1, entity4, entity2);

        List<TestEntity> sortedList = new InsertionSort<TestEntity>().sorted(list);

        assertArrayEquals(expectedList.toArray(), sortedList.toArray());
    }

    @Test
    public void testSortedSortTestEntityListWithEqualAges() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 25);
        TestEntity entity4 = new TestEntity("David", 30);

        List<TestEntity> list = Arrays.asList(entity1, entity2, entity3, entity4);
        List<TestEntity> expectedList = Arrays.asList(entity1, entity3, entity2, entity4);

        List<TestEntity> sortedList = new InsertionSort<TestEntity>().sorted(list);

        assertArrayEquals(expectedList.toArray(), sortedList.toArray());
    }

    @Test
    public void testSortedSortTestEntityListWithEmptyList() {
        List<TestEntity> list = Collections.emptyList();
        List<TestEntity> expectedList = Collections.emptyList();

        List<TestEntity> sortedList = new InsertionSort<TestEntity>().sorted(list);

        assertArrayEquals(expectedList.toArray(), sortedList.toArray());
    }

    @Test
    public void testSortedSortTestEntityArray() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 20);
        TestEntity entity4 = new TestEntity("David", 25);

        TestEntity[] array = {entity1, entity2, entity3, entity4};
        TestEntity[] expectedArray = {entity3, entity1, entity4, entity2};

        TestEntity[] sortedArray = new InsertionSort<TestEntity>().sorted(array);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedSortTestEntityArrayWithEqualAges() {
        TestEntity entity1 = new TestEntity("Alice", 25);
        TestEntity entity2 = new TestEntity("Bob", 30);
        TestEntity entity3 = new TestEntity("Charlie", 25);
        TestEntity entity4 = new TestEntity("David", 30);

        TestEntity[] array = {entity1, entity2, entity3, entity4};
        TestEntity[] expectedArray = {entity1, entity3, entity2, entity4};

        TestEntity[] sortedArray = new InsertionSort<TestEntity>().sorted(array);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    public void testSortedSortTestEntityArrayWithEmptyArray() {
        TestEntity[] array = {};
        TestEntity[] expectedArray = {};

        TestEntity[] sortedArray = new InsertionSort<TestEntity>().sorted(array);

        assertArrayEquals(expectedArray, sortedArray);
    }
}
