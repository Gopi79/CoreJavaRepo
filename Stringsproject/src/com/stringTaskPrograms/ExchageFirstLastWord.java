package com.stringTaskPrograms;

public class ExchageFirstLastWord 
{
	public static void main(String[] args) 
	{
		String str = "vtalent";
		exchange(str);
	}
	public static void exchange(String str) 
	{
		String first = "";
		int i = 0;
		for (i = 0; i < str.length();) 
		{
			while (str.charAt(i) != ' ') 
			{
				first = first + str.charAt(i);
				i++;
			}
			break;
		}
		String last = "";
		int j = 0;
		for (j = str.length() - 1; j >= i;) 
		{
			while (str.charAt(j) != ' ') 
			{
				last = str.charAt(j) + last;
				j--;
			}
			break;
		}
		System.out.print(last);
		for (int m = j; m >= i; m--) 
		{
			System.out.println(str.charAt(m));
		}
		System.out.println(first);
	}
}
