package com.defaultmethods;

public interface Left 
{
	default void m1()
	{
		System.out.println("Left Default Method m1");	
	}
}
