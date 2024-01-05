package com.ArrayListexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Demo 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<>();
		l.add("Alex");
		l.add("Mark");
		l.add("Jhon");
		l.add("Ram");
		
		Object[] array = l.toArray();
		
		System.out.println("Name : "+array[2]);
		
		List<String> l1=new ArrayList<>(l);
		l1.add("Krishna");
		l1.add("Teja");
		
		Collections.shuffle(l1);
		
//		for(String x:l)
//		{
//			System.out.println(x);
//		}
		
		//l.forEach(item->System.out.println(item));
		
		l1.forEach(System.out::println);
		
//		Iterator<String> li=l.iterator();
//		while (li.hasNext()) {
//			String item = li.next();
//			System.out.println(item);
//		}
		
	}
}
