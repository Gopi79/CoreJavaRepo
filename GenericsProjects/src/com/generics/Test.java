package com.generics;

public class Test <T>
{
	
	T obj;
	
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}
	public static void main(String[] args) 
	{
		Test<Integer> t1=new Test<>();
		t1.add(10);
		System.out.println(t1.get()); // 10
		
		Test<String> t2=new Test<>();
		t2.add("Hi Hello");
		System.out.println(t2.get()); // Hi Hello
	}
}
