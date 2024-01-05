package com.weakHashMap;

public class Temp {
	@Override
	public String toString() 
	{
		return "Temp";
	}
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("GC calling..");
	}
}
