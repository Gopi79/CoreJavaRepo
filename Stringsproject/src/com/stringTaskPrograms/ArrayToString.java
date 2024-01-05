package com.stringTaskPrograms;

import java.util.Arrays;

public class ArrayToString 
{
	public static void main(String[] args)
	{
		boolean[] boolArr = { true, false, false, true };
        char[] charArr =  { 'G', 'o', 'p', 'i'};
        double[] dblArr = { 1, 2, 4,6};
        int[] intArr = {3,5,7,9};
        Object[] objArr = { 0,1,3,7};
 		System.out.println("Boolean Array: " + Arrays.toString(boolArr));
		System.out.println("Character Array: " + Arrays.toString(charArr));
		System.out.println("Double Array: " + Arrays.toString(dblArr));
		System.out.println("Integer Array: " + Arrays.toString(intArr));
		System.out.println("Object Array: " + Arrays.toString(objArr));
	}
}
