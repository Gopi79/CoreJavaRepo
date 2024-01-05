package org.ArraysusingMethods;

public class ArrayCumulativeSum 
{
	public static void main(String[] args) 
	{
		int[] arr = { 1, 7, 3, 9, 4, 0, 5 };
		ArrayCumulativeSum.calculateCumulativeSum(arr);
		ArrayCumulativeSum acs=new ArrayCumulativeSum();
		acs.printArray(arr);
	}
	static int calculateCumulativeSum(int[] ar)
	{
		int sum = 0;
		for (int i = 0; i < ar.length; i++)
		{
			sum += ar[i];
			ar[i] = sum;
		}
		return sum;
	}
	int[] printArray(int[] arr1)
	{
		for (int x : arr1)
		{
			System.out.print(x + " ");
		}
		return arr1;
	}
}
