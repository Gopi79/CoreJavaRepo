package org.ArraysusingMethods;

import java.util.Arrays;

public class SortingAnArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {13, 15, 18, 31, 21, 17};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        SortingAnArray.sortArray(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
    static int[] sortArray(int[] arr)
    {
        Arrays.sort(arr);
		return arr;
    }
}

