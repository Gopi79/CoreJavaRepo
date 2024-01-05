package com.stringDemo;

public class Test1 {
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1("shiva");
		Test1 t2 = new Test1("shiva");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
	Test1(String s) {
		super();
	}
}
