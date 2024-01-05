package com.stringTaskPrograms;

import java.util.Arrays;

public class StringtoCharArray 
{
	public static void main(String[] args) 
	{
		String str = "Navya";
		char[] chArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) 
		{
			chArray[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(chArray));
	}
}
