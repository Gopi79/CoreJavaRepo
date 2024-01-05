package com.stringTaskPrograms;

public class StringToBoolean 
{
	public static void main(String[] args) 
	{
		String str = "yes";
		System.out.println(stringToBoolean(str));
		str = "true";
		System.out.println(stringToBoolean(str));
		str = "gopi";
		System.out.println(stringToBoolean(str));
	}
	public static boolean stringToBoolean(String str) 
	{
		boolean b1 = Boolean.parseBoolean(str);
		return b1;
	}
}
