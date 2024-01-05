package com.mapexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo 
{
	public static void main(String[] args)
	{
		HashMap h=new HashMap();
		h.put(101, "Jhon");
		h.put(102, "Mark");
//		System.out.println(h.put(101, "Seri"));
		//System.out.println(h);
		
		HashMap h1=new HashMap();
		h1.put("name", "Alex");
//		h1.put(101, "Ram");
		h1.put("Role", "Devloper");
		
		h1.putAll(h); // putAll(map)
		
		Object obj = h1.get("name"); //get(key)
		System.out.println(obj); //output as value 
		
		Object rem = h1.remove("Role"); //remove(key)
		System.out.println(rem); //output as Value of removing key
		
		boolean result_key = h1.containsKey(101); // containsKey(key)
		System.out.println(result_key); //output as True/False
		
		boolean result_value = h1.containsValue("Mark"); //containsValue(value)
		System.out.println(result_value);//output as True/False
		
		boolean result_empty = h1.isEmpty(); //isEmpty()
		System.out.println(result_empty); //output as True/False
		
		int size = h1.size(); //size()
		System.out.println(size); //output as int value
		
//		h1.clear(); //removing all entitys in a map and Output as this {}
		
		Set result_keys = h1.keySet(); // referance.keySet()
		
		System.out.println(result_keys); // output as [101, 102, name]
		
		Collection result_values = h1.values(); // reference.values()
		System.out.println(result_values); // OutPut as [Jhon, Mark, Alex]
		
		Set result_entrySet = h1.entrySet(); //reference.entrySet() 
		System.out.println(result_entrySet); //OutPut as return set of objects [101=Jhon, 102=Mark, name=Alex]
		
		System.out.println(h1);
		
		
	}
}
