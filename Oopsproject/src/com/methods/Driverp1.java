package com.methods;

class Driverp1
{
	public static void main(String[] args)
	{
		Driverp1 d = new Driverp1();
		Person1 p = d.m1();
		System.out.println(p.id + "--" + p.name + "--" + p.age);
	}
	Person1 m1()
	{
		Person1 p = new Person1();
		p.id = 101;
		p.name = "Rani";
		p.age = 32;
		return p;
	}
}
