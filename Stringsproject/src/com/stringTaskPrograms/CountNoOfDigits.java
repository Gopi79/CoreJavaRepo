package com.stringTaskPrograms;

public class CountNoOfDigits 
{
	public static void main(String[] args) 
	{
		String str ="vtalent1234";        
		int digits =0;
		for(int i=0;i<str.length();i++) 
		{
			if(Character.isDigit(str.charAt(i)))
				digits++;
		}
		System.out.println("Total number of Digits: "+digits);
	}
}
