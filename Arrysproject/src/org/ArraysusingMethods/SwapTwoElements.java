package org.ArraysusingMethods;

import java.util.Arrays;

public class SwapTwoElements 
{
    public static void main(String[] args) 
    {
        int[] arr = {18, 11, 35, 10, 76, 12, 44, 89};
        SwapTwoElements.swapElements(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static int[] swapElements(int[] arr, int index1, int index2) 
    {
        if (index1 >= 0 && index1 < arr.length && index2 >= 0 && index2 < arr.length) 
        {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        } else 
        {
            System.out.println("Invalid indices. Make sure indices are within the array bounds.");
        }
		return arr;
    }
}

