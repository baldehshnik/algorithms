package shuttle;

import entity.TestEntity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuttleSortTest {

    @Test
    public void testSortWithEmptyArray() {
        Integer[] array = {};
        new ShuttleSort<Integer>().sort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    public void testSortWithSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        new ShuttleSort<Integer>().sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortWithReverseSortedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        new ShuttleSort<Integer>().sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortWithUnsortedArray() {
        Integer[] array = {3, 1, 5, 2, 4};
        new ShuttleSort<Integer>().sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortWithArrayContainingDuplicates() {
        Integer[] array = {3, 1, 5, 2, 4, 1, 2};
        new ShuttleSort<Integer>().sort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSortListWithEmptyList() {
        List<Integer> list = new ArrayList<>();
        new ShuttleSort<Integer>().sort(list);
        assertEquals(new ArrayList<Integer>(), list);
    }

    @Test
    public void testSortListWithSortedList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        new ShuttleSort<Integer>().sort(list);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithReverseSortedList() {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        new ShuttleSort<Integer>().sort(list);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithUnsortedList() {
        List<Integer> list = Arrays.asList(3, 1, 5, 2, 4);
        new ShuttleSort<Integer>().sort(list);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, list);
    }

    @Test
    public void testSortListWithListContainingDuplicates() {
        List<Integer> list = Arrays.asList(3, 1, 5, 2, 4, 1, 2);
        new ShuttleSort<Integer>().sort(list);
        List<Integer> expected = Arrays.asList(1, 1, 2, 2, 3, 4, 5);
        assertEquals(expected, list);
    }

    @Test
    public void testSortedArrayWithEmptyArray() {
        Integer[] array = {};
        Integer[] sortedArray = new ShuttleSort<Integer>().sorted(array);
        assertArrayEquals(new Integer[]{}, sortedArray);
    }

    @Test
    public void testSortedArrayWithSortedList() {
        Integer[] array = {1, 2, 3, 4, 5};
        Integer[] sortedArray = new ShuttleSort<Integer>().sorted(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testSortedArrayWithReverseSortedList() {
        Integer[] array = {5, 4, 3, 2, 1};
        Integer[] sortedArray = new ShuttleSort<Integer>().sorted(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testSortedArrayWithUnsortedArray() {
        Integer[] array = {3, 1, 5, 2, 4};
        Integer[] sortedArray = new ShuttleSort<Integer>().sorted(array);
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testSortedArrayWithArrayContainingDuplicates() {
        Integer[] array = {3, 1, 5, 2, 4, 1, 2};
        Integer[] sortedArray = new ShuttleSort<Integer>().sorted(array);
        Integer[] expected = {1, 1, 2, 2, 3, 4, 5};
        assertArrayEquals(expected, sortedArray);
    }

    @Test
    public void testSortedListWithEmptyList() {
        List<Integer> list = List.of();
        List<Integer> sortedList = new ShuttleSort<Integer>().sorted(list);
        assertEquals(List.of(), sortedList);
    }

    @Test
    public void testSortedListWithSortedList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sortedList = new ShuttleSort<Integer>().sorted(list);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedList);
    }

    @Test
    public void testSortedListWithReverseSortedList() {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> sortedList = new ShuttleSort<Integer>().sorted(list);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedList);
    }

    @Test
    public void testSortedListWithUnsortedList() {
        List<Integer> list = Arrays.asList(3, 1, 5, 2, 4);
        List<Integer> sortedList = new ShuttleSort<Integer>().sorted(list);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedList);
    }

    @Test
    public void testSortedListWithListContainingDuplicates() {
        List<Integer> list = Arrays.asList(3, 1, 5, 2, 4, 1, 2);
        List<Integer> sortedList = new ShuttleSort<Integer>().sorted(list);
        assertEquals(Arrays.asList(1, 1, 2, 2, 3, 4, 5), sortedList);
    }

    @Test
    public void testSortWithCustomComparableType() {
        TestEntity[] entities = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Eve", 22)
        };
        new ShuttleSort<TestEntity>().sort(entities);

        TestEntity[] expected = {
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };

        assertArrayEquals(expected, entities);
    }

    @Test
    public void testSortWithCustomComparableTypeReverseOrder() {
        TestEntity[] entities = {
                new TestEntity("Eve", 22),
                new TestEntity("Bob", 30),
                new TestEntity("Alice", 25)
        };
        new ShuttleSort<TestEntity>().sort(entities);

        TestEntity[] expected = {
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };

        assertArrayEquals(expected, entities);
    }

    @Test
    public void testSortListWithCustomComparableType() {
        List<TestEntity> entities = Arrays.asList(
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Eve", 22)
        );
        new ShuttleSort<TestEntity>().sort(entities);

        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        );

        assertEquals(expected, entities);
    }

    @Test
    public void testSortListWithCustomComparableTypeReverseOrder() {
        List<TestEntity> entities = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Bob", 30),
                new TestEntity("Alice", 25)
        );
        new ShuttleSort<TestEntity>().sort(entities);

        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        );

        assertEquals(expected, entities);
    }

    @Test
    public void testSortedArrayWithCustomComparableType() {
        TestEntity[] entities = {
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Eve", 22)
        };
        TestEntity[] sortedEntities = new ShuttleSort<TestEntity>().sorted(entities);

        TestEntity[] expected = {
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };

        assertArrayEquals(expected, sortedEntities);
    }

    @Test
    public void testSortedArrayWithCustomComparableTypeReverseOrder() {
        TestEntity[] entities = {
                new TestEntity("Eve", 22),
                new TestEntity("Bob", 30),
                new TestEntity("Alice", 25)
        };
        TestEntity[] sortedEntities = new ShuttleSort<TestEntity>().sorted(entities);

        TestEntity[] expected = {
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        };

        assertArrayEquals(expected, sortedEntities);
    }

    @Test
    public void testSortedListWithCustomComparableType() {
        List<TestEntity> entities = Arrays.asList(
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30),
                new TestEntity("Eve", 22)
        );
        List<TestEntity> sortedEntities = new ShuttleSort<TestEntity>().sorted(entities);

        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        );

        assertEquals(expected, sortedEntities);
    }

    @Test
    public void testSortedListWithCustomComparableTypeReverseOrder() {
        List<TestEntity> entities = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Bob", 30),
                new TestEntity("Alice", 25)
        );
        List<TestEntity> sortedEntities = new ShuttleSort<TestEntity>().sorted(entities);

        List<TestEntity> expected = Arrays.asList(
                new TestEntity("Eve", 22),
                new TestEntity("Alice", 25),
                new TestEntity("Bob", 30)
        );

        assertEquals(expected, sortedEntities);
    }
}