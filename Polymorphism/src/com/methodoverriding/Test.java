package com.methodoverriding;

public class Test 
{
	public static void main(String[] args) 
	{
		Father f=new Father();
		f.displayfun();
		Child c=new Child();
		c.displayfun();
	}
}
