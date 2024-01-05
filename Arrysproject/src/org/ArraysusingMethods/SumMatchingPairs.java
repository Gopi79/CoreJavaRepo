package org.ArraysusingMethods;

public class SumMatchingPairs
{
	public static void main(String[] args)
	{
		int[] arr = { 3, 5, 1, 6, 2, 7, 9 };
		int sum = 8;
		SumMatchingPairs.findPairsWithSum(arr,sum);
	}
	static int[] findPairsWithSum(int[] arr, int targetSum)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] + arr[j] == targetSum)
					System.out.println(arr[i] + "+" + arr[j] + "=" + targetSum);
			}
		}
		return arr;
	}
}
