package com.predicateinterface;

import java.util.function.Predicate;

//Write a predicate to check whether the given integer is greater than 10 or not.
public class Test 
{
	public static void main(String[] args) 
	{
		Predicate<Integer>p=a->a>10;
		boolean result = p.test(20);
		System.out.println(result); //true
		System.out.println(p.test(7)); //false
		//System.out.println(p.test(true)); //Compile Time Error
	}
}