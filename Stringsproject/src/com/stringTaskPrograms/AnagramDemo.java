package com.stringTaskPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AnagramDemo 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter String-1");
		String s1 = br.readLine();
		char ch1[] = s1.toCharArray();
		System.out.print("Enter String-2");
		String s2 = br.readLine();
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result = Arrays.equals(ch1, ch2);
		if (result == true)
			System.out.println("Given Strings are Anagrams");
		else
			System.out.println("Given Strings are not Anagrams");
	}
}
