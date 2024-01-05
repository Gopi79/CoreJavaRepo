package com.tostring;

public class Test 
{
	@Override
	public String toString()
	{
		return "toString Overriding method";
		
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(t.toString());
	}
}
