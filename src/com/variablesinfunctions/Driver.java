package com.variablesinfunctions;

public class Driver 
{
	int x=100;
	public void m2()
	{
		int y=200;
		Interf f=()->{
			System.out.println(x);
			System.out.println(y);
			x=1000;
			//y=2000; //Compile Time Error
		};
		f.m1();
		//y=2000;
	}
	public static void main(String[] args)
	{
		Driver d=new Driver();
		d.m2();
	}
}