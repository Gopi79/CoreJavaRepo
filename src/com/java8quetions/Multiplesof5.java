package com.java8quetions;

import java.util.Arrays;
import java.util.List;

public class Multiplesof5
{	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		l.stream().filter(i->i%5==0).forEach(System.out::println);
	}
}
