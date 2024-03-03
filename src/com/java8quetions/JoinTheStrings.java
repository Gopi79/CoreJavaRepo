package com.java8quetions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinTheStrings 
{
	public static void main(String[] args){
		List<String> l=Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String collect = l.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(collect);
	}
}