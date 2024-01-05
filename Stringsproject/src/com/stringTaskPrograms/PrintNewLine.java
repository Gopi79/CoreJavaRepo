package com.stringTaskPrograms;

public class PrintNewLine {
	public static void main(String[] args) 
	{
		// using System.lineSeparator();
		String newLine = System.lineSeparator();
		System.out.println("abc" + newLine + "abc");
		// using platform-dependent Newline Character
		System.out.println("navya" + '\n' + "jyothsna");
		// using System.getProperty()
		String newLine1 = System.getProperty("line.seperator");// line.seperator==>parameter
		System.out.println("moksha" + newLine + "Loukya");
		// using Character "%n" with printf()method
		System.out.printf("Amulya%nManasa");
		System.out.println();
		// using System.out.println();
		System.out.println("Java");
		System.out.println("Tech");
	}
}
