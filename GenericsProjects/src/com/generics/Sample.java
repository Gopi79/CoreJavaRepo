package com.generics;

public class Sample <T1,T2>
{
	
	T1 obj1;
	T2 obj2;
	
	Sample(T1 obj1,T2 obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	
	void print()
	{
		System.out.println(obj1+"-----"+obj2);
	}
	
	public static void main(String[] args)
	{
		Sample<Integer,String> t1=new Sample<>(100,"Alex"); //100-----Alex
		t1.print();
		
		Sample<String,Float> t2=new Sample<>("Lavender",1.34f);//Lavender-----1.34
		t2.print();
		
		Sample<String,Boolean>t3=new Sample<>("Mark",true);//Mark-----true
		t3.print();	
	}
}
