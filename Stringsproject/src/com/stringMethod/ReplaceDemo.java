package com.stringMethod;

public class ReplaceDemo {
	public static void main(String[] args)
	{
		String s1 = "GoodEvening";
		s1.replace("Evening", "Morning");
		System.out.println(s1);
		String s2 = s1.replace("Evening", "Morning");
		System.out.println(s2);
		String s3 = "hi";
		System.out.println(s1.replace(s1, s3));
		System.out.println(s1);
		String s4 = s1.replace(s1, s3);
		System.out.println(s4);
	}
}
