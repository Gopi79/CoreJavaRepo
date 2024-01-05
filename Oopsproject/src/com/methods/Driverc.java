package com.methods;

class Driverc
{
	College m1()
	{
		College c = new College();
		c.id = 101;
		c.name = "HITM";
		return c;
	}
	public static void main(String[] args)
	{
		Driverc d = new Driverc();
		College c = d.m1();
		System.out.println(c.id + "--" + c.name);
	}
}
