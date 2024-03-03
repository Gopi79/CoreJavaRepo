package com.predicateinterface;

import java.util.ArrayList;
import java.util.function.Predicate;

// write a predicate to check whether the given collection is empty or not
public class ArrayListisEmpty 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(5);
		al.add(15);
		al.add(20);
		al.add(35);
		
		Predicate<ArrayList<Integer>> p=arrlist->arrlist.isEmpty();
		boolean result = p.test(al);
		System.out.println(result); //false
	}
}
