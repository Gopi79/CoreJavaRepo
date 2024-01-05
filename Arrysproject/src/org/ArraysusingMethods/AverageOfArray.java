package org.ArraysusingMethods;

public class AverageOfArray
{
	public static void main(String[] args)
	{
		int[] arr = { 55, 65, 75, 95 };
		int average = AverageOfArray.calculateAverage(arr);
		System.out.println(average);
	}
	static int calculateAverage(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum += arr[i];
		}
		if (arr.length != 0)
			return sum / arr.length;
		else
			return 0;
	}
}