package com.assignmentonstreams;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test 
{
	public static void main(String[] args) 
	{
		//Section 2
		
		//1 Print Integers using Integer Stream
		//Stream.iterate(1,i->i+1).limit(10).forEach(System.out::println);
		
		//2 Print numbers from 1 to 10 by skipping number 5 using streams 
		/*
		 * IntStream.rangeClosed(1,10) .filter(num->num!=5)
		 * .forEach(System.out::println);
		 */
		
		//3 Find sum of first 10 Integers using streams
		/*
		 * int sum = IntStream.rangeClosed(1,10).sum(); System.out.println(sum);
		 */
		
		//4 print the persons whose names starts with "A"
		
		  List<String>names=Arrays.asList("AlBafta", "Ankit", "Kushal", "Brent",
		  "Sarika", "amanda", "Hans", "Shivaika", "Sarah");
		  names.stream().filter(n->n.startsWith("S")).forEach(System.out::println);
		 
			/*
			 * ListIterator<String> lir=names.listIterator(); while(lir.hasNext()) { String
			 * it=lir.next(); if(it.startsWith("A")) { System.out.println(it); } }
			 */
		
		//5 int[] arr = { 2, 4, 6, 8, 10 }; Find the average of squares of the given array
		/*
		 * int[] arr = { 2, 4, 6, 8, 10 }; OptionalDouble average =
		 * Arrays.stream(arr).map(i->i*i).average(); System.out.println(average);
		 */
		
		//6 
		
		
		//7
		
		
	}
}