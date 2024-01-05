package com.methods;

class Driver1
{
	public static void main(String[] args)
	{
		Driver1 d = new Driver1();
		Person p = d.m1();
		System.out.println(p.id + "--" + p.name + "--" + p.age);
	}
	Person m1() 
	{
		Person p = new Person();
		p.id = 101;
		p.name = "Rani";
		p.age = 32;
		return p;
	}
}
