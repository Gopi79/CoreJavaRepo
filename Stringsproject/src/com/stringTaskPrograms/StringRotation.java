package com.stringTaskPrograms;

public class StringRotation
{
	public static void main(String[] args) 
	{
		String str1 = "SAOS";
		String str2 = "SAOS";
		if (areRotations(str1, str2))
			System.out.println("Yes");
		else
			System.out.printf("No");
	}
	static boolean areRotations(String str1, String str2) 
	{
		return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
	}
}
