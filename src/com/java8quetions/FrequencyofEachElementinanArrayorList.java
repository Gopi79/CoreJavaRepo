package com.java8quetions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofEachElementinanArrayorList 
{
	public static void main(String[] args)
	{
		List<String> l=Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		Map<String, Long> collect = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
	}
}