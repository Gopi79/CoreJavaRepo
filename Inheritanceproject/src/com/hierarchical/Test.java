package com.hierarchical;

public class Test 
{
	public static void main(String[] args) 
	{
		Son s=new Son();
		s.display();
		s.m1();
		Daughter d=new Daughter();
		d.show();
		s.m1();
		Son2 s2=new Son2();
		s2.printf();
		s2.m1();
	}
}
