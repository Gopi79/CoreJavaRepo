package com.stringTaskPrograms;

public class SearchingChar 
{
	public static void main(String[] args) 
	{
		String s = "Believe in yourself";
		int firstindex = s.indexOf('e');
		System.out.println("First occurrence of char 'e'" + "is found at :" + firstindex);
		int lastIndex = s.lastIndexOf('e');
		System.out.println("Last occurrence of char 'e' is" + " found at : " + lastIndex);
		int first_index = s.indexOf('e', 6);
		System.out.println("First occurrence of char 'e'" + " after index 6 : " + first_index);
		int char_at = s.charAt(6);
		System.out.println("Character at location 6: " + char_at);
	}
}
