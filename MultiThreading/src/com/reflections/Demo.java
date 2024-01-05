package com.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo 
{
	public static void main(String[] args) throws Exception 
	{
		Class clz = Class.forName("com.reflections.Student");
		
		Object obj=clz.newInstance();
		Field field = clz.getDeclaredField("age");
		
		field.setAccessible(true);
		
		field.set(obj,35);
		
		Student s=(Student) obj;
		s.getAge();
		
		
		Method[] allMethods = clz.getDeclaredMethods();
		
		for(Method m:allMethods)
		{
			String mName=m.getName();
			if(mName.equals("getAge"))
			{
				m.invoke(obj);
			}
			if(mName.equals("persionAge"))
			{
				m.setAccessible(true);
				m.invoke(obj, 30);
			}
			
		}
	}
}
