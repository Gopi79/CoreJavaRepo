package com.mapexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test 
{
	public static void main(String[] args) 
	{
		HashMap m=new HashMap();
		
		m.put(101,"Alex");
		m.put(102,"Jhon");
		m.put(104,"Mark");
		m.put(103,"Ram");
		m.put(105,"Seri");
		
		//HashMap Iteration by using iterator() method
		
		//the HashMap keys are stored in set by using entrySet() method
		Set set1 = m.entrySet();
		
		Iterator itr=set1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1);
		}
	}
}
