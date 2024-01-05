package com.stringTaskPrograms;

public class ChartoString {
	public static void main(String[] args) 
	{
		char ch = 'a';
		System.out.println(ch);
		String str = "" + ch;
		System.out.println("Char To String using Concatenation:" + str);
		char c = 'b';
		String s = Character.toString(c);
		System.out.println("Using toStringMethod:" + s);
	}
}
