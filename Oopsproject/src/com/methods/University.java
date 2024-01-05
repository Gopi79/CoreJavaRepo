package com.methods;

public class University
{
	int id;
	String name;
	public static void main(String[] args)
	{
		University u = m1(101);
		System.out.println(u.id + "--" + u.name);
		String str = u.m2();
		System.out.println(str);
	}
	String m2()
	{
		String s = "hello";
		return s;
	}
	static University m1(int id)
	{
		University u = new University();
		if (id == 101)
		{
			u.id = 101;
			u.name = "Oxford";
		}
		else if (id == 102)
		{
			u.id = 102;
			u.name = "Standford";
		}
		return u;
	}
}