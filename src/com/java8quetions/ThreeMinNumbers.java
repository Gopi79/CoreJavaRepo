package com.java8quetions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMinNumbers 
{
	public static void main(String[] args)
	{
		List<Integer> ls=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		System.out.println("Minmum Three Numbers In List:");
		ls.stream().sorted().limit(3).forEach(System.out::println);
		
		System.out.println("Maximum Three Numbers In List:");
		ls.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}
}