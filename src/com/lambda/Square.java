package com.lambda;

import java.util.function.Function;

public class Square
{
	public static void main(String[] args) 
	{
		Function<Integer, Integer> square=(x)->x*x;
		Integer result = square.apply(4);
		System.out.println(result);
	}
}