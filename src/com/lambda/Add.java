package com.lambda;

import java.util.function.BiFunction;

public class Add 
{
	public static void main(String[] args)
	{
		BiFunction<Integer, Integer,Integer> add=(a,b)->a+b;
		Integer result= add.apply(10,20);
		System.out.println(result);
	}
}
