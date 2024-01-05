package com.stringTaskPrograms;

public class RemoveWordFromString
{
	public static void main(String[] args) 
	{
		String str = "Welcome to the Vtalent";
		String word = "the";
		System.out.println(removeString(str, word));
	}
	public static String removeString(String string, String word) 
	{
		if (string.contains(word))
		{
			String temp = word + " ";
			string = string.replaceAll(temp, "");
		}
		return string;
	}
}
