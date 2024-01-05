package org.ArraysusingMethods;

public class LargestNumber
{
    public static void main(String[] args)
    {
        int[] arr = {5, 2, 6, 9, 15, 18, 10};
        int largest = LargestNumber.findLargestNumber(arr);        
        if (largest != Integer.MIN_VALUE)
            System.out.println("The largest number in the array is: " + largest);
        else
            System.out.println("The array is empty.");
    }
    static int findLargestNumber(int[] arr)
    {
        if (arr.length == 0)
            return Integer.MIN_VALUE;
        int largest = arr[0];        
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
}

