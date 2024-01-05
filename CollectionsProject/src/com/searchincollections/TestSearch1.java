package com.searchincollections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSearch1 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("Z");
		a.add("A");
		a.add("M");
		a.add("K");
		a.add("a");
		
		System.out.println(a); // [Z, A, M, K, a]
		Collections.sort(a);
		System.out.println(a);// [A, K, M, Z, a]
		
		System.out.println(Collections.binarySearch(a, "Z")); // 3
		
		System.out.println(Collections.binarySearch(a, "J")); // -2
		
	}
}
