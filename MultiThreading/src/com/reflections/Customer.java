package com.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Customer 
{
	public static void main(String[] args) throws Exception 
	{
		//------------------------fields------------------
		Class car_clz = Class.forName("com.reflections.Car");
		
		Object car_obj = car_clz.newInstance();
		
		Field car_field = car_clz.getDeclaredField("carName");
		
		car_field.setAccessible(true);
		
		car_field.set(car_obj,"VOLVO");
		
		Car c=(Car) car_obj;
		c.getCarName();
		//-----------------------methods--------------------
		Method[] allMethods = car_clz.getDeclaredMethods();
		
		for(Method m:allMethods)
		{
			if(m.getName().equals("getCarPrice"))
			{
				m.setAccessible(true);
				m.invoke(car_obj,450000);
			}
			
		}
	}
}
