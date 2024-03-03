package com.java8quetions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// remove duplicate elements from a list 
public class RemoveDuplicateElementsFromList {
	public static void main(String[] args)
	{
		List<String> l=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		l.stream().distinct().collect(Collectors.toList()).forEach(s->System.out.println(s));
	}
}
