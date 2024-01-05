package com.methods;

class Driverpl
{
	public static void main(String[] args)
	{
		Driverpl d = new Driverpl();
		Player1 p = d.m1(45);
		System.out.println(p.id + "--" + p.name + "--" + p.age);
	}
	Player1 m1(int id)
	{
		Player1 p = new Player1();
		if (id == 7)
		{
			p.id = 7;
			p.name = "dhoni";
			p.age = 40;
		}
		else if (id == 18)
		{ 
			p.id = 18;
			p.name = "kohli";
			p.age = 34;
		}
		else if (id == 45)
		{ 
			p.id = 45;
			p.name = "Rohit";
			p.age = 38;
		}
		return p;
	}
}
