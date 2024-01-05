package com.stringMethod;

public class ContentEqualDemo 
{
	public static void main(String[] args) 
	{
		String str1="ILOVEMYINDIA";
		System.out.println(str1.contentEquals("ILOVEMYINDIA"));
		System.out.println(str1.contentEquals("LOVE"));
		StringBuffer sb = new StringBuffer("ILOVEMYiNDIA");
		System.out.println(str1.contentEquals(sb));
	}
}
