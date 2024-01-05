package com.methodoverloading;

public class Test 
{
	void add(int x,int y)
	{
		System.out.println("addition: "+(x+y));
	}
	void add(int a,int b,int c)
	{
		System.out.println("addition: "+(a+b+c));
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.add(10, 20);
		t.add(1, 2, 3);
	}
}