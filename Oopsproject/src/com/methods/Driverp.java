package com.methods;

class Driverp {

	void print(Player p1) 
	{
		System.out.println(p1.id + "--" + p1.name + "--" + p1.age);
	}
	public static void main(String[] args)
	{
		Driverp d = new Driverp();
		Player p2 = new Player();
		p2.id = 101;
		p2.name = "raj";
		p2.age = 20;
		d.print(p2);
	}

}
