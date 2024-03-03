package com.constructorreference;

public class Test 
{	
	public static void main(String[] args)
	{
		Interf f=Sample::new;
		f.get("Alex");
	}
}