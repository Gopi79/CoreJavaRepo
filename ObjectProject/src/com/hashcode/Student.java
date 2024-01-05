package com.hashcode;

public class Student 
{
	int sid;
	String name;
	public static void main(String[] args)
	{
		Student stu=new Student();
		stu.sid=10;
		stu.name="Ram";
		System.out.println(stu);
		System.out.println(stu.toString());
		System.out.println(stu.hashCode());
	}
	
	@Override
	public String toString()
	{
		return sid+"--"+name;
	}
	
	@Override
	public int hashCode()
	{
		return sid;
	}
}
