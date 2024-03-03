package com.predicateinterface;

import java.util.function.Predicate;

public class ArrayPrograme 
{
	public static void m1(Predicate<Integer>p,int[]x)
	{
		for(int a:x)
		{
			if(p.test(a))
				System.out.println(a);
		}
	}
	public static void main(String[] args) 
	{
		int []x= {0,5,10,15,20,25,30};
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=j->j%2==0;
		
		System.out.println("The Number Greater than 10:");
		ArrayPrograme.m1(p1, x);
		System.out.println("The Even Numbers are:");
		ArrayPrograme.m1(p2, x);
		System.out.println("The Numbers Not Greater than 10:");
		ArrayPrograme.m1(p1.negate(), x);
		System.out.println("The Numbers Greater than 10 and Even are:");
		ArrayPrograme.m1(p1.and(p2),x);
		System.out.println("The Number Greater than 10 or Even are:");
		ArrayPrograme.m1(p1.or(p2),x);
	}
}