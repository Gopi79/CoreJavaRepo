package com.stringTaskPrograms;

public class SortingString 
{
	public static void main(String[] args) 
	{
		String str = "gopikrishna";
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;
		while (i < arr.length) 
		{
			int j = i + 1;
			while (j < arr.length) 
			{
				if (arr[i] > arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}
		System.out.println(arr);
	}
}
