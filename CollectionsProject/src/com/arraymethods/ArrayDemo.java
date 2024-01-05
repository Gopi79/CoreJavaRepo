package com.arraymethods;

import java.util.Arrays;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int []a= {10,5,20,11,6};
		System.out.println("Primitive Array Befour Sorting.");// 10 5 20 11 6 
		for(int e:a)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		// 1st method
		Arrays.sort(a);
		System.out.println("Primitive Array After Sorting.");// 5 6 10 11 20 
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//2nd method
		String []sa= {"A","Z","B"};
		System.out.println("Object Array Befour Sorting.");// A Z B
		for(String s:sa)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		
		Arrays.sort(sa);
		System.out.println("Object Array After Sorting."); // A B Z
		for(String st:sa)
		{
			System.out.print(st+" ");
		}
		System.out.println();
		
		//3rd method
		System.out.println("Object Array Befour Sorting."); // A B Z 
		for(String str:sa)
		{
			System.out.print(str+" ");
		}
		System.out.println();
		Arrays.sort(sa, new Mycompar());
		System.out.println("Object Array Befour Sorting."); // Z B A 
		for(String j:sa)
		{
			System.out.print(j+" ");
		}
		
	}
}
