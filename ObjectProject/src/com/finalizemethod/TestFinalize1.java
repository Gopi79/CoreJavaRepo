package com.finalizemethod;

public class TestFinalize1
{
	public static void main(String[] args) 
	{
		String str1 = new String("CS");
		str1 = null;
		System.gc();
		System.out.println("output of main method");
	}
	@Override
	protected void finalize()
	{
		System.out.println("output of finalize method");
	}
}
