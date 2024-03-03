package com.java8quetions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//a list of integers, separate odd and even numbers
public class SeparateOddandEvenNumbersinList 
{
	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean, List<Integer>> OddEvenMap = l.stream().collect(Collectors.partitioningBy(i->i%2==0));
		Set<Entry<Boolean, List<Integer>>> entrySet = OddEvenMap.entrySet();
		for(Entry<Boolean, List<Integer>> entry:entrySet)
		{
			if(entry.getKey())
				System.out.println("Even Numbers:");
			else
				System.out.println("Odd Numbers:");
			List<Integer> list = entry.getValue();
			for(int i:list)
				System.out.println(i);
		}
	}
}