package com.defaultmethods;

public interface Interf 
{
	default void m2() {
		System.out.println("Default Method m2");
	}
}
