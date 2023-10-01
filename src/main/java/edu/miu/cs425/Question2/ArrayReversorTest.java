package edu.miu.cs425.Question2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayReversorTest {
    private ArrayReversor reversor;
    private ArrayFlattenerService flattenerService;

    @Before
    public void setUp() {
        flattenerService = mock(ArrayFlattenerService.class);
        reversor = new ArrayReversor(flattenerService);
    }

    @Test
    public void testReverseArrayWithValidInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        int[] expectedArray = {9, 5, 4, 0, 3, 1};

        when(flattenerService.flattenArray(inputArray)).thenReturn(flattenedArray);

        int[] result = reversor.reverseArray(inputArray);
        assertArrayEquals(expectedArray, result);


        verify(flattenerService).flattenArray(inputArray);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};;
        int[] expectedArray = {9, 5, 4, 0, 3, 1};

        int[] result = reversor.reverseArray(inputArray);
        assertArrayEquals(expectedArray, result);

        verifyNoInteractions(flattenerService);
    }
}
