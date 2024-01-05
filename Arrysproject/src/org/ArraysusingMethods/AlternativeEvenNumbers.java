package org.ArraysusingMethods;

public class AlternativeEvenNumbers
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 9, 20, 66, 12, 16, 13, 45, 98, 39, 36 };
		AlternativeEvenNumbers.printAlternativeEvenNumbers(arr);
	}
	static int[] printAlternativeEvenNumbers(int[] arr)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				count++;
				if (count % 2 != 0)
					System.out.print(arr[i] + " ");
			}
		}
		return arr;
	}
}