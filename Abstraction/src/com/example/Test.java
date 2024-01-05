package com.example;

public class Test
{
	public static void main(String[] args) 
	{
		//senario 1
		Child ch=new Child();
		ch.m1();
		ch.m2();
		ch.m3();
		ch.m4();
		//senario 2
		Parent pa=new Child();
		pa.m1();
		pa.m2();
		
		//senario 3
		Child che=new Parent();
		che.m1();
		che.m2();
		che.m3();
		che.m4();
	}
}
