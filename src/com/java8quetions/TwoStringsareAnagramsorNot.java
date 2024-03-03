package com.java8quetions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStringsareAnagramsorNot 
{
	public static void main(String[] args)
	{
		String s1="silent";
		String s2="listen";
		
		s1=Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		
		if(s1.equals(s2))
			System.out.println("Two String are Anagram.");
		else
			System.out.println("Two String are Not Anagram.");
	}
}