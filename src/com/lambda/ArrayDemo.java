package com.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(205);
		al.add(102);
		al.add(98);
		al.add(275);
		al.add(203);
		
		System.out.println("Befour ArrayList "+al);
		
		Collections.sort(al,(obj1,obj2)->(obj1>obj2)?-1:(obj1<obj2)?1:0);
		
		System.out.println("After ArrayList "+al);
		
	}
}
