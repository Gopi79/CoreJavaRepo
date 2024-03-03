package com.staticmethods;

public class Test //implements Interf
{
	public static void main(String[] args)
	{
		Test t=new Test();
		//t.sum(10,20); // Compile Time Error
		//Test.sum(10,20); //Compile Time Error
		Interf.sum(10, 20); //30
	}
}
