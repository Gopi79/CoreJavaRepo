package com.presentation;

import java.util.Hashtable;
import java.util.Set;

public class HashtableTest 
{
	public static void main(String[] args) 
	{
		/*
		 * Hashtable<String, Integer> marks=new Hashtable<>(); marks.put("Naveen", 100);
		 * marks.put("Tom", 200); marks.put("Lisa", 300); marks.put("Peter", 400);
		 * marks.put("Robby", 600);
		 * 
		 * for(String key: marks.keySet()) { int code=marks.get(key).hashCode();
		 * System.out.println(code); }
		 */
		Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(100, "Naveen");
        hashtable.put(2, "two");
        hashtable.put(3, "three");

        for (Integer key : hashtable.keySet()) {
            int hashCode = hashtable.get(key).hashCode();
            System.out.println(hashCode);
        }
	}
}
