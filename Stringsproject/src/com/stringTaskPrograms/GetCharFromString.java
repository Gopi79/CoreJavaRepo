package com.stringTaskPrograms;

public class GetCharFromString 
{
	public static void main(String[] args) 
	{
		String str = "Vtalent";
		int index = 4;
		char ch = getCharFromString(str, index);
		System.out.println("Character from " + str + " at index " + index + " is " + ch);
	}
	static char getCharFromString(String str, int index) 
	{
		return str.charAt(index);
	}
}
