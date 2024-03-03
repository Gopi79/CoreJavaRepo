package com.assignmentonstreams;

import java.util.Arrays;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2
{
	//Section 3
	public static void main(String[] args) 
	{
		//1 Find the sum of an array {7, 1, 4} using reduce method of stream
		/*
		 * int arr[]= {7,1,4}; int sum = Arrays.stream(arr).reduce(0,(x,y)->x+y);
		 * System.out.println(sum);
		 */
		
		//2 Find count, sum, min, average, max of given array {7, 2, 19, 88, 73, 4, 10}
		
		/*
		 * //Count int arr[]= {7,2,19,88,73,4,10}; long count =
		 * Arrays.stream(arr).count(); System.out.println("Count:"+count);
		 * 
		 * //Sum int sum = Arrays.stream(arr).sum(); System.out.println("Sum:"+sum);
		 * 
		 * //min OptionalInt min = Arrays.stream(arr).min();
		 * System.out.println("MIN:"+min);
		 * 
		 * //max OptionalInt max = Arrays.stream(arr).max();
		 * System.out.println("MAX:"+max);
		 */
		
		//3 Sort the array {1,0,1,0,1,0,1,1,1,1,1,1} into map 1 as false and 0 as true
		/*
		 * int arr[]= {1,0,1,0,1,0,1,1,1,1,1,1}; Map<Boolean, Long> result =
		 * Arrays.stream(arr) .boxed() .collect(Collectors.groupingBy(num -> num ==
		 * 0,Collectors.counting())); System.out.println(result);
		 */
		
		//4 Count the words from String "I Love You Telangana and I Love India"
		/*
		 * String str="I Love You Telangana and I Love India"; Map<String, Long>
		 * word_count =
		 * Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.
		 * identity(),Collectors.counting())); System.out.println(word_count);
		 */
		
		//5 Find the dstinct names from given array {"raja", "rani", "raja", "rani", "guru"}
		/*
		 * String arr[]={"raja", "rani", "raja", "rani", "guru"};
		 * Arrays.stream(arr).distinct().collect(Collectors.toList()).forEach(System.out
		 * ::println);
		 */
		
		//6 Find the duplicate characters from given String "Javva Devvellopper"
		
		
		
	}
}