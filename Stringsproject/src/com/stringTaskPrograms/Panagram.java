package com.stringTaskPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Panagram 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter String");
		String str = br.readLine();
		allLetter(str);
	}
	public static void allLetter(String str)
	{
		str = str.toLowerCase();
		boolean allLetterPresent = true;
		for (char ch = 'a'; ch <= 'z'; ch++) 
		{
			if (!(str.contains(String.valueOf(ch))))
			{
				allLetterPresent = false;
				break;
			}
		}
		if (allLetterPresent)
			System.out.println("panagram");
		else
			System.out.println("Not- panagram");
	}
}
