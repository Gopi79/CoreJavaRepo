package com.java8quetions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumandMinimum 
{
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer max = l.stream().max(Comparator.naturalOrder()).get();
		Integer min = l.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Maximum:"+max);
		System.out.println("Minimum:"+min);
	}
}
