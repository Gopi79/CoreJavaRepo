package com.mapexamples;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class TestIdentitiyHashMap 
{
	public static void main(String[] args) 
	{
		//In this case .equals will compare content in Objects
		HashMap m=new HashMap();
		
		Integer i1=new Integer(1);
		Integer i2=new Integer(1);
		
		m.put(i1, "Alex");
		m.put(i2, "Seri");
		
		System.out.println(m);
		
		
		//In this case == coperator compares Object references
		IdentityHashMap ihm=new IdentityHashMap();
		
		
		ihm.put(i1, "Alex");
		ihm.put(i2, "Seri");
		
		System.out.println(ihm);
	}
}
