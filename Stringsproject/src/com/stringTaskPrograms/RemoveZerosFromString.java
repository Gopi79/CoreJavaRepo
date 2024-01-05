package com.stringTaskPrograms;

public class RemoveZerosFromString 
{
	public static void main(String[] args) 
	{
		String str ="0001656656";
		str=removeZero(str);
		System.out.println(str);
	}
	public static String removeZero(String str) 
	{
		int i=0;
		while(i<str.length()&&str.charAt(i)=='0') {
			i++;
		}
		StringBuffer sb = new StringBuffer(str);
		sb.replace(0, i, "");
		return sb.toString();
	}
}
