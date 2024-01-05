package com.ArrayListexamples;

import java.util.ArrayList;
import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		
		Student stu1=new Student(101, "Ram");
		Student stu2=new Student(102, "John");
		Student stu3=new Student(103, "Mark");
		Student stu4=new Student(104, "Alex");
		
		l1.add(stu1);
		l1.add(stu2);
		l1.add(stu3);
		l1.add(stu4);
		
		//System.out.println(l1);
		
		//l1.remove(stu2);
		
		//System.out.println(l1);
		
		List l2=new ArrayList();
		
		l2.add(10);
		l2.add(20);
		l2.add(30);
		
		l2.addAll(l1);
		
		
		List l3=new ArrayList();
		
		l3.add("ABA");
		l3.add("AAB");
		l3.add("BBC");
		
		l3.add(2, l1);
		
		l3.addAll(1,l2);
		
		System.out.println(l3);
		
		
		
//		Object[] arr = l3.toArray();
//		
//		for(Object x:arr)
//		{
//			System.out.println(x);
//		}
		
		
//		if(l2.isEmpty())
//		{
//			System.out.println("ArrayList is Empty.");
//		}
//		else
//		{
//			System.out.println(l2);
//		}
//		int s = l2.size();
//		System.out.println(s);
		
		
		l2.retainAll(l1);
		
		System.out.println(l2);
		
//		l2.clear();
		
		
		//l2.removeAll(l1);
		
//		boolean result = l1.contains(l2);
	
//		System.out.println(result);
		
//		boolean resul = l2.contains(stu4);
		
//		System.out.println(resul);
		
//		boolean conresult = l2.containsAll(l1);
		
//		System.out.println(conresult);
		
		
		
	}
}
