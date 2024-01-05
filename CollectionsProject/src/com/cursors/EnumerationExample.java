package com.cursors;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationExample 
{
	public static void main(String[] args) 
	{
		//Vector
		System.out.println("=============Vector==========");
		Vector v=new Vector();
		
		v.add(10);
		v.add('A');
		v.add(10.5f);
		v.add("Alex");
		v.add(15000000000L);
		v.add(19.99d);
		
		Enumeration ev=v.elements();
		while(ev.hasMoreElements()) {
			Object obj= (Object)ev.nextElement();
			System.out.println(obj);
		}
		
		//Stack
		System.out.println("===========Stack==============");
		Stack s=new Stack();
		s.push(10);
		s.push('a');
		s.push(3.14f);
		s.push("Lavender");
		s.push(123456789345L);
		s.push(25.25d);
		
		Enumeration es=s.elements();
		while (es.hasMoreElements()) {
			Object ele = (Object) es.nextElement();
			System.out.println(ele);
		}
	}
}
