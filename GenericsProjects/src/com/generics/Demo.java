package com.generics;

public class Demo <T>
{
	public void m1(T arg) {
		System.out.println("Params Recived :"+arg);
	}
	
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		
		d.m1(10);  //passing int value
		d.m1("hi"); //passing String value
		d.m1(100.51); //passing double value
		d.m1(true); //passing boolean value
	}
}