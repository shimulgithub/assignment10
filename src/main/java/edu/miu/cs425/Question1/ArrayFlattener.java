package edu.miu.cs425.Question1;

public class ArrayFlattener {
    public int[] flattenArray(int[][] nestedArray)
    {
        if (nestedArray == null)
        {
            return new int[0]; // Return an empty array for null input
        }

        int totalElements = 0;
        for (int[] subArray : nestedArray) 
        {
            totalElements += subArray.length;
        }

        int[] flattenedArray = new int[totalElements];
        int index = 0;

        for (int[] subArray : nestedArray)
        {
            for (int element : subArray) 
            {
                flattenedArray[index++] = element;
            }
        }

        return flattenedArray;
    }
}