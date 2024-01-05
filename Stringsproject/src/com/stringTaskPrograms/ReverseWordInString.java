package com.stringTaskPrograms;

public class ReverseWordInString 
{
	public static void main(String[] args) 
	{
		String str ="JavaTech";
		System.out.println("Original Stting:"+str);
		System.out.println("Reversed String:"+reverse(str));
	}
	public static String reverse(String string) 
	{
		char[] Characters = string.toCharArray();
		int n = Characters.length;
		for(int i=0;i<n/2;i++) 
		{
			char ch =Characters[i];
			Characters[i]=Characters[n-i-1];
			Characters[n-i-1]=ch;	
		}
		return new String(Characters);
	}
}
