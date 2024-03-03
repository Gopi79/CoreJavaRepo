package com.java8interviewquetions1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test 
{
	public static void main(String[] args) 
	{
		//1 wap to count the occurrences of each character in a string
		
		/*ex:- "ilovejava";
		 * i=1,l=1,0=1,v=2,e=1,j=1,a=2
		 */
		String str="ilovejava";
		//String[] result_str= str.split("");
		//System.out.println(Arrays.toString(result_str));
		//Arrays.stream(result_str)
		Map<String, Long> result_stream = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(result_stream);
		
		//2 wap to find out all duplicate element/character from a given string
		
		List<String> duplicate_char_list = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(s->s.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		//System.out.println(duplicate_char_list);
		
		//3 wap to find out unique character present in a String
		List<String> unique_char_list = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(s->s.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		//System.out.println(unique_char_list);
		
		//4 wap to find first-non repeate character in a String
		String first_non_repeated_char = Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(s->s.getValue()==1)
		.findFirst().get()
		.getKey();
		//System.out.println(first_non_repeated_char);
		
		//5 wap to find first repeated character in a String
		String first_repeted_char = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet()
				.stream()
				.filter(s->s.getValue()>1)
				.findFirst().get()
				.getKey();
		//System.out.println(first_repeted_char);
		
		//6 wap to find second highest number from given array
		/*
		 * ex:-
		 *  int[]arr= {5,9,11,2,8,21,1}
		 *   */
		
		int []number={5,9,11,2,8,21,1};
		Integer second_highest_num = Arrays.stream(number)
			.boxed()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst().get();
			//.collect(Collectors.toList());
		//System.out.println(second_highest_num);
		
		//7 wap to find longest string from given array
		
		/* 
		 * ex:-
		 * String []arr= {"java","techie","springboot","microservices"}; 
		 */
		
		String []strarr= {"java","techie","springboot","microservices"};
		String largest_string_length = Arrays.stream(strarr)
		.reduce((ele1,ele2)->ele1.length()>ele2.length()?ele1:ele2)
		.get();
		//System.out.println(largest_string_length);
		
		//8 wap to find all elements from array who starts with 1
		/* 
		 * ex:-
		 * int []arr= {5,9,11,2,8,21,1}; 
		 */
		int []arr= {5,9,11,2,8,21,1};
		List<String> result_arr = Arrays.stream(arr)
		.boxed()
		.map(s->s+"")
		.filter(s->s.startsWith("1"))
		.collect(Collectors.toList());
		//System.out.println(result_arr);
		
		//String.joining method 
		List<String> numbers = Arrays.asList("1","2","3","4");
		String result = String.join("-", numbers);
		//System.out.println(result);
		
		//skip&limit Example 2-9
		IntStream.range(1, 10)
		.skip(1)
		.limit(8).forEach(System.out::println);
		
		//sort List and Map
		
		//Map and flatMap
		
		
	}
}