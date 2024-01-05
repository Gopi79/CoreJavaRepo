package com.hashtable;

import java.util.Hashtable;

public class HashtableDemo 
{
	public static void main(String[] args) 
	{
		Hashtable h=new Hashtable(25); //defalute capacity 11
		//index=hashcode%capacity;
		h.put(new Temp(5), "A");  //5%11= at index 5 //5%9=at index 5
		h.put(new Temp(2), "B");  //2%11=at index 2  //2%9=at index2
		h.put(new Temp(6), "D");	//6%11= at index 6 //6%9=at index 6
		h.put(new Temp(15), "D");	//15%11= at index 4 //15%9=at index 6
		h.put(new Temp(23), "E"); //23%11=at index 1 //23%9=at index 5
		h.put(new Temp(16), "F");	//16%11=at index 5 //16%9=at index 7
		
		System.out.println(h);
	}
}
