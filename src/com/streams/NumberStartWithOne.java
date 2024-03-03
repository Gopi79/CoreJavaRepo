package com.streams;

import java.util.Arrays;
import java.util.List;

public class NumberStartWithOne
{
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		list.stream().map(s->s+"").filter(i->i.startsWith("1")).forEach(System.out::println);
	}
}