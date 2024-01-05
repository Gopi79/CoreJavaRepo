package com.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class clz = Class.forName("com.reflections.Employe");
		
		Field[] declaredFields = clz.getDeclaredFields();
		for(Field field:declaredFields)
		{
			System.out.println(field.getName());
		}
		
		System.out.println("--------------------------------------");
		
		Method[] declaredMethods = clz.getDeclaredMethods();
		for(Method method:declaredMethods)
		{
			System.out.println(method.getName());
		}
		
		System.out.println("--------------------------------------");
		Constructor[] declaredConstructors = clz.getDeclaredConstructors();
		for(Constructor constructor:declaredConstructors)
		{
			System.out.println(constructor.getName());
		}
	}
}
