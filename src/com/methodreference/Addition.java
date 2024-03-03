package com.methodreference;

public class Addition 
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void addition(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void main(String[] args)
	{
		//static method ref
		Interf f=Addition::add;
		f.sum(10, 20);
		//non static or instance Method ref
		Addition a=new Addition();
		Interf f1=a::addition;
		f1.sum(100, 200);
	}
}