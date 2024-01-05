package org.ArraysusingMethods;

import java.util.Arrays;

public class ArraySumOfTwoArrayElements 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 5, 6, 15, 8, 9, 10};
        int[] arr2 = {5, 9, 16, 21, 17, 2, 3};
        int[] arr3 = sumArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] sumArrays(int[] arr1, int[] arr2) 
    {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length)
        {
            System.out.println("Arrays must have the same length for element-wise addition.");
            return result;
        }
        for (int i = 0; i < arr1.length; i++)
        {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}

