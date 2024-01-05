package com.methods;

class Driver3 {
	void print(Docter d)
	{
		System.out.println(d.name + " " + d.age);
	}
	public static void main(String[] args)
	{
		Driver3 d = new Driver3();
		Docter d1 = new Docter();
		d1.name = "Rathod";
		d1.age = 29;
		d.print(d1);
	}
}
