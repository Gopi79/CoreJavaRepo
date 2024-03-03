package com.predicateinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoTest 
{
	public static void main(String[] args)
	{
		List<String> l=Arrays.asList("Acting","AirForce","Aprial","Apple");
		
		Predicate<String> p=str->str.startsWith("Ap");
		
		for(String s:l)
		{
			if(p.test(s))
				System.out.println(s);
		}
	}
}
