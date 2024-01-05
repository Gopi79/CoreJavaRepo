package com.stringTaskPrograms;

public class IsStrOnlyAlphabet 
{
	public static void main(String[] args) 
	{
		IsStrOnlyAlphabet isa = new IsStrOnlyAlphabet();
		System.out.println(isa.isStringOnlyAlphabet("vtalent"));
	}
	public static boolean isStringOnlyAlphabet(String str) 
	{
		if (str == null || str.equals(""))
			return false;
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (!(ch >= 'A' && ch <= 'Z') && (!(ch >= 'a' && ch <= 'z')))
				return false;
		}
		return true;
	}
}
