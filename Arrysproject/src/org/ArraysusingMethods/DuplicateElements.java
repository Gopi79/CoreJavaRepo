package org.ArraysusingMethods;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        int[] arr = { 2, 2, 6, 5, 10, 11, 15, 23, 18, 6, 10 };
        System.out.println("Duplicate Elements are:");
        DuplicateElements.findAndPrintDuplicates(arr);
    }
    static int[] findAndPrintDuplicates(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
		return arr;
    }
}

