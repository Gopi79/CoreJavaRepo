package com.predicateinterface;

import java.util.function.Predicate;

// Write a predicate to check the length of given string is greater than 3 or not.
public class StringLength 
{
	public static void main(String[] args)
	{
		Predicate<String> p=s->s.length()>10;
		boolean result = p.test("Gopikrishna");
		System.out.println(result);// true
		System.out.println(p.test("Gopi")); // false
	}
}
