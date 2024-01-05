package com.clone;

public class Person implements Cloneable
{
	public static void main(String[] args) throws Exception
	{
		Person p=new Person();
		System.out.println(p);
		
		Object obj=p.clone();//another approach to create Object
		System.out.println(obj);
	}
}
