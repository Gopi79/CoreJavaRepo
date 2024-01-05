package com.stringDemo;

public class Strings_New 
{
	public static void main(String[] args) 
	{
		String s1= new String("GOPI");
		String s2 = new String("gopi");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		String s3 = new String("gopi");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		s3="krishna";
		System.out.println(s2.hashCode()==s3.hashCode());
	}
}
