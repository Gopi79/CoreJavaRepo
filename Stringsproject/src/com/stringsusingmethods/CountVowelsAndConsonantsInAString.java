package com.stringsusingmethods;

public class CountVowelsAndConsonantsInAString
{

	public static void main(String[] args)
	{
		String input = "Hello World";
		input = input.toLowerCase();
		int vowelCount = CountVowelsAndConsonantsInAString.countVowels(input);
		int consonantCount = CountVowelsAndConsonantsInAString.countConsonants(input);
		System.out.println("Vowel Count: " + vowelCount);
		System.out.println("Consonant Count: " + consonantCount);
	}
	static int countVowels(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (isVowel(ch))
				count++;
		}
		return count;
	}
	static int countConsonants(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (isConsonant(ch))
				count++;
		}
		return count;
	}
	static boolean isVowel(char ch)
	{
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
	static boolean isConsonant(char ch)
	{
		return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
	}
}
