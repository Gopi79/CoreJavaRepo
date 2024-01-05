package com.basicexamples;

import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) 
	{
		
		ArrayList al=new ArrayList();
		
		al.add(new Student(101, "Ram"));
		al.add(new Student(102, "John"));
		al.add(10);
		al.add(6.50);
		al.add(new Customer());
		
		String li=al.toString();
		System.out.println(li);
		
//		int[] arr=new int[5];
//		
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		//arr[5]=60; ArrayIndexOutOfBoundException--->size
//		
//		Student s1=new Student();
//		Student s2=new Student();
//		
//		
//		Customer c1=new Customer();
//		Customer c2=new Customer();
//		
//		
//		Student[] stu=new Student[2];
//		
//		stu[0]=s1;
//		//stu[1]=c1;  Type Problem
//		
//		String[] str=new String[2];
//		String st="John";
//		str[0]=st;
//		str[1]="Mark";
//		
//		//By using Object to store any type of Data.
//		Object[] obj=new Object[5];
//		obj[0]=s2;
//		obj[1]=c2;
//		obj[2]="ram";
//		obj[3]=st;
		
	}
}
