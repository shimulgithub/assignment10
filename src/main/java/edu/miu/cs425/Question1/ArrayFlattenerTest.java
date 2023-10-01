package edu.miu.cs425.Question1;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {
    private ArrayFlattener flattener;

    @Before
    public void setUp() {
        flattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArrayWithValidInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedArray = {1, 3, 0, 4, 5, 9};
        int[] result = flattener.flattenArray(inputArray);
        assertArrayEquals(expectedArray, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        int[][] inputArray = null;
        int[] expectedArray = {};
        int[] result = flattener.flattenArray(inputArray);
        assertArrayEquals(expectedArray, result);
    }
}