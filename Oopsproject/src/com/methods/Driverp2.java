package com.methods;

class Driverp2
{
	public static void main(String[] args)
	{
		Driverp2 d = new Driverp2();
		Person2 person = d.m1(120);
		System.out.println(person.id + "--" + person.name);
	}
	Person2 m1(int id)
	{
		Person2 p = new Person2();
		if (id == 101)
		{
			p.id = 101;
			p.name = "Raju";
			p.age = 30;
		}
		else if (id == 102)
		{
			p.id = 102;
			p.name = "Rani";
			p.age = 32;
		}
		return p;
	}
}
