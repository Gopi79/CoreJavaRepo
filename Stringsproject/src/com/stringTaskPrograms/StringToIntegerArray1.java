package com.stringTaskPrograms;

import java.util.Arrays;

public class StringToIntegerArray1 
{
	public static void main(String[] args) 
	{
		String str="1 5 6 11 13 15";
		int[] array =method(str);
		System.out.println("String:"+str);
		System.out.println(Arrays.toString(array));
	}
	public static int[] method(String str) 
	{
		String[] splitArray =str.split(" ");
		int[] array =new int[splitArray.length];
		for(int i =0;i<splitArray.length;i++)
		{
			array[i]=Integer.parseInt(splitArray[i]);
		}
		return array;
	}
}
