package com.stringDemo;

public class HowmanyObjects 
{
	public static void main(String[] args) 
	{
		String s1 ="gopi";
		String s2 ="gopi";
		String s3 = new String("gopi");
		String s4 = new String("gopi");
		String  s5 = new String("krishna");
		String s6 = new String("krishna");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s5==s6);
	}
}
