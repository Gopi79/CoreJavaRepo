package com.stringTaskPrograms;

public class RemoveWord 
{
	public static void main(String[] args) 
	{
		String str ="My name gopi";
		String word ="name";
		remove(str,word);
	}
	public static void remove(String str,String word) {
		String[] StringArray =str.split(" ");
		String new_str="";
		for(String str1:StringArray)
		{
			if(!str1.equals(word))
				new_str +=str1+" ";
		}
		System.out.println(new_str);
	}
}
