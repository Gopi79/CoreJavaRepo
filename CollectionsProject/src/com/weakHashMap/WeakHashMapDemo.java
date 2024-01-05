package com.weakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo 
{
	public static void main(String[] args) throws Exception
	{
		WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"Alex");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(4000);
		System.out.println(m);
	}
}