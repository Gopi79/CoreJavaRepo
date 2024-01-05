package com.stringsusingmethods;

public class FindTheFirstNonRepeatedCharacter 
{
	public static void main(String[] args)
	{
		String str = "ammahi";
		char firstNonRepeatedChar = FindTheFirstNonRepeatedCharacter.findFirstNonRepeatedChar(str);

		if (firstNonRepeatedChar != '\0')
			System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
		else 
			System.out.println("There are no non-repeated characters in the string");
	}
	static char findFirstNonRepeatedChar(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			char chr = str.charAt(i);
			boolean isRepeated = false;

			for (int j = 0; j < str.length(); j++)
			{
				if (i != j && chr == str.charAt(j))
				{
					isRepeated = true;
					break;
				}
			}
			if (!isRepeated)
				return chr;
		}
		return '\0';
	}
}
