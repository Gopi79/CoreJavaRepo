package org.ArraysusingMethods;

public class EvenOrOdd 
{
	public static void main(String[] args)
	{
		int[] a = { 2, 5, 6, 9, 10 };
		System.out.println("Even Numbers:");
		EvenOrOdd.printEvenNumbers(a);
		System.out.println("\nOdd Numbers");
		EvenOrOdd.printOddNumbers(a);
	}
	static int[] printEvenNumbers(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");
		}
		return arr;
	}
	static int[] printOddNumbers(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 != 0)
				System.out.print(arr[i] + " ");
		}
		return arr;
	}
}
