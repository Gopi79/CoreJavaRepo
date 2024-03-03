package com.function;

import java.util.function.Function;

public class Demodiv 
{
	public static void main(String[] args)
	{
		Function<Integer, Double> f=num->num/2.0;
		Double result = f.apply(23);
		System.out.println(result);
	}
}