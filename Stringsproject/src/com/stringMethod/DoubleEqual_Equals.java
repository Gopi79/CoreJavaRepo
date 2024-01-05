package com.stringMethod;

public class DoubleEqual_Equals 
{
	public static void main(String[] args) 
	{
		String s1 ="gopi";
		String s2 ="krishna";
		String s3="gopi";
		String s4 ="krishna";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
	}
}
