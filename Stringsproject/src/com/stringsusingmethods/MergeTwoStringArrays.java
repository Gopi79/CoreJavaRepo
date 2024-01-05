package com.stringsusingmethods;

public class MergeTwoStringArrays 
{
    public static void main(String[] args)
    {
        String[] str = {"hi", "hello"};
        String[] str1 = {"java", "strings"};
        String[] mergedArray = mergeArrays(str, str1);
        System.out.println("MergedTwoStringArrays");
        for (int i = 0; i < mergedArray.length; i++)
        {
            System.out.print(mergedArray[i] + " ");
        }
    }
    public static String[] mergeArrays(String[] arr1, String[] arr2)
    {
        String[] mergedArray = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
        {
            mergedArray[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++)
        {
            mergedArray[arr1.length + j] = arr2[j];
        }
        return mergedArray;
    }
}

