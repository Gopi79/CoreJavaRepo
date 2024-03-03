package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(1,4,8,6,5,2,9);
		l.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("--------------------");
		l.stream().sorted((l1,l2)->l1>l2?-1:l1<l2?1:0).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-------------");
		Integer min = l.stream().min((l1,l2)->l1<l2?-1:l1>l2?1:0).get();
		System.out.println(min);
		
	}
}
