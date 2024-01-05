package com.getclass;

public class User 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
	{
		User u=new User();
		Class clz=u.getClass();
		System.out.println(clz.getName());
		System.out.println(u.getClass().getName());
		
		Object obj=clz.newInstance();
		System.out.println(obj);
	}
}
