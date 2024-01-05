package com.conditiionalstatements;

import java.util.Scanner;

public class Leap_year 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Year:");
		int year=sc.nextInt();
		
		if((year%4==0)&&(year%100!=0)||(year%400==0))
			System.out.println("Leap year");
		else
			System.out.println("Not-Leap year");
		sc.close();
	}
}
