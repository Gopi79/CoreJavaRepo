package com.stringTaskPrograms;

public class PrintEvenLengthWords 
{
	public static void main(String[] args) 
	{
		String str = "Boppudi gopi krishna";
		printWords(str);
	}
	public static void printWords(String s)
	{
		for (String word : s.split(" "))
		{
			if (word.length() % 2 == 0)
				System.out.println(word);
		}
	}
}
