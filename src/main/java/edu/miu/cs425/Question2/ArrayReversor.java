package edu.miu.cs425.Question2;

public class ArrayReversor {
    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] nestedArray) {
        if (nestedArray == null) {
            return new int[0]; // Return an empty array for null input
        }

        int[] flattenedArray = flattenerService.flattenArray(nestedArray);

        int[] reversedArray = new int[flattenedArray.length];
        int index = 0;

        for (int i = flattenedArray.length - 1; i >= 0; i--) {
            reversedArray[index++] = flattenedArray[i];
        }

        return reversedArray;
    }
}