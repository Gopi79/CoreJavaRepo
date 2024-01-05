package com.conditiionalstatements;
import java.util.Scanner;
public class Alphabets 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Smallercase Alphabet:");
		char alp=sc.next().charAt(0);
		switch (alp) 
		{
			case 'a':System.out.println("apple");break;
			case 'b':System.out.println("bat");break;
			case 'c':System.out.println("cat");break;
			case 'd':System.out.println("dog");break;
			case 'e':System.out.println("elephant");break;
			case 'f':System.out.println("fish");break;
			case 'g':System.out.println("grapes");break;
			case 'h':System.out.println("hen");break;
			case 'i':System.out.println("ice cream");break;
			case 'j':System.out.println("jug");break;
			default:System.out.println("Alphabets are out of range!");
		}
		sc.close();
	}
}
