package com.encap;

public class Sdetails 
{
	public static void main(String[] args)
	{
		Student stu=new Student();
		stu.setSid(101);
		stu.setName("Ram");
		System.out.println(stu.getSid()+" "+stu.getName());
	}
}
